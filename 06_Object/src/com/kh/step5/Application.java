package com.kh.step5;

import com.kh.step5.model.Book;

public class Application {

	public static void main(String[] args) {
		
		Book b1 = new Book("HTRL+CSS+자바스크립트", 30000, 0.2, "고경희");
		
		Book b2 =  new Book();
		
		b2.setTitle("리액트 200제");
		b2.setPrice(25000);
		b2.setDiscountRate(0.1);
		b2.setAuthor("이정열");
		
		System.out.println(b1);
		System.out.println(b2);
		
		//Getter를 이용해서 두 객체 각각 할인율을 적용한 책 가격을 계산해서 출력
		System.out.println("b1할인율을 적용한 책 가격 : " + (int)(b1.getPrice()-(b1.getPrice()*b1.getDiscountRate())));
		System.out.println("b2할인율을 적용한 책 가격 : " + (int)(b2.getPrice()-(b2.getPrice()*b2.getDiscountRate())));

	}

}
