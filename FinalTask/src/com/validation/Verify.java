package com.validation;

import java.util.ArrayList;

import com.dao.CrudDaoImp;
import com.pojo.Questions;

public class Verify {

	public  int value = 0;
	
	public  String count;
	
	
	public  String check(String question_1, String answer_choice_1, String question_2,
			String answer_choice_2,  String question_3, String answer_choice_3, String question_4, String answer_choice_4, String question_5, String answer_choice_5) {
		
		CrudDaoImp cdi = new CrudDaoImp();
		ArrayList<Questions> list=cdi.readallquestions();
	
		for(Questions que : list) {
			
			if( question_1.equalsIgnoreCase(que.getQuestion()) 
					&& answer_choice_1.equalsIgnoreCase(que.getCorrect_ans())) {
			    value++;
			    System.out.println(value);
			    if( question_2.equalsIgnoreCase(que.getQuestion()) 
						&& answer_choice_2.equalsIgnoreCase(que.getCorrect_ans())) {
			    	value++;
			    	System.out.println(value);
			    	if( question_3.equalsIgnoreCase(que.getQuestion()) 
							&& answer_choice_3.equalsIgnoreCase(que.getCorrect_ans())) {
			    		value++;
			    		System.out.println(value);
			    		if( question_4.equalsIgnoreCase(que.getQuestion()) 
								&& answer_choice_4.equalsIgnoreCase(que.getCorrect_ans())) {
			    			value++;
			    			System.out.println(value);
			    			if( question_5.equalsIgnoreCase(que.getQuestion()) 
			    					&& answer_choice_5.equalsIgnoreCase(que.getCorrect_ans())) {
			    				value++;
			    				System.out.println(value);
			    			}else {
			     				value = value;
			    			}
			    		}else {
			 				value = value;
		    			}
			    	}else {
		 				value = value;
	    			}
			    }else {
	 				value = value;
    			}
		     }else {
 				value = value;
 			}
		}
		value = 5 - value;
		count=String.valueOf(value);
		System.out.println(count);
		return count;
	}
	
}
