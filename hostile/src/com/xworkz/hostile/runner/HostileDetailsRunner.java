package com.xworkz.hostile.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;



public class HostileDetailsRunner {

	public static void main(String[] args) {


		String url = "jdbc:mysql://localhost:3306/hostile";
		String userName = "root";
		String password = "Xworkzodc@123";
		String insertQurey = "insert into hostile_table(id, name, lastName, age, email, address, pincode, mobileNo, aadhaarNo, qualification, motherTounge) VALUES "
				+ "(1, 'guru', 'l', 22, 'guru@gmail.com', 'hubli, KA', 636702, 8122407324, 234509871234, 'BA.Eng', 'Kannada'), "
				+ "(2, 'rakshit', 'p', 22, 'rakshit@gmail.com', 'davanagere, KA', 636701, 9845661103, 789043216754, 'EEE', 'Kannada'), "
				+ "(3, 'rakesh', 'b', 21, 'rakesh@gmail.com', 'bengaluru, KA', 626001, 8072235606, 91287340921, 'CSE', 'Kannada'), "
				+ "(4, 'nitish', 'r', 24, 'nitish@gmail.com', 'tumakur, KA', 626800, 8164409876, 324198706574, 'ECE', 'Kannada'), "
				+ "(5, 'vani', 'B', 25, 'vani@gmail.com', 'harihar, KA', 636701, 9956022432, 457612098374, 'B.Tech', 'Kannada'), "
				+ "(6, 'sachin', 'b', 20, 'sachin@gmail.com', 'nelamangala, KA', 636701, 8122409234, 654378902610, 'CSC', 'Kannada'), "
				+ "(7, 'priyanka', 'm', 19, 'priya@gmail.com', 'bijapur, KA', 636701, 9944664654, 321409876509, 'EEE', 'Kannada'), "
				+ "(8, 'shashi', 'p', 20, 'shashi@gmail.com', 'belgavi, KA', 636701, 7765611246, 456372810191, 'B.Com', 'Kannada'), "
				+ "(9, 'shweta', 'p', 23, 'shweta@gmail.com', 'kittur, KA', 600001, 8172498832, 152472720908, 'BCA', 'Kannada'), "
				+ "(10, 'laxmi', 'P', 24, 'laxmi@gmail.com', 'hukkeri, KA', 623019, 9609255412, 535309081281, 'B.Com.CA', 'Kannada'), "
				+ "(11, 'rohit', 'p', 25, 'rohit@gmail.com', 'savadatti, KA', 636702, 7122509556, 324252629807, 'MSW', 'Kannada'), "
				+ "(12, 'vinuta', 'p', 27, 'vinuta@gmail.com', 'managaluru, KA', 654703, 6381500876, 98743215678, 'B.Sc.Maths', 'Kannada'), "
				+ "(13, 'aditya', 'm', 21, 'aditya@gmail.com', 'mysoure, KA', 616900, 6522509143, 767685850302, 'EEE', 'Kannada'), "
				+ "(14, 'soumya', 'l', 20, 'soumya@gmail.com', 'mandya, KA', 654231, 8065512657, 242325262710, 'BA.Eng', 'Kannada'), "
				+ "(15, 'manjunath', 'p', 19, 'manju@gmail.com', 'birur, KA', 636701, 7655309271, 101090879767, 'BCA', 'Kannada'), "
				+ "(16, 'jaganath', 'p', 20, 'jaguu@gmail.com', 'chikjajur, KA', 736801, 6522416465, 454346420989, 'BSC', 'Kannada'), "
				+ "(17, 'modi', 'n', 22, 'modi@gmail.com', 'Banglore, KA', 736801, 9698224963, 123767698083, 'MCA', 'Kannada'), "
				+ "(18, 'siddaramaya', 'm', 19, 'siddu@gmail.com', 'bengaluru sounth, KA', 636701, 9952644012, 890812657693, 'ECE', 'Kannada'), "
				+ "(19, 'indira', 'p', 18, 'indu@gmail.com', 'kukke, KA', 636701, 9047500110, 240256784318, 'B.Tech', 'Kannada'), "
				+ "(20, 'sakshi', 'h', 24, 'sakshi@gmail.com', 'dharmastala, KA', 626001, 6522410933, 786509123403, 'MBA', 'Kannada')";

		
	}
	
	public String getInsertQuery()
	{
		return getInsertQuery();
	}
 

}
