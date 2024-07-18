package com.nk;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class InsertBatch {

	public static void main(String[] args) throws Exception {
		// 15.	Send insert,update,delete query using batch processing
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/assignment","root","root@1234");
		con.setAutoCommit(false); 
		PreparedStatement stmt=con.prepareStatement("insert into Employee values(?,?,?)");  
		stmt.setInt(1,9);
		stmt.setString(2,"Tom");  
		stmt.setInt(3, 9000);  
		
		stmt.addBatch();
		int[] result = stmt.executeBatch();
		System.out.println(result[0]+" Records inserted");  
		con.commit();
		con.close();
		
	}

}
