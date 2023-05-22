package com.kh.loop;

import java.util.Scanner;

class LoopPractice {
	
	Scanner sc = new Scanner(System.in);
 
	/*
	 * for문
	 * 
	 * [표기법]
	 * 
	 * for(초기식; 조건식; 증감식) {
	 *        .. 실행 코드 ..
	 * }
	 * 
	 * - 주어진 횟수만큼 코드를 반복 실행하는 구문
	 * - 초기식은 반복문이 수행될때 단 한번만 실행되는 구문으로 반복문 안에서 사용하게 될 변수를 선언하고 초기값을 대입한다.
	 * - 조건식의 결과가 false이면 실행 코드를 수행하지 않고 반복문을 빠져나간다.
	 * - 증감식은 반복문을 제어하는 변수의 값을 증감시키는 구문으로 주로 초기식에 제시한 변수를 가지고 증감 연산자를 사용한다.
	 * 
	 */
	
    /*
        사용자로부터 숫자(1~100) 1개가 입력되었을 때 카운트다운 출력하시오.
        사용자 입력 : 5
        5
        4
        3
        2
        1
     */
    public void method1() {
    	System.out.print("사용자 입력 : ");
    	int a = sc.nextInt();
    	
    	for(int i=a; i>=1; i--) {
			System.out.println(i);
		}
    }
  
		
    // 1+(-2)+3+(-4)+...과 같은 식으로 계속 더해나갔을 때, 몇까지 더해야 총합이 100 이상 되는지 출력하시오.
    public void method2() {
    	
    	int sum1 = 0;
    	int sum2 = 0;
    	
    	for(int i=1; i>=0; i+=2) { sum1 += i;
 		for(int j=-2; j<0; j-=2) {
 			sum2 -= j;
 			if(sum1+sum2 == 100)continue;
 			System.out.println("1부터 " + (sum1+sum2) + "까지의 합계 = 100 ");}
 		    System.out.println("\n");}
    
    }

    /*
        사용자로부터 문자열을 입력 받고/ 문자열에서 검색될 문자를 입력 받아/ 해당 문자열에 그 문자가 몇 개 있는지 개수를 출력하세요. 

        문자열 : banana
        문자 : a
        banana 안에 포함된 a 개수 : 3

    */
    public void method3() {
    	
    	
    	System.out.print("문자열 : ");
    	String a =sc.nextLine();
    	
    	System.out.print("문자 : ");
    	String b =sc.nextLine();
    	int t = 0;
    	
    	for (int i=0; i<=a.length(); i++) {
    		
    		if(b.equals(a)	 continue;
    		t += 1;
    		System.out.println(a + "안에 포함 된 "+ b +"개수 : "+ t);
    		}		
    	

    }

    /*
        0이 나올 때까지 숫자를 출력하시오. (random 사용!)
        7
        3
        4
        2
        3
        4
        0
     */
    public void method4() {
    	
    	double random = Math.random();
   	    random = Math.random() * 10 + 1;
        int num = (int)random; 
        
        
        for(int i=num; i>=0; i--) {
        	System.out.println(i);
        }
        
    }

    /*
        주사위를 10번 굴렸을 때 각 눈의 수가 몇 번 나왔는지 출력하세요. (random 사용! 1~10)

        1 : 3
        2 : 2
        3 : 1
        4 : 0
        5 : 4
        6 : 0

     */
    public void method5() {
    	
    	double random = (int)Math.random()*10 + 1;
    	
    	

    }

    /*
        사용자의 이름을 입력하고 컴퓨터와 가위바위보를 하세요. 
        컴퓨터가 가위인지 보인지 주먹인지는 랜덤한 수를 통해서 결정하도록 하고, 사용자에게는 직접 가위바위보를 받으세요.
        사용자가 이겼을 때 반복을 멈추고 몇 번 이기고 몇 번 비기고 몇 번 졌는지 출력하세요.


        당신의 이름을 입력해주세요 : 
        가위바위보 : 가위
        컴퓨터 : 가위
        박신우 : 가위
        비겼습니다.

        가위바위보 : 가위 
        컴퓨터 : 바위
        박신우 : 가위
        졌습니다 ㅠㅠ

        가위바위보 : 보
        컴퓨터 : 바위
        박신우 : 보
        이겼습니다 !
    */
    public void method6() {

    }
    
    public static void main(String[] args) {
    	LoopPractice l = new LoopPractice();
//    	l.method1();
//    	l.method2();
//    	l.method3();
//    	l.method4();
//    	l.method5();
//    	l.method6();
    }

}