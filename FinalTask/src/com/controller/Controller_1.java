package com.controller;

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dao.CrudDaoImp;

/**
 * Servlet implementation class Controller_1
 */
public class Controller_1 extends HttpServlet {
	
	public void destroy() {
		// TODO Auto-generated method stub
	}


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session = request.getSession();
		
		String fname = request.getParameter("fname");
		String email = request.getParameter("email");
		String mob_no = request.getParameter("mob_no");
		String marks = request.getParameter("marks");
		
		int marks_1 = Integer.parseInt(marks);
		String result = new CrudDaoImp().insertinformation(fname, email, mob_no, marks_1);
		
		if(result.equals("inserted")) {
			
			session.setAttribute("msg", "Information Submitted");
			session.setAttribute(mob_no, mob_no);
			response.sendRedirect("page_4.jsp");
		}
		else {
			session.setAttribute("msg", "Try Again Error Occurred");
			response.sendRedirect("page_3.jsp");	
		}
	}

}
