package com.xworkz.cookjdbc.runner;

public class snacksRunner {

	public static void main(String[] args) {

		
		try {
			Class.forName("com.xworkz.cookjdbc.boot.snacks");
			System.out.println("+================");
		} 
		catch (ClassNotFoundException e) {

			e.printStackTrace();
		}
		
	
	}

}
