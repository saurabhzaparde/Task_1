package com.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;

import com.dao.ConnectionFactory;
import com.pojo.Questions;

public class OrmSubstitute {
	
	public static String sql;
	public static int i;
	
	public static void insert() {
	try {
		Connection con = ConnectionFactory.getCon();
		sql = "insert into Task.Questions(question,answer_1,answer_2,answer_3,answer_4,correct_ans) "
				+ "values('Which component is used to compile, "
				+ "debug and execute the java programs?','JDK','JRE','JVM','JIT','JDK')";
		Statement st= con.createStatement();
   //	System.out.println(sql);
		i = st.executeUpdate(sql);
		 }
	catch (Exception e) {
		System.out.println("OrmSubstitute"+e);
	 
	}
	finally {
		try {
			Connection con = ConnectionFactory.getCon();
			sql = "insert into Task.Questions(question,answer_1,answer_2,answer_3,answer_4,correct_ans) "
					+ "values('Which one of the following is not a Java feature?','Portable','Object-oriented','Use of pointers','Dynamic and Extensible','Use of pointers')";
			Statement st= con.createStatement();
	   //	System.out.println(sql);
			i = st.executeUpdate(sql);
			 }
		catch (Exception e) {
			System.out.println("OrmSubstitute"+e);
		 
		}
		finally {
			try {
				Connection con = ConnectionFactory.getCon();
				sql = "insert into Task.Questions(question,answer_1,answer_2,answer_3,answer_4,correct_ans) "
						+ "values('What Type Of Language is JS ?','FrontEnd','BackEnd','Scripting','None of the above','Scripting')";
				Statement st= con.createStatement();
		   //	System.out.println(sql);
				i = st.executeUpdate(sql);
				 }
			catch (Exception e) {
				System.out.println("OrmSubstitute"+e);
			 
			}
			finally {
				try {
					Connection con = ConnectionFactory.getCon();
					sql = "insert into Task.Questions(question,answer_1,answer_2,answer_3,answer_4,correct_ans) "
							+ "values('Which of these cannot be used for a variable name in Java?',"
							+ "'identifier & keyword','identifier','keyword','none of the mentioned','keyword')";
					Statement st= con.createStatement();
			   //	System.out.println(sql);
					i = st.executeUpdate(sql);
					 }
				catch (Exception e) {
					System.out.println("OrmSubstitute"+e);
				 
				}
				finally {
					try {
						Connection con = ConnectionFactory.getCon();
						sql = "insert into Task.Questions(question,answer_1,answer_2,answer_3,answer_4,correct_ans) "
								+ "values(' What is the extension of java code files?',"
								+ "'.js','.txt','.class','.java','.java')";
						Statement st= con.createStatement();
				   //	System.out.println(sql);
						i = st.executeUpdate(sql);
						 }
					catch (Exception e) {
						System.out.println("OrmSubstitute"+e);
					 
					}
				}
			}
		}
	}
	}	
}

