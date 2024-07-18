package com.nk;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Display_ID_Name {

	public static void main(String[] args) throws Exception {
		// 12.	Take id and name from user and display record for that id and name using PreparedStatement
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/assignment","root","root@1234");
		
		PreparedStatement stmt=con.prepareStatement("Select id,name from Employee where id = ? and name = ?");  
		stmt.setInt(1,2);
		stmt.setString(2,"Sam");
		
		ResultSet rs = stmt.executeQuery();  
		
		while (rs.next()) {
			int id = rs.getInt("id");
			String name = rs.getString("name");
			System.out.println("ID: "+id+", Name: "+name);
		}

		con.close();
	}

}
