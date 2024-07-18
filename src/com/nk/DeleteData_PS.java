package com.nk;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DeleteData_PS {

	public static void main(String[] args) throws Exception {
		// 9.	Take id from user delete record for that id using PreparedStatement
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/assignment","root","root@1234");
		
		PreparedStatement stmt=con.prepareStatement("Delete from Employee where id = ?");  
		stmt.setInt(1,4);  
		
		int result=stmt.executeUpdate();  
		
		System.out.println(result+" records deleted");  
		
		con.close();
	}

}
