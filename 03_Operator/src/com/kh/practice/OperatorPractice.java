package com.kh.practice;

import java.util.Scanner;

public class OperatorPractice {
	
	public static void main(String[] arge) {
		
		OperatorPractice o = new OperatorPractice();
//		o.method1();
//		o.method2();
//		o.method3();
//		o.method4();
		o.method5();
	}
	
	public void method1() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("인원 수 : ");
		int num1 = sc.nextInt();
		
		System.out.print("연필 개수 : ");
		int num2 = sc.nextInt();
		
		System.out.println("1인당 연필 개수 : "  + (num2 / num1)); 
		System.out.println("남는 연필 개수 : " + (num2 % num1)); 
		
		
	}
	
	public void method2() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("양수를 입력해 주세요 > ");
		int num1 = sc.nextInt();
		
		int num2 = 100 ;
		
		System.out.println(num1 - num1 % num2); 
	}
	
	public void method3() {
		
		Scanner sc = new Scanner(System.in);
		boolean result = false;
		
		System.out.print("입력1 : ");
		int num1 = sc.nextInt();

		
		System.out.print("입력2 : ");
		int num2 = sc.nextInt();

		
		System.out.print("입력3 : ");
		int num3 = sc.nextInt();

	
		result = (num1 == num2) && (num1 == num3);
		System.out.println(result); 
	}
	
	public void method4() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 : ");
		int a = sc.nextInt();
		
		String result = (a % 2 ==0) ? "짝수다" : "홀수다";
	    System.out.println(result);
		
		
	}
	
	public void method5() {
		
        Scanner sc = new Scanner(System.in);
        String result = "";
        
		
		System.out.print("나이 : ");
		int a = sc.nextInt();
		
		result = (a <= 13) ? "어린이" : (a > 13) ? "청소년" : (a > 19) ? "성인"; 
		System.out.println(result);
		
	}
	
	

}
