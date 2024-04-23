package com.controller;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


import com.dao.CrudDaoImp;
import com.model.OrmSubstitute;
import com.validation.Verify;


public class Controller extends HttpServlet {
	
	

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session = request.getSession();
		
		
		
	
		String question_1 = request.getParameter("question");
		String answer_choice_1 = request.getParameter("Option_1");
		
		
		String question_2 = request.getParameter("question");
		String answer_choice_2 = request.getParameter("Option_2");
		
		
		String question_3 = request.getParameter("question");
		String answer_choice_3 = request.getParameter("Option_3");
		
		
		String question_4 = request.getParameter("question");
		String answer_choice_4 = request.getParameter("Option_4");
		
	
		String question_5 = request.getParameter("question");
		String answer_choice_5 = request.getParameter("Option_5");
		
		
		System.out.println(question_1+question_2+question_3+question_4);
		System.out.println(answer_choice_1+answer_choice_2+answer_choice_3+answer_choice_4+answer_choice_5);
		
		
		System.out.println("***");
		
		
		String count = new  Verify().check( question_1, answer_choice_1, question_2, answer_choice_2,question_3, answer_choice_3,
				 question_4, answer_choice_4, question_5, answer_choice_5);
		
		System.out.println(count);
		String marks = count;
		if(count!=null) {
		
			session.setAttribute("msg", "Test Completed");
			session.setAttribute("marks", count);
			response.sendRedirect("page_3.jsp");
		}
		else {
			session.setAttribute("msg", "You Failed the Test");
			session.setAttribute("marks", count);
			response.sendRedirect("index.jsp");
		}
	}

}
