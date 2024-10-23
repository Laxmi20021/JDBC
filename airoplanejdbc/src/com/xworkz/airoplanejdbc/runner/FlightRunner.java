package com.xworkz.airoplanejdbc.runner;

public class FlightRunner {

	public static void main(String[] args) {

		
		try {
			Class.forName("com.xworkz.airoplanejdbc.boot.Flight");
			System.out.println("+================");
		} 
		catch (ClassNotFoundException e) {

			e.printStackTrace();
		}
		
	
		
		
	}

}
