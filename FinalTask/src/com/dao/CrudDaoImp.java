package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.pojo.Information;
import com.pojo.Questions;

public class CrudDaoImp implements CrudDao {

	public static String result;
	
	public static String error;
	
	public static String sql;

	public static Statement st;
	
	public static PreparedStatement ps;
	
	public static ResultSet rs;
	
	int i;
	
	public static ArrayList<Questions> list = new ArrayList<Questions>();
	public static ArrayList<Information> list1 = new ArrayList<Information>();
	
	@Override
	public String insertinformation(String name, String email, String mob, int marks) {
		try {
			Connection con = ConnectionFactory.getCon();
			sql = "insert into Task.Information(fullname,email,mob_no,marks) "
					+ "values(?,?,?,?)";
			ps = con.prepareStatement(sql);
			ps.setString(1, name);
			ps.setString(2, email);
			ps.setString(3, mob);
			ps.setInt(4, marks);
			i = ps.executeUpdate(sql);
			if(i==1) {
				result="inserted";
			}
			 }
		catch (Exception e) {
			System.out.println("CrudDaoImp"+e);
 			error=error+e;
 			result=error;
		 
		}
		finally {
			return result;
			}
	}

	@Override
	public String insertquestion(String question, String answer_1, String answer_2, String answer_3, String answer_4,
			String correct_ans) {
		// TODO Auto-generated method stub
		return null;
	}

	@SuppressWarnings("finally")
	@Override
	public ArrayList<Information> readinformation(String mob) {
		try {
			sql="select * from TASK.Information where mob_no=?";
			Connection con = ConnectionFactory.getCon();
			ps = con.prepareStatement(sql);
			ps.setString(1,mob);
			rs = ps.executeQuery(sql);
			
			while(rs.next())
			{
				Information in = new Information();
			
				in.setId(rs.getInt("id"));
				in.setName(rs.getString("fullname"));
				in.setEmail(rs.getString("email"));
				in.setMob(rs.getString("mob_no"));
				in.setMarks(rs.getInt("marks"));
				list1.add(in);
			}
			
		}catch (Exception e) {
			System.out.println("CrudDaoImp"+e);
 			error=error+e;
 			result=error;	
		}
		finally {
		return list1;
		}
	}


	@SuppressWarnings("finally")
	public ArrayList<Questions> readallquestions() {
		try {
			sql="select * from TASK.QUESTIONS";
			Connection con = ConnectionFactory.getCon();
			Statement st = con.createStatement();
			rs = st.executeQuery(sql);
			
			while(rs.next())
			{
				Questions que = new Questions();
			
				que.setQid(rs.getInt("qid"));
				que.setQuestion(rs.getString("question"));
				que.setAnswer_1(rs.getString("answer_1"));
				que.setAnswer_2(rs.getString("answer_2"));
				que.setAnswer_3(rs.getString("answer_3"));
				que.setAnswer_4(rs.getString("answer_4"));
				que.setCorrect_ans(rs.getString("correct_ans"));
				list.add(que);
			}
			
		}catch (Exception e) {
			System.out.println("CrudDaoImp"+e);
 			error=error+e;
 			result=error;	
		}
		finally {
		return list;
		}
	}
}

