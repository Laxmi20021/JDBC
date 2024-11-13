package com.xworkz.dresses.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DressRunner {

	public static void main(String[] args) {


		String url = "jdbc:mysql://localhost:3306/dress";
		String userName = "root";
		String password = "Xworkzodc@123";
		String insertQuery = "insert into dress_table(customer_id, customer_Name, customer_Address, customer_Email, customer_mobileNo, total_Bill, discount, date, time, nameOfClothes, quantity) VALUES "
				+ "(1, 'laxmi', 'hubli', 'laxmi@gmail.com', 9972103442, 3000, 2, NOW(), NOW(), 'moms genes', 2), "
				+ "(2, 'kaveri', 'haveri', 'kaveri@gmail.com', 9353132839, 4000, 3, NOW(), NOW(), 'straight pant', 2), "
				+ "(3, 'gagana', 'davanageri', 'gagana@gmail.com', 8050604020, 2000, 2, NOW(), NOW(), 'Cargo Jeans', 1), "
				+ "(4, 'sindhu', 'tumakur', 'sindhu@gmail.com', 997222778, 1000, 1, NOW(), NOW(), 'Denim Shirt', 2), "
				+ "(5, 'sangeeta', 'dharwad', 'sangeeta@gmail.com', 6360103873, 700, 1, NOW(), NOW(), 'Cap', 1), "
				+ "(6, 'sanjeevini', 'belagavi', 'sanjii@gmail.com', 7411455638, 1000, 1, NOW(), NOW(), 'Shirt', 1), "
				+ "(7, 'rohit', 'haliyal', 'rohit@gmail.com', 6360140829, 1100, 1, NOW(), NOW(), 'Jacket', 1), "
				+ "(8, 'rakshit', 'moodbidari', 'rakshit@gmail.com', 9151614121, 1500, 1, NOW(), NOW(), 't shirt', 1), "
				+ "(9, 'yashoda', 'Chitradurga', 'yashoda@gmail.com', 9878485868, 1200, 2, NOW(), NOW(), 'kurta', 3), "
				+ "(10, 'veeru', 'hubli', 'veeru@gmail.com', 6898584253, 1500, 2, NOW(), NOW(), 'T-Shirt', 2), "
				+ "(11, 'pavan', 'kundagol', 'pavan@gmail.com', 9842660114, 1000, 1, NOW(), NOW(), 'hat', 2), "
				+ "(12, 'virat', 'kittur', 'virat@gmail.com', 9047581043, 500, 1, NOW(), NOW(), 'Gym Vest', 1), "
				+ "(13, 'harish', 'harihar', 'harish@gmail.com', 9655900543, 800, 1, NOW(), NOW(), 'Hoodie', 1), "
				+ "(14, 'vaishu', 'koppala', 'vaishu@gmail.com', 9994500012, 300, 1, NOW(), NOW(), 'kid wear', 1), "
				+ "(15, 'nivedita', 'bengaluru', 'nivedita@gmail.com', 7654501342, 2000, 2, NOW(), NOW(), 'saree', 2), "
				+ "(16, 'madhu', 'mysoure', 'madhu@gmail.com', 9001201324, 2000, 3, NOW(), NOW(), 'lehenga', 2), "
				+ "(17, 'nisha', 'mandya', 'nisha@gmail.com', 8073301302, 1000, 1, NOW(), NOW(), 'denim dress', 2), "
				+ "(18, 'aishwarya', 'maddur', 'aishwarya@gmail.com', 7602201182, 1000, 1, NOW(), NOW(), 'one pice', 2), "
				+ "(19, 'gouri', 'goa', 'gouri@gmail.com', 8979494649, 1200, 2, NOW(), NOW(), 'Oversize T-shirt', 2), "
				+ "(20, 'ganga', 'shivamogga', 'ganga@gmail.com', 7574717273, 2000, 1, NOW(), NOW(), 'genes', 2)";

		}
	
	
	public String getInsertQuery()
	{
		return getInsertQuery();
	}

}
