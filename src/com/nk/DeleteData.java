package com.nk;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DeleteData {

	public static void main(String[] args) throws Exception {
		
		//4.	Take id from user delete record for that id using Statement
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/assignment","root","root@1234");
		Statement st = con.createStatement();
		int rs = st.executeUpdate("Delete from Employee where id = 3");
		System.out.println(rs + " record deleted");
		
		con.close();

	}

}
