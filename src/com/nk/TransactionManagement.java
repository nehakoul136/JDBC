package com.nk;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class TransactionManagement {

	public static void main(String[] args) throws Exception {
		// 16.	Write a program which shows transaction management
		Connection con = null;
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/assignment","root","root@1234");
		
		
		con.setAutoCommit(false);
		
		//insert
		PreparedStatement stmt=con.prepareStatement("insert into Employee values(?,?,?)");  
		stmt.setInt(1,15);
		stmt.setString(2,"Marina");  
		stmt.setInt(3, 7400);  
		
		int result = stmt.executeUpdate();  
		
		System.out.println(result+" records inserted");  
		
		//update

		PreparedStatement stmt_update=con.prepareStatement("Update Employee set salary = ? where id = ?");  
		stmt_update.setInt(1,4500);  
		stmt_update.setInt(2, 14);  
		
		int result_update = stmt_update.executeUpdate();  
		
		System.out.println(result_update+" records updated");  
		
		con.commit();
		
		} catch (Exception e) {
		
			e.printStackTrace();
			
			if (con != null) {
                try {
                    con.rollback();
                    System.out.println("Transaction rolled back due to an error");
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
		}
		
		con.close();		

	}

	}
	
}


	
