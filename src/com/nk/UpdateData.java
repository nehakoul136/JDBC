package com.nk;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateData {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		//3.	Take id and updated salary from user and update salary for that id using Statement
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/assignment","root","root@1234");
		Statement st = con.createStatement();
		int rs = st.executeUpdate("Update Employee set salary = 8000 where id = 1");
		
		System.out.println(rs + " record updated");
		
		con.close();
		}

	}


