package com.kh.practice3.model;

public class Nut extends Farm {
	
	private String name;
	private int amount;
	public Nut() {
	}
	public Nut(String kind, String name, int amount) {
		super(kind, name);
		this.amount = amount;
	}
	public Nut(String name, int amount) {
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
		return "Nut [name=" + name + ", amount=" + amount + "]";
	}
	

}
