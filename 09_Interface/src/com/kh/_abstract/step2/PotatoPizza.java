package com.kh._abstract.step2;

public class PotatoPizza extends Pizza{
	
	

	public PotatoPizza(int price, String storeName) {
//		super(price, storeName); //super부모클래스 생성자
		this.price = price;
		this.storeName = storeName; //위와 같이 super 쓸수 있지만 자식클래스에서도 접근이 가능하기에/ this로도 쓸수 있다.
	}

	@Override
	public void topping() {
		System.out.println("Potato Topping...");
	}

}
