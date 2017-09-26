package com.Leon.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Leon.dao.qaDao;
import com.Leon.entity.Qa;

/**
 * Servlet implementation class s_AskTeacherServlet
 */
@WebServlet("/s_AskTeacherServlet")
public class s_AskTeacherServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public s_AskTeacherServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String sname = request.getParameter("input_sname");
		String tname = request.getParameter("input_tname");
		String question = request.getParameter("input_question");
		Qa qa = new Qa();
		qa.setSname(sname);
		qa.setTname(tname);
		qa.setQuestion(question);
		qaDao.save(qa);
		RequestDispatcher rd=request.getRequestDispatcher("s_askteacher.jsp");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
