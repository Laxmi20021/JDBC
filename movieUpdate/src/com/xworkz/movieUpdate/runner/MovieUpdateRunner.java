package com.xworkz.movieUpdate.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class MovieUpdateRunner {

	public static void main(String[] args) {


		String url = "jdbc:mysql://localhost:3306/movie";
		String userName = "root";
		String password = "Xworkzodc@123";
		String updateQuery="insert into movie_table set  id=25, movie_name='dfgh' , movie_hero='dcfg' , movie_heroage='45'";	
		
		
		try(Connection connection = DriverManager.getConnection(url, userName, password)) {
			
			
			Statement statement=connection.createStatement();
			int result=statement.executeUpdate(updateQuery);
			if(result > 0)
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
