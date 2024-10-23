package com.xworkz.collectionjdbc.hotelrunner;

public class ServerRunner {

	public static void main(String[] args) {


		try {
			Class.forName("com.xworkz.collectionjdbc.hotel.Server");
			System.out.println("================");
		} 
		catch (ClassNotFoundException e) {

			e.printStackTrace();
		}
		
		
		
	}

}
