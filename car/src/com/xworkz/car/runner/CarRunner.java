package com.xworkz.car.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CarRunner {

	public static void main(String[] args) {


		String url = "jdbc:mysql://localhost:3306/car";
		String userName = "root";
		String password = "Xworkzodc@123";
		String insertQuery="insert into car_table values(20,'Sachith','toyoto')";
				
		
				            
				            
		Connection connection = null;
		try {
			connection = DriverManager.getConnection(url, userName, password);
			
			
			Statement statement=connection.createStatement();
			int updateQuery=statement.executeUpdate(insertQuery);
			if(updateQuery > 0)
			{
				System.out.println("this is saved");
			}
			else
			{
				System.out.println("this is not saved");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
	}

}
