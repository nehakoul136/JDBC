package com.nk;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;


public class InsertData_PS {

	public static void main(String[] args) throws Exception {
		// 7.	Programs for insert employee data into emp table using PreparedStatement
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/assignment","root","root@1234");
		
		PreparedStatement stmt=con.prepareStatement("insert into Employee values(?,?,?)");  
		stmt.setInt(1,5);
		stmt.setString(2,"Mona");  
		stmt.setInt(3, 6000);  
		
		int result=stmt.executeUpdate();  
		
		System.out.println(result+" records inserted");  
		 
		con.close();

	}

}
