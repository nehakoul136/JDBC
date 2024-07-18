package com.nk;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class UpdateBatch {

	public static void main(String[] args) throws Exception {
		// 15.	Send insert,update,delete query using batch processing
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/assignment","root","root@1234");
		con.setAutoCommit(false); 
		PreparedStatement stmt=con.prepareStatement("Update Employee set salary = ? where id = ?");  
		stmt.setInt(1,5600); 
		stmt.setInt(2, 7);  
		stmt.addBatch();
		int[] result = stmt.executeBatch();
		System.out.println(result[0]+" Records updated");  
		con.commit();
		con.close();
	}

}
