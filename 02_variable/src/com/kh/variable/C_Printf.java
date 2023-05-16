package com.kh.variable;

public class C_Printf {
	public static void main(String[] args) {
		
		// Systeom.out.print(출려하고자하는값); - 출려만 함(줄바꿈 발생x)
		// Systeom.out.println(출려하고자하는값); - 출력 후 줄바꿈 발생o
		
		System.out.print("hello\n"); // hello 출력 \n=Enter의미 줄바꿈 
		System.out.println("hello"); // hello 출력 ln=줄바꿈
		
		// System.out.printf("출력하고자하는형식(포맷)", 출력하고자하는값, 값, ...);
		// 출력하고자 하는 값들이 제시한 형식에 맞춰서 출력만 진행
		
		/*
		 *  포맷으로 쓰이는 키워드
		 *  %d : 정수
		 *  %f : 실수
		 *  %c : 문자
		 *  %s : 문자열 (문자도 가능)
		 * */
		
		int iNum1 = 10;
		int iNum2 = 20;
		
		System.out.println(iNum1 +  "%" ); // 10% 출력
		System.out.println(iNum2 +  "%" ); // 20% 출력
		System.out.println(iNum1 +  "% " + iNum2 +  "%" ); // 10% 20% 출력
		System.out.printf("%d%% %d%%", iNum1, iNum2); // 10% 20% 출력 -%는 문자이기 때문에 위와 같이 포맷 키워드로 인식하지 않게 하기 위해서 %앞에 %를 한개 더 붙여준다.
		
		System.out.println("----------------");
		
		// %5d -> 정수를 5칸의 공간을 확보 후 오른쪽 정렬 (홀수면 왼쪽)
		System.out.printf("%5d\n", iNum1);
		System.out.printf("%5d\n", 250);
		System.out.printf("%5d\n", -12);
		
		System.out.println("----------------");
		
		double dNum1 = 1.23456789;
		double dNum2= 4.53;
		
		//무조건 소수점 아래 6째자리까지 보여줌
		System.out.printf("%f\t%f\n", dNum1, dNum2); // \t=tap의미
		System.out.printf("%.3f\t%.2f\n", dNum1, dNum2); //%.2f->.2를 선언 두번째자리까지 표시, 1.235	4.53출력
		
		System.out.println("----------------");
		
		char ch = 'a';
		String str = "Hello";
		
		// a Hello a
		System.out.printf("%s %s %s", ch, str, ch);
		
		// A HELLO A
		System.out.printf("\n%S %S %S", ch, str, ch);
	}

}
