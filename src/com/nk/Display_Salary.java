package com.nk;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Display_Salary {

	public static void main(String[] args) throws Exception {
		// 13.	Display all the records whose salary is more than 1000  using PreparedStatement
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/assignment","root","root@1234");
		
		PreparedStatement stmt=con.prepareStatement("Select * from Employee where salary > ?");  
		stmt.setInt(1,1000);
		
		ResultSet rs = stmt.executeQuery();  
		
		while (rs.next()) {
			int id = rs.getInt("id");
			String name = rs.getString("name");
			int salary = rs.getInt("salary");
			System.out.println("ID: "+id+", Name: "+name+ ", Salary: "+salary);
		}
		con.close();
	}

}
