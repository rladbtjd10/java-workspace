package com.kh.example.practice4;

import java.util.Scanner;

import com.kh.example.practice4.controller.SnackController;
import com.kh.example.practice4.model.Snack;

public class Run {
	
	public static void main(String[] args) {
		
//		Snack s = new Snack();
		SnackController scr = new SnackController();
		Scanner sc =new Scanner(System.in);
		
		System.out.println("스낵류를 입력하세요");
		
		System.out.print("종류 : ");
//		String kind = sc.nextLine(); //1
//		s.setkind(kind); //2 //두가지 방법이 있음.
		
//		s.setkind(sc.nextLine());
		String kind =sc.nextLine();
		
		System.out.print("이름 : ");
		String name =sc.nextLine();
//		s.setname(sc.nextLine());
		
		System.out.print("맛 : ");
		String flavor =sc.nextLine();
//		s.setflavor(sc.nextLine());
		
		System.out.print("개수 : ");
		int NumOf = Integer.parseInt(sc.nextLine());
//		s.setNumOf(Integer.parseInt(sc.nextLine()));
		
		System.out.print("가격 : ");
		int price = Integer.parseInt(sc.nextLine());
//		s.Setprice(Integer.parseInt(sc.nextLine()));
		
		Snack s = new Snack(kind,name,flavor,NumOf,price);	
		
		if(scr.saveData(s)) {
		
		System.out.println("저장 완료되었습니다.");
		System.out.println(scr.confirmData());
		
		}
//		System.out.println(s);
//		System.out.println(s.getkind()+"("+s.getname()+"-"+s.getflavor()+")"+s.getNumOf()+"개"+s.getprice()+"원");
		
		
		
		

	}

}
