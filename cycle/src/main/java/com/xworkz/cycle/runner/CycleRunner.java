package com.xworkz.cycle.runner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.xworkz.cycle.dto.CycleDto;



public class CycleRunner {

	public static void main(String[] args) {


		

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("xworkz");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		try
		{
			et.begin();
			
			
			
			
			CycleDto cycleDto=new CycleDto();
			cycleDto.setId(1);
			cycleDto.setOwner("harish");
			cycleDto.setPrice(30000);
			cycleDto.setCycleownerage(24);
			
			
			cycleDto.setId(1);
			cycleDto.setOwner("fcvbnm");
			cycleDto.setPrice(21562);
			cycleDto.setCycleownerage(21);
			
			em.merge(cycleDto);
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
