package com.kh.practice;

import java.util.Scanner;

public class OperatorPractice {
	
	public static void main(String[] arge) {
		
		OperatorPractice o = new OperatorPractice();
//		o.method1();
//		o.method2();
//		o.method3();
//		o.method4();
//		o.method5();
		o.method6();
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
		
		String result = "";
		
        Scanner sc = new Scanner(System.in);
        
		System.out.print("나이 : ");
		int a = sc.nextInt();
		
//		int b = 13;
//		int c = 19;	
		result = (a <= 13) ? "어린이" : (a <= 19) ? "청소년" : "어른";
		System.out.println(result);
		
	}
	
	public void method6() {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("사과의 개수 : ");
		int a = sc.nextInt();
		
		System.out.print("바구니의 크기 : ");
		int b = sc.nextInt();
		
		int c = a / b;
	    int result = (a % b == 0) ? c : ++c;		
		System.out.print("필요한 바구니의 수 : " + result);
		
		
	}
	
	
	

}
