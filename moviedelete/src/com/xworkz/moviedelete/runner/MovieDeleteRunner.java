package com.xworkz.moviedelete.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class MovieDeleteRunner {

	public static void main(String[] args) {

		String url = "jdbc:mysql://localhost:3306/movie";
		String userName = "root";
		String password = "Xworkzodc@123";
		String deleteQuery="delete from movie_table where id=10";	
		
		
		
		
		
		try(Connection connection = DriverManager.getConnection(url, userName, password)){
			
			
			Statement statement=connection.createStatement();
			int result=statement.executeUpdate(deleteQuery);
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
