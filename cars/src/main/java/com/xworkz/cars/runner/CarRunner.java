package com.xworkz.cars.runner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.xworkz.cars.dto.CarDto;


public class CarRunner {

	public static void main(String[] args) {


		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("xworkz");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		try
		{
			et.begin();
			CarDto carDto=new CarDto();
			carDto.setId(1);
			carDto.setModel("mahindra");
			carDto.setOwner("laxmi");
			carDto.setPrice(150000);
			
			
			carDto.setId(2);
			carDto.setModel("sdfg");
			carDto.setOwner("xcv");
			carDto.setPrice(10000);
			
			
			carDto.setId(2);
			carDto.setModel("mnbjh");
			carDto.setOwner("ngfhj");
			carDto.setPrice(12657);
			
			
			//em.presist(carDto);
			em.merge(carDto);
			et.commit();
			
			
			
		
			
			
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			em.close();
			emf.close();
		}

		
		
	}

}
