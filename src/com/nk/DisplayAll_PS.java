package com.nk;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DisplayAll_PS {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// 11.	Display all the records from emp table using PreparedStatement
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/assignment","root","root@1234");
		
		PreparedStatement stmt=con.prepareStatement("Select * from Employee");  
		
		ResultSet rs = stmt.executeQuery();  
		
		while (rs.next()) {
			int id = rs.getInt("id");
			String name = rs.getString("name");
			int salary = rs.getInt("salary");
			System.out.println("ID: "+id+", Name: "+name+", Salary: "+salary);
		}
		
		con.close();

	}

}
