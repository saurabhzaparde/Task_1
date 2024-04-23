package com.dao;

import java.sql.Connection;
import java.sql.SQLException;

import com.mysql.cj.jdbc.MysqlDataSource;

public class ConnectionFactory {

	private static Connection con;
	public static Connection getCon() {
		
		try 
		{
			MysqlDataSource ds = new MysqlDataSource();
			Class.forName("com.mysql.cj.jdbc.Driver");
			ds.setURL("jdbc:mysql://localhost:3308/");
			ds.setUser("root");
			ds.setPassword("sql_me");
			con = ds.getConnection();
			
		} 
		catch (SQLException e) 
		{
			System.out.println("ConnectionFactory"+e);
		}
		finally
		{
			return con;
		}
	}
}
