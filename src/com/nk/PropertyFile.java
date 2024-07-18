package com.nk;

import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Properties;


public class PropertyFile {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		Properties properties = new Properties();
		InputStream input = new FileInputStream("application.properties");
		
		properties.load(input);
		
		String url = properties.getProperty("db.url");
		String id = properties.getProperty("db.username");
		String pwd = properties.getProperty("db.password");
		
		System.out.println(url+" "+id+" "+pwd+" ");
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url,id,pwd);
		Statement st = con.createStatement();
		int rs = st.executeUpdate("Update Employee set salary = 8000 where id = 1");
		
		System.out.println(rs + " record updated");
		
		con.close();
		
		
		
		
		
	}

}
