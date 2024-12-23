package com.xworkz.hostile.mainrunner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.xworkz.hostile.read.SelectQuery1;
import com.xworkz.hostile.read.SelectQuery2;
import com.xworkz.hostile.read.SelectQuery3;
import com.xworkz.hostile.read.SelectQuery4;
import com.xworkz.hostile.read.SelectQuery5;
import com.xworkz.hostile.read.SelectQuery6;
import com.xworkz.hostile.ref.ConnectionEnum;


public class HostilemainRunner {

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
			ResultSet resultSet1 = statement.executeQuery(new SelectQuery1().getSelectQuery1());
			while (resultSet1.next()) {
				System.out.println(resultSet1.getString("name"));
			}
			System.out.println(".......................");
			ResultSet resultSet2 = statement.executeQuery(new SelectQuery2().getSelectQuery2());
			while (resultSet2.next()) {
				System.out.println(resultSet2.getString("name"));
			}
			System.out.println(".......................");

			ResultSet resultSet3 = statement.executeQuery(new SelectQuery3().getSelectQuery3());
			while (resultSet3.next()) {
				System.out.println(resultSet3.getString("address"));
			}
			System.out.println(".......................");


			ResultSet resultSet4 = statement.executeQuery(new SelectQuery4().getSelectQuery4());
			while (resultSet4.next()) {
				System.out.println(resultSet4.getString("email"));
				System.out.println(resultSet4.getString("id"));
			}
			

			ResultSet resultSet5 = statement.executeQuery(new SelectQuery5().getSelectQuery5());
			while (resultSet5.next()) {
				System.out.println(resultSet5.getString("email"));
				System.out.println(resultSet5.getString("address"));

			}

			System.out.println(".......................");


			ResultSet resultSet6 = statement.executeQuery(new SelectQuery6().getSelectQuery6());
			while (resultSet6.next()) {
				System.out.println(resultSet6.getString("name"));
			}

			System.out.println(".......................");

		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		
		
		
	}

}
