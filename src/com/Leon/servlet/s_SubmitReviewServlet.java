package com.Leon.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Leon.dao.courseDao;
import com.Leon.dao.gradeDao;
import com.Leon.dao.reviewDao;
import com.Leon.entity.Course;
import com.Leon.entity.Grade;

/**
 * Servlet implementation class s_SubmitReviewServlet
 */
@WebServlet("/s_SubmitReviewServlet")
public class s_SubmitReviewServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public s_SubmitReviewServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String id = request.getParameter("id").trim();
		String review = request.getParameter("input_review").trim();
		int cid = -1;
		cid = Integer.parseInt(id); 
		Course course = gradeDao.get(cid);
		reviewDao.save(course,review);
		RequestDispatcher rd=request.getRequestDispatcher("s_review.jsp");
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
