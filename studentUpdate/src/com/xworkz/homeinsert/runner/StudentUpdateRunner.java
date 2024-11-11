package com.xworkz.homeinsert.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class StudentUpdateRunner {

	public static void main(String[] args) {


		
		String url = "jdbc:mysql://localhost:3306/student";
		String userName = "root";
		String password = "Xworkzodc@123";
		String updateQuery="insert into student_table set student_name='yashoda ' , id=29 ,student_age='25' ";	
		
		//student_name='devashree' , id=30 ,student_age='22' 
		//student_name='lalita' , id=23 ,student_age='30'
		//student_name='Gourish' , id=24 ,student_age='28'
		//student_name='chetana' , id=22 ,student_age='25'

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
