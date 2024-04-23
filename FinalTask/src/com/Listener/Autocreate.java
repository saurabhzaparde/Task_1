package com.Listener;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import com.dao.ConnectionFactory;
import com.model.OrmSubstitute;
import com.pojo.Questions;



public class Autocreate implements ServletContextListener {

public String result;
	
	public String error;
	
	public String sql;

	private Statement st;
	
	private PreparedStatement ps;
	
	private ResultSet rs;
	
	int i;
	
    public void contextDestroyed(ServletContextEvent sce)  { 
        
    	try{
    		Connection con = ConnectionFactory.getCon();
			sql = "drop database Task";
			Statement st = con.createStatement();
			st.executeUpdate(sql);
			}
			catch (Exception e) {
				System.out.println("ListenerDistroyer"+e);
				error=error+e;
				result=error;
			}
			finally {
				System.out.println("Distroyer");
			}
    	
    }


    public void contextInitialized(ServletContextEvent sce)  { 
    	try{
    		Connection con = ConnectionFactory.getCon();
			sql = "create database Task";
			Statement st = con.createStatement();
			st.executeUpdate(sql);
    		
			}
    	catch (Exception e) {
			System.out.println("ListenerInitialize"+e);
			error=error+e;
			result=error;
		}
			finally {
				try {
		    		Connection con = ConnectionFactory.getCon();
					sql = "CREATE TABLE TASK.Admin(Username VARCHAR(100) PRIMARY KEY NOT NULL,Password VARCHAR(100) NOT NULL)";
					st = con.createStatement();
					st.executeUpdate(sql);
					
				} 
		    	catch (Exception e) {
					System.out.println("ListenerInitialize" + e);
					error=error+e;
					result=error;
					
				}  
				finally {
					try {
			    		Connection con = ConnectionFactory.getCon();
						sql = "CREATE TABLE TASK.INFORMATION(id INTEGER PRIMARY KEY  AUTO_INCREMENT," 
																	+ "fullname VARCHAR(100) NOT NULL," 
																	+ "email VARCHAR(100)UNIQUE NOT NULL," 
																	+ "mob_no VARCHAR(100)UNIQUE NOT NULL, marks INTEGER NOT NULL)";
						st = con.createStatement();
						st.executeUpdate(sql);
						
					} 
			    	catch (Exception e) {
						System.out.println("ListenerInitialize" + e);
						error=error+e;
						result=error;
						
					}  
					finally {
						try {
				    		Connection con = ConnectionFactory.getCon();
							sql = "CREATE TABLE TASK.QUESTIONS(qid INTEGER PRIMARY KEY  AUTO_INCREMENT,"
									+ "question VARCHAR(250) NOT NULL,"
									+ "answer_1 VARCHAR(100) NOT NULL,"
									+ "answer_2 VARCHAR(100) NOT NULL, answer_3 VARCHAR(100) NOT NULL,"
									+ "answer_4 VARCHAR(100) NOT NULL, correct_ans VARCHAR(100) NOT NULL)";
							st = con.createStatement();
							st.executeUpdate(sql);
							
						} 
				    	catch (Exception e) {
							System.out.println("ListenerInitialize" + e);
							error=error+e;
							result=error;
						}  
			//	System.out.println("before admin");
			       }
				}
			}
    	 try {
    	    	Connection con = ConnectionFactory.getCon();
    			sql = "insert into Task.Admin(username,password) values('Admin','admin24')";
    			Statement st= con.createStatement();
    	   //	System.out.println(sql);
    			i = st.executeUpdate(sql);
    			if(i==1)
    			{
    				System.out.println("********By Default Admin Login Credentials*******\nUsername.:-Admin\nPassword.:-admin24");
    			}
    		} 
    		catch (Exception e) {
    			System.out.println("Initializer"+e);
    			error=error+e;
    			result=error;	
    		}
    	 finally {
    		 OrmSubstitute os = new OrmSubstitute();
    			os.insert();
    	 }
    }
	
}
