package com.xworkz.thar.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class StudentDeleteRunner {

	public static void main(String[] args) {

  
		
		String url = "jdbc:mysql://localhost:3306/student";
		String userName = "root";
		String password = "Xworkzodc@123";
		String deleteQuery="delete from student_table where id=2";	
		
		
		//id=20
		//id=19
		//id=18
		//id=17
		//id=16
		
		
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
