package com.kh.practice;

public class D_String {

	public static void main(String[] args) {
		
		char[] arr = "Hello, World!".toCharArray();
		
		for(char c : arr) {
			System.out.println(c);
		}
		
		/*
		 * 문자열 : 문자의 배열, 여러 개의 문자가 배열을 이룬 것이 문자열
		 * 자바에서는 문자는 작은 따음표('), 문자열은 큰 따음표(")를 사용해서 나타낼 수 있음
		 * 
		 * -String.charAT(int index)
		 *   : 인덱스에 있는 문자를 char 형식으로 반환
		 *   
		 * -String.toCharArray()
		 *  : 모든 문자가 들어 있는 char[] 형식의 데이터를 반환 (문자열을 char 배열로 바꿔줌) 
 		 */

	}
	
	/* ArrayIndexOutOfBoundsException
	 * --> 배열의 인덱스 범위를 벗어나서 발생하는 에러!
	 * 해결책 : 조건식 수정 (i < 배열의 길이, i <=  배열의 길이 -1)
	 */

}

