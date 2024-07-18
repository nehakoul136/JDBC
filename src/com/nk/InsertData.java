package com.nk;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertData {

	public static void main(String srgs[]) throws ClassNotFoundException, SQLException {
		
		//1.	Program which shows Driver registration and Connection creation
		//2.	Programs for insert employee data into emp table using Statement

		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/assignment","root","root@1234");
		Statement st = con.createStatement();
		int rs = st.executeUpdate("Insert into employee values(1,'Ram',8000),(2,'Sam',2000),(3,'Tim',3000),(4,'Lily',4000)");
		
		System.out.println(rs + " record added");
		
		con.close();
		}
}
