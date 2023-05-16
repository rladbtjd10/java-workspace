package com.kh.practice;

import java.util.Scanner;

public class CastingPractice {
	
	public static void main(String[] ages) {
		
		CastingPractice cp = new CastingPractice();
//		cp.method1();
		cp.method2();
		
	}
	
	public void method1() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자 : ");
		String line = sc.nextLine();
		char ch1 = line.charAt(0);
		
		int num1 = ch1;
		int num2 = ++ch1;
		
		System.out.println("A unicode : "+num1);
		System.out.println("B unicode : "+num2);
		
		
		
	}
	
	public void method2() {
		
		Scanner sc = new Scanner(System.in);
				
		System.out.print("국어 : ");
		int num1 = sc.nextInt();
		
		System.out.print("영어 : ");
		int num2 = sc.nextInt();
		
		System.out.print("수학 : ");
		int num3 = sc.nextInt();
				
		System.out.printf("총점 : %d ", num1+ num2+ num3);
		
		System.out.printf("\n평균 : %.2f ", (double)(num1+ num2+ num3)/3);
		
		
	}

}
