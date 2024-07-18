package com.nk;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Update_Salary {

	public static void main(String[] args) throws Exception {
		// 14.	Increase employee salaries by 500 whose salary is less than 10000 using PreparedStatement
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/assignment","root","root@1234");
		
		PreparedStatement stmt = con.prepareStatement("Update Employee set salary = salary + ? where salary < ?");
		stmt.setInt(1,500);
		stmt.setInt(2,10000);
		
		int rs = stmt.executeUpdate();
		System.out.println(rs+" records updated");  
       
		con.close();
		
				}

}
