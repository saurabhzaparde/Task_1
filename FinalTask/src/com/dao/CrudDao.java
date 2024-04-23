package com.dao;


import java.util.ArrayList;

import com.pojo.Information;
import com.pojo.Questions;

public interface CrudDao {

    public String insertinformation(String name, String email, String mob, int marks);
	
	public String insertquestion(String question, String answer_1, String answer_2, String answer_3, String answer_4, String correct_ans);
		
	public ArrayList<Questions> readallquestions();

	public ArrayList<Information> readinformation(String mob);
	
	
}
