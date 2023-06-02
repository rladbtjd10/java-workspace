package com.kh.practice1;

import java.io.IOException;

class B_Throws {
	
	/*
	 * 예외처리 떠넘기기
	 * 
	 * [표현법]
	 * 
	 * 리턴타입 메서드명(매개변수, ...) throws 예외클래스1, 예외클래스2, ...{}
	 * 
	 * 
	 */
	public static void main(String[] args) {
		try {
			new B_Throws().method1();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {  // --> 아래에 Exception만 쓰면 마지막 catch를 잡아줘야됨 (Exception이 상위 클래스 이기때문에 아래에 사용됨)
			e.printStackTrace();
		}
	}
	
//	public void method1() throws ClassNotFoundException, IOException { -->이렇게 안쓰고 아래와 같이 Exception으로만 써도 됨 
	public void method1() throws Exception {

		System.out.println("method1() 호출");
		
		method2();
		
		System.out.println("mothod1() 종료");	
	}
	
	public void method2() throws IOException, ClassNotFoundException {
		System.out.println("method2() 호출");
		
		method3();
		
		
		System.out.println("mothod2() 종료");
	}
	
	public void method3() throws IOException, ClassNotFoundException {
		System.out.println("method3() 호출");
		
		int random = (int)(Math.random() * 3 + 1);
		
		if(random == 1) {
			throw new ClassNotFoundException();
		}else if(random == 2) {
			throw new IOException();
		}
		System.out.println("mothod3() 종료");
	}
	
	
	
	
	

}
