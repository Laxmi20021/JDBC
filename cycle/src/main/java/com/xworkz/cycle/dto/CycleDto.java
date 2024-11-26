package com.xworkz.cycle.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="cycle_table")
public class CycleDto {
	
	
	
	@Id
	private int id;
	private String owner;
	private double price;
	private int cycleownerage;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getCycleownerage() {
		return cycleownerage;
	}
	public void setCycleownerage(int cycleownerage) {
		this.cycleownerage = cycleownerage;
	}
	
	

}
