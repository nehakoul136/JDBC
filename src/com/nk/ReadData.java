package com.nk;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ReadData {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// 5.	Take id from user and display record for that id using Statement
		
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/assignment","root","root@1234");
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("Select * from employee where id = 1");
			
			while (rs.next()) {
				int id = rs.getInt("id");
				String name = rs.getString("name");
				int salary = rs.getInt("salary");
				System.out.println("ID: "+id+", Name: "+name+", Salary: "+salary);
			}
			
			con.close();
		

	}
	
}	


