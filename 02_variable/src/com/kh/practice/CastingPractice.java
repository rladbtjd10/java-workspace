package com.kh.practice;

import java.util.Scanner;

public class CastingPractice {
	
	public static void main(String[] ages) {
		
		CastingPractice cp = new CastingPractice();
		cp.method1();
		cp.method2();
		
	}
	
	public void method1() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자 : ");
		char ch = sc.nextLine().charAt(0);
		int a = (int)ch;
		
		
		System.out.println((char)a + " unicode : "+ a);
		System.out.println((char)++a + " unicode : "+ ++a);
		
		
		
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
