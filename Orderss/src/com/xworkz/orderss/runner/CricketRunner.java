package com.xworkz.orderss.runner;

public class CricketRunner {
	
	
public static void main(String[] args) {

		
		try {
			Class.forName("com.xworkz.orderss.boot.Cricket");
			System.out.println("+================");
		} 
		catch (ClassNotFoundException e) {

			e.printStackTrace();
		}
		
	}


}
