package com.nk;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class UpdateData_PS {

	public static void main(String[] args) throws Exception {
		//8.	Take id and updated salary from user and update salary for that id using PreparedStatement
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/assignment","root","root@1234");
		
		PreparedStatement stmt=con.prepareStatement("Update Employee set salary = ? where id = ?");  
		stmt.setInt(1,4500);  
		stmt.setInt(2, 5);  
		
		int result=stmt.executeUpdate();  
		
		System.out.println(result+" records updated");  
		
		con.close();
	}

}
