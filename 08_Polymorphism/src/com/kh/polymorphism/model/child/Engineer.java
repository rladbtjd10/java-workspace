package com.kh.polymorphism.model.child;

import com.kh.polymorphism.model.parent.Employee;

public class Engineer extends Employee {
	
	private String tech;
	private int bouns;
	public Engineer() {
	}
	public Engineer(String name, int salary, String tech, int bouns) {
		super(name, salary);
		this.tech = tech;
		this.bouns = bouns;
	}
	public Engineer(String tech, int bouns) {
		this.tech = tech;
		this.bouns = bouns;
	}
	public String getTech() {
		return tech;
	}
	public void setTech(String tech) {
		this.tech = tech;
	}
	public int getBouns() {
		return bouns;
	}
	public void setBouns(int bouns) {
		this.bouns = bouns;
	}
	@Override
	public String toString() {
		return super.toString() + " / "+"Engineer [tech=" + tech + ", bouns=" + bouns + "]";
	}
	
	

}
