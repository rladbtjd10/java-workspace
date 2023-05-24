package com.kh.example.practice2;

import com.kh.example.practice2.model.Circle;

public class Run {

	public static void main(String[] args) {
		
		Circle c = new Circle();
//		c.incrementRadius();
//		c.incrementRadius();
		
		
		System.out.println("원의 둘레 : " + c.incrementRadius2());
		System.out.println("원의 넓이 : " + c.incrementRadius1());
		
		c.radius += 1;
		
		System.out.println("원의 둘레 : " + c.incrementRadius2());
		System.out.println("원의 넓이 : " + c.incrementRadius1());
		

	}

}
