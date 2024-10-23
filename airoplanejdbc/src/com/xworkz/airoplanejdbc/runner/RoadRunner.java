package com.xworkz.airoplanejdbc.runner;

public class RoadRunner {

	public static void main(String[] args) {

		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver......................");
		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		}
	}

}
