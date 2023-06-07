package com.kh.practice3.model;

public class Fruit extends Farm {
	
	private String name;
	private int amount;
	public Fruit() {
	}
	public Fruit(String kind, String name, int amount) {
		super(kind, name);
		this.amount = amount;
	}
	public Fruit(String name, int amount) {
		this.name = name;
		this.amount = amount;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	@Override
	public String toString() {
		return "Fruit [name=" + name + ", amount=" + amount + "]";
	} 
	
	

	
}
