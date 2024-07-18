package com.nk;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DisplayAll {

	public static void main(String[] args) throws Exception {
		// 6.	Display all the records from emp table using Statement
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/assignment","root","root@1234");
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery("Select * from employee");
		
		while (rs.next()) {
			int id = rs.getInt("id");
			String name = rs.getString("name");
			int salary = rs.getInt("salary");
			System.out.println("ID: "+id+", Name: "+name+", Salary: "+salary);
		}
		
		con.close();

	}

}
