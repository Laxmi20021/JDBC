package com.xworkz.railway.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class railwayRunner {

	public static void main(String[] args) {

		
		
			String url = "jdbc:mysql://localhost:3306/rail";
			String userName = "root";
			String password = "Xworkzodc@123";

			Connection connection = null;
			try {
				connection = DriverManager.getConnection(url, userName, password);
				if (connection != null) {
					System.out.println("This is Connected");
				} else {
					System.out.println("This is not Connected");
				}
			} catch (SQLException e) {

				e.printStackTrace();
			}
		
	}

}
