package com.kh.loop;
import java.util.Scanner;

public class D_While {
	
	Scanner sc = new Scanner(System.in);
	
	/*
	 * while문
	 * 
	 * while(조건식) {
	 *     ..실행 코드
	 *     }
	 */
	
	public void method1(){
		for(int i=1; i<=5; i++) {
			System.out.println(i);
		}
		System.out.println();
			
			int i=1;
			while(i<=5) {
				System.out.println(i);
				i++;
			}
		}

	
	public void method2(){
		
		/*
		 * break문
		 * - switch, 반복문을 실행을 중지하고 빠져나갈 떄 사용
		 * - 반복문이 중첩되는 경우 break문이 포함되어 있는 반복문에서만 빠져나간다.
		 */
	
		//for문 무한루트
		for(int i=1; ; ) {
			if(i<=5) { System.out.println(i);
		} else { break;}
		}	
		
	}
	
	public void method3(){
		//while문 무한루프
		int input = 0;
		while(true) { 
			System.out.print("숫자 입력 >");
			input =sc.nextInt();
		
			System.out.println(input);
		}
		
	}
	
		

     public void method4(){
    	 
    	 /*do while문
    	  * 
    	  * [표현법]
    	  * do {
    	  * ..실행 코드..
    	  * } while(조건식);
    	  * 
    	  * - 조건과 상관없이 무조건 한번은 실행
    	  */
    	 
    	 int num =1;
    	 while(num == 0) {
    		 System.out.print("whil문");
    	 }
    	 
    	 do {
    		 System.out.print("do-whil문");
    	 } while(num == 0);
    	 
     }
     
     //반복문 + 조건문
     public void method5(){
    	 
    	 /*
    	  * 숫자 맞히기 게임!
    	  * 1과 100 사이의 값을 입력해서 임의로 지정한(Random) 값을 맞히면 게임 끝!
    	  * 
    	  * 게임이 끝나면 몇 번만에 숫자를 맞혔는지 출력!
    	  * 
    	  * 1과 100 사이의 값 입력 >
    	  * (예 : 57)
    	  * 1과 100 사이의 값 입력 > 35
    	  * 더 큰 수를 입력하세요.
    	  * 1과 100 사이의 값 입력 > 70
    	  * 더 작은 수를 입력하세요.
    	  * 1과 100 사이의 값 입력 > 57
    	  * 3번 만에 맞혔습니다.
    	  * 
    	  */
    	   	 
    	 double answer = (int)Math.random()*100 + 1;
//    	 random = Math.random() * 100 + 1;
    	 
    	 int input = 0;  
    	 int count = 0;
//       int num = (int)random;
//       int t = 0;


    	 while(true) {
    		 count++;
//    		 t +=1
    		 System.out.print("1과 100사이의 값 입력 >");
    		 input = sc.nextInt();	
    		 
    		 if(answer > input) {System.out.println("더 큰 수를 입력하세요.");}
    		 else if(answer < input) {System.out.println("더 작은 수를 입력하세요.");}
    		 else {System.out.println( count +"번 만에 맞혔습니다."); break;}
    		 
    		 }

    	 }
     
     public void method6(){
    	 
    	 /*
    	  * ---------------------------------
    	  * 1. 예금 | 2. 출금 | 3. 잔고 | 4.종료 
    	  * ---------------------------------
    	  * 선택 > 1
    	  * 잔고 > 5000
    	  * 
    	  * ---------------------------------
    	  * 1. 예금 | 2. 출금 | 3. 잔고 | 4.종료 
    	  * ---------------------------------
    	  * 선택 > 2
    	  * 잔고 > 2000
    	  * 
    	  * ---------------------------------
    	  * 1. 예금 | 2. 출금 | 3. 잔고 | 4.종료 
    	  * ---------------------------------
    	  * 선택 > 3
    	  * 잔고 > 3000
    	  * 
    	  * ---------------------------------
    	  * 1. 예금 | 2. 출금 | 3. 잔고 | 4.종료 
    	  * ---------------------------------
    	  * 선택 > 4
    	  * 프로그램 종료
    	  */
    	 
    	 int balance  = 0;
    	 boolean run = true;
    	 
    	 while(run){
    	 System.out.println("---------------------------------");
    	 System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4.종료");
    	 System.out.println("---------------------------------");
    	 
    	 System.out.print("선택 > ");
    	 // Integer.parseInt : Integer 클래스의 parseInt 메소드(문자열 -> 숫자로 인식해주는 메소드)
    	 // String -> int
    	 int menu = Integer.parseInt(sc.nextLine());
    	 
    	 switch(menu) {
    	 case 1: System.out.print("예금액 > ");
    	         balance += Integer.parseInt(sc.nextLine());
    	         break;
    	 case 2: System.out.print("출금액 > ");
    	         balance -= Integer.parseInt(sc.nextLine());
    	         break;
    	 case 3: System.out.print("잔고 > ");
    	         System.out.println(balance);
    	         break;
    	 case 4: 
    		 run = false;
    		 break; 
    	 }
    	 }System.out.print("프로그램 종료");
    	 }
    	 
    
    	 


	public static void main(String[] args) {
		D_While d = new D_While();
//		d.method1();
//		d.method2();
		d.method3();
//		d.method4();
//		d.method5();
//		d.method6();
		
		
		

	}

}


