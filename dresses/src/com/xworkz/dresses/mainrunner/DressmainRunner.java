package com.xworkz.dresses.mainrunner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.xworkz.dresses.read.selectQuery1;
import com.xworkz.dresses.read.selectQuery2;
import com.xworkz.dresses.read.selectQuery3;
import com.xworkz.dresses.read.selectQuery4;
import com.xworkz.dresses.read.selectQuery5;
import com.xworkz.dresses.read.selectQuery6;
import com.xworkz.dresses.ref.ConnectionEnum;

public class DressmainRunner {

	public static void main(String[] args) {


		
		Connection connection = null;
		try {
			connection = DriverManager.getConnection(ConnectionEnum.URL.getValue(), ConnectionEnum.USERNAME.getValue(),
					ConnectionEnum.PASSWORD.getValue());
			Statement statement = connection.createStatement();
			//int value = statement.executeUpdate(new Employee().getInsertQuery());
		//if (value > 0)
		//	System.out.println("database is saved ");
		//else
			//System.out.println("database is not saved");
			ResultSet resultSet1 = statement.executeQuery(new selectQuery1().getSelectQuery1());
			while (resultSet1.next()) {
				System.out.println(resultSet1.getString("customer_Name"));
			}
			System.out.println(".......................");
			ResultSet resultSet2 = statement.executeQuery(new selectQuery2().getSelectQuery2());
			while (resultSet2.next()) {
				System.out.println(resultSet2.getString("customer_Name"));
			}
			System.out.println(".......................");

			ResultSet resultSet3 = statement.executeQuery(new selectQuery3().getSelectQuery3());
			while (resultSet3.next()) {
				System.out.println(resultSet3.getString("customer_Address"));
			}
			System.out.println(".......................");


			ResultSet resultSet4 = statement.executeQuery(new selectQuery4().getSelectQuery4());
			while (resultSet4.next()) {
				System.out.println(resultSet4.getString("customer_Email"));
				System.out.println(resultSet4.getString("customer_id"));
			}
			

			ResultSet resultSet5 = statement.executeQuery(new selectQuery5().getSelectQuery5());
			while (resultSet5.next()) {
				System.out.println(resultSet5.getString("customer_Email"));
				System.out.println(resultSet5.getString("customer_id"));

			}

			System.out.println(".......................");


			ResultSet resultSet6 = statement.executeQuery(new selectQuery6().getSelectQuery6());
			while (resultSet6.next()) {
				System.out.println(resultSet6.getString("customer_Name"));
			}

			System.out.println(".......................");

		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
		
	}

}
