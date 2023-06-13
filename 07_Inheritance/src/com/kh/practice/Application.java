package com.kh.practice;

import java.util.Scanner;

import com.kh.practice.controller.CircleController;
import com.kh.practice.controller.RectangleController;

public class Application {
	
	private Scanner sc = new Scanner(System.in);
	private CircleController cc = new CircleController();
	private RectangleController rc = new RectangleController();


	public static void main(String[] args) {
		
		Application app = new Application();
	    app.mainMenu();
		
		
	}
	
	public void mainMenu() { //메인메뉴 출력, 잘못 입력했을 시 다시 받도록 반복
		
		boolean check = true;
		
		while(check) {
		System.out.println("===== 메뉴 =====");
		System.out.println("1. 원");
		System.out.println("2. 사각형");
		System.out.println("9. 끝내기");
		System.out.println("메뉴 번호 : ");
		
		switch(Integer.parseInt(sc.nextLine())) {
		
		case 1:
			this.circleMenu();
			break;
		case 2:
			this.rectangleMenu();
			break;	
		case 9:
			check = false;
			System.out.println("종료합니다.");
			break;
		
		}
	}
	}
	public void circleMenu() { //원 메뉴 출력, 잘못 입력했을 시 메인메뉴 로 돌아감
		
		System.out.println("===== 메뉴 =====");
		System.out.println("1. 원 둘레");
		System.out.println("2. 원 넓이");
		System.out.println("9. 메인으로");
		
		System.out.println("메뉴 번호 : ");
		
		switch(Integer.parseInt(sc.nextLine())) {
		
		case 1:
			this.calcCircum();
			break;
		case 2:
			this.calcCircleArea();
			break;	
		case 9:
			System.out.println("종료합니다.");
			break;
		}
	
	}
	
	public void rectangleMenu() { //사각형 메뉴 출력, 잘못 입력했을 시 메인메뉴로  돌아감 
		System.out.println("===== 메뉴 =====");
		System.out.println("1. 사각형 둘레");
		System.out.println("2. 사각형 넓이");
		System.out.println("9. 메인으로");
		System.out.println("메뉴 번호 : ");
		
		switch(Integer.parseInt(sc.nextLine())) {
		
		case 1:
			this.calcPerimeter();
			break;
		case 2:
			this. calcRectArea();
			break;	
		case 9:
			System.out.println("종료합니다.");
			break;

		}
	}
	
	public void calcCircum() { //원의 정보와 원 둘레 출력 //X, y 좌표와 반지름을 받아 원의 정보와 원 둘레 출력
		
		System.out.println("x 좌표 : ");
		int x = Integer.parseInt(sc.nextLine());
		
		System.out.println("y 좌표 : ");
		int y = Integer.parseInt(sc.nextLine());
		
		System.out.println("반지름 : ");
		int radius = Integer.parseInt(sc.nextLine());
		
		System.out.println(cc.calcCircum(x,  y,  radius));
	}
	
	public void calcCircleArea() { //X, y  좌표와 반지름을 받아 원의 정보와 원 넓이 출력
		
		System.out.println("x 좌표 : ");
		int x = Integer.parseInt(sc.nextLine());
		
		System.out.println("y 좌표 : ");
		int y = Integer.parseInt(sc.nextLine());
		
		System.out.println("반지름 : ");
		int radius = Integer.parseInt(sc.nextLine());
		
		System.out.println(cc.calcArea(x,  y, radius));
	}
	
	public void calcPerimeter() { //X, y 좌표와 높이, 너비를 받아 사각형의 정보와 사각형 둘레 출력
		System.out.println("x 좌표 : ");
		int x = Integer.parseInt(sc.nextLine());
		
		System.out.println("y 좌표 : ");
		int y = Integer.parseInt(sc.nextLine());
		
		System.out.println("높이 : ");
		int height = Integer.parseInt(sc.nextLine());
		
		System.out.println("너비 : ");
		int width = Integer.parseInt(sc.nextLine());
		
		System.out.println(rc.calcPerimeter(x,  y,  height, width));
	}
	
	public void calcRectArea() { //X, y  좌표와 높이,너비를 받아 사각형의 정보와 사각형 넓이 출력
		System.out.println("x 좌표 : ");
		int x = Integer.parseInt(sc.nextLine());
		
		System.out.println("y 좌표 : ");
		int y = Integer.parseInt(sc.nextLine());
		
		System.out.println("높이 : ");
		int height = Integer.parseInt(sc.nextLine());
		
		System.out.println("너비 : ");
		int width = Integer.parseInt(sc.nextLine());
		
		System.out.println(rc.calcArea(x,  y,  height, width));
	}

}
