package com.kh.time;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class A_Date {

	public static void main(String[] args) {
		A_Date a = new A_Date();
//		a.method1();
//		a.method2();
//		a.method3();
		a.practice();

	}
	
	/*
	 * Date
	 * - java.util 패키지에 속한 날짜와 시간을 다를 목적으로 만들어진 클래스 (JDK 1.0)
	 * - Date의 메서드는 대부분 deprecated(비권장) 되어있지만 여전히 사용
	 */
	
	public void method1() {
		
		// 기본 생성자로 객체를 생성하면 현재 시스템의 시간에 대한 정보를 가지고 객체 생성
		Date today = new Date();
		System.out.println(today); //Tue Jun 13 14:06:41 KST 2023
		
		//1970년 1월 1일 00시 -> 한국 표준 시간(KST)으로 출력될 땐 그리니치 평균시(GMT) 보다 +9 증가된 시간으로 표시
		Date when = new Date(0);
		System.out.println(when); //Thu Jan 01 09:00:00 KST 1970 -가장기본베이스로되어있는거
		
		System.out.println();
		
		//Deprecated된 기능들!
		System.out.println("getYear : " + (today.getYear() + 1900) + "년"); //2023년
		System.out.println("getMonth : " + (today.getMonth() + 1) + "월"); //6월
		System.out.println("getDate : " + (today.getDate()) + "일");
		System.out.println("getHours : " + (today.getHours()) + "시");
		System.out.println("getMinutes : " + (today.getMinutes()) + "분");
		System.out.println("getSeconds : " + (today.getSeconds()) + "초");
		
		System.out.println();
		
		/*
		 * SimpleDateFormat 클래스 : 날짜 데이터를 원하는 형태로 출력할 수 있도록
		 * -y : 년도
		 * -M : 월
		 * -D : 년의 몇번째 일
		 * -d : 월의 몇번째 일
		 * -E : 요일
		 * -a : 오전/오후
		 * -H : 시간(0~23)
		 * -h : 시간(1~12)
		 * -m : 분
		 * -s : 초
		 */
		
		SimpleDateFormat sdf = new SimpleDateFormat("yy-MM-dd HH:mm:ss");
		String formatDate = sdf.format(today);
		System.out.println(formatDate); //23-06-13 14:20:46
		
		// 2023년 6월 13일 (화) 오후 2시 21분 10초
		sdf = new SimpleDateFormat("yyyy년 MM월 dd일 (E) a hh시 mm분 ss초");
		formatDate = sdf.format(today);
		System.out.println(formatDate);
		
	}
	
	
	/*
	 * Calendar
	 * - Date 클래스를 개선한 추상 클래스 (JDK 1.1)
	 * - 여전히 단점이 존재
	 * 
	 */

	
	public void method2() {
		
//		Calendar cal = new Calendar(); 추상클래스는 객체 생성X
		Calendar today = Calendar.getInstance();
		System.out.println(today);
		today = new GregorianCalendar(); // 태국은 BuddhistCalendar
		System.out.println(today);
		
		System.out.println();
		
		System.out.println("YEAR : " + today.get(Calendar.YEAR) + "년");
		System.out.println("MONTH : " + (today.get(Calendar.MONTH)+1) + "월"); //월은 0부터시작해서 1을더해줘야됨
		System.out.println("DATE : " + today.get(Calendar.DATE) + "일");
		System.out.println("HOUR : " + today.get(Calendar.HOUR) + "시");
		System.out.println("HOUR_OF_DAY : " + today.get(Calendar.HOUR_OF_DAY) + "시");
		System.out.println("MINUTE : " + today.get(Calendar.MINUTE) + "분");
		System.out.println("SCONDE : " + today.get(Calendar.SECOND) + "초");
		
		System.out.println();
		
		//날짜 지정
		Calendar date = Calendar.getInstance();
		date.set(2023, Calendar.MAY, 15, 9, 0, 0);
		System.out.println(date);
		System.out.println(date.getTime().toString());
		
		System.out.println();
		
		long timeInMillis = date.getTimeInMillis();
		System.out.println("1000분의 1초 : " + timeInMillis);
		long second = timeInMillis/1000;
		System.out.println("초 : " + second);
		long minute = second/60;
		System.out.println("분 : " + minute);
		long hour = minute/60;
		System.out.println("시간 : " + hour);
		long day = hour/24;
		System.out.println("일 : " + day);
		long year = day/365;
		System.out.println("년 : " + year);
		
		System.out.println();
		
		// SimpleDateFormat 클래스 사용!
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String formatDate = sdf.format(date.getTime());
		System.out.println(formatDate);
		
		
	}
	
	
	//Date와 Calendar 간의 변환
	public void method3() {
		
		//1. Calendar -> Date
		Calendar cal = Calendar.getInstance();
		Date d = new Date(cal.getTimeInMillis());
		System.out.println(d);
		
		//2. Date -> Calendar
		Date d2 = new Date();
		Calendar cal2 = Calendar.getInstance();
		cal2.setTime(d2);
		System.out.println(cal2.getTime().toString());
		
		
	}
	
	//자신이 태어난 날을 yyyy/MM/dd 형태로 입력받아 해당 날짜가 무슨 요일이었는지, 지금까지 며칠이 지났는지 계산
	//입력된 형식이 잘못된 경우 다시 입력받기
	public void practice() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("자신이 태어난 날 입력(yyyy/MM/dd) :");
		String a = sc.nextLine();
		
		//1. String 클래스의 split 메서드를 이용하는 방법
		//split(String regex) : 입력받은 구분자로 문자열을 분리해서 문자열의 배열로 담아서 리턴
		String[] strArr = a.split("/");
		int b = Integer.parseInt(strArr[0]);
		int c = Integer.parseInt(strArr[1]);
		int d = Integer.parseInt(strArr[2]);
		
		Calendar date = Calendar.getInstance();
		date.set(b, c-1, d);
		
		switch() {
		
		}
		
		
		
		
		
		
		
		
		
		
		
		
//		boolean b = true;
//		
//		while(b) {
//			
//			System.out.println("요일 : " +);
//			
//		}
		
		
		
	}

}