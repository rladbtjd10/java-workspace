package com.kh.example.practice4.model;

public class Snack {
	
	// A/t + Shift + S -> 자동완성 Superclass
	String kind;
	String name;
	String flavor;
	int numOf;
	int price;
	
	// A/t + Shift + S -> 자동완성 Field -> ...super()클릭
	public Snack() {}
	public Snack(String kind, String name, String flavor, int numOf, int price) {
		this.kind = kind;
		this.name = name;
		this.flavor = flavor;
		this.numOf = numOf;
		this.price = price;
	}
	
	// A/t + Shift + S -> 자동완성
	// get set 뒤에 대문자로 예)getNumOf()
	public String getkind() {
		return kind;
	}
	public void setkind(String kind) {
		this.kind = kind;
	}
	public String getname() {
		return name;
	}
	public void setname(String name) {
		this.name = name;
	}
	public String getflavor() {
		return flavor;
	}
	public void setflavor(String flavor){
		this.flavor = flavor;
	}
	public int getnumOf() {
		return numOf;
	}
	public void setNumOf(int numOf) {
		this.numOf = numOf;
	}
	public int getprice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	// A/t + Shift + S -> 자동완성
	
	@Override
	public String toString() {
		return "Snack [kind=" + kind + ", name=" + name + ", flavor=" + flavor + ", numOf=" + numOf + ", price=" + price
				+ "]";
	}

}
