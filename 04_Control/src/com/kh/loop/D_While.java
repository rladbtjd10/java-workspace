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
    	  * [표형법]
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
    	   	 
    	 double random = Math.random();
    	 random = Math.random() * 100 + 1;
         int num = (int)random;
         int t = 0;

    	 while(true) {
    		 System.out.print("1과 100사이의 값 입력 >");
    		 int g = sc.nextInt();	
    		 t += 1;
    		 
    		 if(g < num) {System.out.println("더 큰 수를 입력하세요.");}
    		 else if(g > num) {System.out.println("더 작은 수를 입력하세요.");}
    		 else if(g == num) {System.out.println( t +"번 만에 맞혔습니다."); break;}
    		 
    		 }

    	 }
    	 


	public static void main(String[] args) {
		D_While d = new D_While();
//		d.method1();
//		d.method2();
//		d.method3();
//		d.method4();
		d.method5();
		
		

	}

}


