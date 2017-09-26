package com.Leon.servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Leon.dao.loginDao;
import com.Leon.dao.studentDao;
import com.Leon.dao.teacherDao;
import com.Leon.entity.Course;
import com.Leon.entity.Grade;
import com.Leon.entity.Student;
import com.Leon.entity.Teacher;
import com.Leon.entity.User;




/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html; charset = UTF-8");
		String input_username = request.getParameter("input_username").trim();
		String input_password = request.getParameter("input_password").trim();
		String usertype = request.getParameter("usertype").trim();
		User user = new User(input_username,input_password,usertype);
		boolean op  = loginDao.login(user);
		if(op){
		
		switch(usertype){
		case "1" :
			Student stu = studentDao.get(input_username);
			request.setAttribute("stu", stu);
			RequestDispatcher rd=request.getRequestDispatcher("s_index.jsp");
			rd.forward(request, response);
		break;
		case "2":
			
			
			RequestDispatcher rd2=request.getRequestDispatcher("t_index.jsp");
			rd2.forward(request, response);
			break;
		case "3":
			RequestDispatcher rd3=request.getRequestDispatcher("a_index.jsp");
			rd3.forward(request, response);
			break;
		default:
		
		}
		}else{
			RequestDispatcher rd4=request.getRequestDispatcher("test.jsp");
			rd4.forward(request, response);
		}
		
	
	}

}
