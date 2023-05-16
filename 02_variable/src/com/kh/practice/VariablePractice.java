package com.kh.practice;

import java.util.Scanner;

public class VariablePractice {
	
	// FQCN(Fully Qualified Class Name)
	// 클래스가 속한 패키지명을 모두 포함한 이름
	public static void main(String[] args) {
		
		VariablePractice vp = new VariablePractice();
//		vp.method1();
		vp.method2();
		vp.method3();
		vp.method4();
	}
	
	public void method1() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 정수를 입력하세요 : ");
		int num1 = sc.nextInt();
		
		System.out.print("첫번째 정수를 입력하세요 : ");
		int num2 = sc.nextInt();
		
		System.out.println("더하기 결과 : " + (num1 + num2));
		System.out.println("빼기 결과 : " + (num1 - num2));
		System.out.println("곱하기 결과 : " + (num1 * num2));
		System.out.println("나누기 결과 : " + (num1 / num2));
		
	}
	
	public void method2() {
		
		Scanner sc = new Scanner(System.in);
		
		int iNum1 = 10000;
		int iNum2 = 7000; 
		
		System.out.println("성인 2명 : " + (iNum1 * 2 ) + "원");
		System.out.println("청소년 3명 : " + (iNum2 * 3 ) + "원\n" );
		System.out.println("총 금액 : " + ((iNum1 *2) + (iNum2 * 3))+ "원");
		
	
		
	}
	
	public void method3() {
		
		int x = 5;
		int y = 7;
		int z = 9;
		
		int tmp = x;
		x = y;
		y = z;
		z = tmp;
		
		
		System.out.println("x=" + x);
		System.out.println("y=" + y);
		System.out.println("z=" + z);
}
	public void method4() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열을 입력하세요 : ");
		String jnum1 = sc.nextLine();
		
		System.out.println(jnum1.charAt(0));
		System.out.println(jnum1.charAt(-1));
//		System.out.println("첫번째 문자 : " + );
//		System.out.println("두번째 문자 : " + );
}
}