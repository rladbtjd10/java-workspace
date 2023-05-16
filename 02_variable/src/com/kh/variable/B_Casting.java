package com.kh.variable;

public class B_Casting {
	
	/*
	 * 형 변환(Casting)
	 * - 값의 타입을 다른 타입으로 변환하는 것
	 * - boolean을 제외한 기본형은 서로 형변환이 가능
	 */
	public static void main(String[] args) {
		
		B_Casting b = new B_Casting();
//		b.autoCasting();
		b.casting();
	}
		
	
	/*
	 * 자동 형 변환(묵시적 형 변환)
	 * - 자동으로 형 변환이 이루어지기 때문에 따로 형변환을하지 않아도 된다.
     * - 데이터 범위가 작은 자료형을 큰 자료형으로 변환한다.
	 * */
	 
	public void autoCasting() {
		byte b = 10; // 1byte
		short s = b; // 2byte
		int i = s; // 4byte
		long l = i; // 8byte
		
		float f = 1; // 4byte(표현 가능한 수의 범위가 크기 때문에 자동 형 변환이 가능)
		double d = 1; // 8byte
		
		System.out.println("b : " + b);
		System.out.println("s : " + s);
		System.out.println("i : " + i);
		System.out.println("l : " + l);
		System.out.println("f : " + f);
		System.out.println("d : " + d);
		
		System.out.println("-------------");
		
		double result = 12 + 3.3;
		// byte, short 타입의 연산 시 무조건 int 타입으로 변환 후 처리한다.
		int result2 = b + s;
		
		System.out.println(result);
		System.out.println(result2);
}
	
	/*
	 *  강제 형 변환 (명시적 형 변환)
	 *  
	 *  [표현법] (자료형) 데이터;
	 *  
	 *  - 범위가 큰 크기의 자료형의 데이터를 작은 크기의 자료형으로 변환하려고 할 때 사용한다.
	 *  - 강제 형 변환의 경우 데이터 손실이 발생한다.
	 */
	
	public void casting() {
		double d = 4.1234567891234560; // 소수점 15자리수
		float f = (float) d; // 소수점 6자리수
		int i = (int)f; // 데이터 손실 발생		
		
		System.out.println("d :" + d); // d :4.123456789123456 출력
		System.out.println("f :" + f); // f :4.123457 출력
		System.out.println("i :" + i); // i :4 출력
		
		System.out.println("--------------------");
	
		
		int sum = (int) (i + d);
		int sum2 = i + (int)d; // 8 출력
		
		System.out.println("sum :" + sum);
		System.out.println("sum2 :" + sum2);
		
		System.out.println("--------------------");
		int number = 290;
		byte bNumber = (byte)number; // -128 ~ 127  - 34출력
		
		System.out.println(bNumber);
		
		int number2 = 128;
		byte bNumber2 = (byte)number2; // -128 출력
		System.out.println(bNumber2); 
		
		// char <-> int : 각 문자들 마다 고유한 숫자가 지정되어 있기 때문에 쌍방향으로 형 변화 가능 (유니코드)
		// char는 음수갑 저장 불가 -> 값의 변위가 0~65535
		int num = 'A'; // 자동형 변환되서 A의 유니코드 값 65 출력
		System.out.println("num : " + num);
		
		char ch = 52143; 
		System.out.println("ch : " + ch); // ch : 쮯
		
	}
	}
