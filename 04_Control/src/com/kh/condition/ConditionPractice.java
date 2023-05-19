package com.kh.condition;

import java.util.Scanner;

public class ConditionPractice {
	
	Scanner sc = new Scanner(System.in);

    /*
       키보드로 정수를 입력 받은 정수가 양수이면서 짝수일 때만 “짝수다”를 출력하고
       짝수가 아니면 “홀수다“를 출력하세요.
       양수가 아니면 “양수만 입력해주세요.”를 출력하세요.
    
       숫자를 한 개 입력하세요 : -8
       양수만 입력해주세요.
     */
	
    public void practice1() {
    	
    	System.out.print("숫자 한 개 입력하세요 : ");
    	int a = sc.nextInt();
    	
        if(a % 2 == 0 && a > 0) {
			System.out.println("짝수다");
		} if(a % 2 == 1) {
			System.out.println("홀수다");
		} if(a < 0) {
			System.out.println("양수만 입력해주세요.");
		}
		
    }
		


    /*
        정수 num1과 num2가 매개변수로 주어진다. 두 수가 같으면 1 다르면 -1을 출력하세요.

        num1 : 2
        num2 : 3
        -1

        num1 : 11
        num2 : 11
        1
     */
    public void practice2() {
    	System.out.print("num1 : ");
    	int a = sc.nextInt();
    	
    	System.out.print("num2 : ");
    	int b = sc.nextInt();
    	
    	if(a == b) {
    		System.out.println(1);
    	} else {
    		System.out.println(-1);
    	}
    	
        
    }

    /*
        A 피자가게는 피자를 두 조각에서 열 조각까지 원하는 조각 수로 잘라준다.
        피자 조각 수와 피자를 먹는 사람의 수를 입력받아 한 사람 당 최소 한 조각 이상 피자를 먹으려면 
        최소 몇 판의 피자를 시켜야 하는지 출력하세요.

        피자 조각 수 : 7
        피자 먹는 사람 수 : 10
        2

     */
    public void practice3() {
    	
    	System.out.print("피자 조각 수 : ");
    	int a = sc.nextInt();
    	
    	System.out.print("피자 먹는 사람 수 : ");
    	int b = sc.nextInt();
    	
    	int c = b / a;
//	    int result = (b % a == 0) ? c : ++c;		
//  	System.out.print(result);
		
		if(b % a == 0) {
			System.out.println(c);
		} else {
			System.out.println(++c);
		}
    	 	        
    }

    /*
        국어, 영어, 수학 세 과목의 점수를 키보드로 입력 받고 합계와 평균을 계산하고
        합계와 평균을 이용하여 합격 / 불합격 처리하는 기능을 구현하세요.
        (합격 조건 : 세 과목의 점수가 각각 40점 이상이면서 평균이 60점 이상일 경우)
        합격 했을 경우 과목 별 점수와 합계, 평균, “축하합니다, 합격입니다!”를 출력하고
        불합격인 경우에는 “불합격입니다.”를 출력하세요.
    
        국어점수 : 88 
        수학점수 : 50 
        영어점수 : 40 
        불합격입니다.

        국어점수 : 88
        수학점수 : 50
        영어점수 : 45
        국어 : 88
        수학 : 50
        영어 : 45
        합계 : 183
        평균 : 61.0
        축하합니다, 합격입니다!
     */
    public void practice4() {
    	
    	System.out.print("국어점수 : ");
    	int a = sc.nextInt();
    	
    	System.out.print("수학점수 : ");
    	int b = sc.nextInt();
    	
    	System.out.print("영어점수 : ");
    	int c = sc.nextInt();
    	
    	int i = a+b+c;
    	int j = i / 3;
    	
    	if(a >= 40 && j >= 60) { System.out.println("국어 : " + a);}
    	if(b >= 40 && j >= 60) { System.out.println("수학 : " + b);}
    	if(c >= 40 && j >= 60) { System.out.println("영어 : " + c);}
    	if(a >= 40 && b >= 40 && c >= 40 && j >= 60) { System.out.println("합계 : " + i);}
    	if(a >= 40 && b >= 40 && c >= 40 && j >= 60) { System.out.printf("평균 : " + "%.1f \n" , (double)j);}
    	if(a >= 40 && b >= 40 && c >= 40 && j >= 60) { System.out.println("축하합니다, 합격입니다!");}
    	else { System.out.println("불합격입니다.");}
    	  	
      }

    /*
        B 옷가게는 10만 원 이상 사면 5%, 30만 원 이상 사면 10%, 50만원 이상 사면 20%를 할인해준다.
        구매한 옷의 가격을 입력했을 때, 지불해야 할 금액을 출력하세요.
        
        구매한 옷 가격 : 580,000
        464,000
     */
    public void practice5() {
    	
    	System.out.print("구매한 옷 가격 : ");
    	int a = sc.nextInt();
    	
    	double b = a * 0.05;
    	double c = a * 0.1;
    	double d = a * 0.2;

    	if(a >= 100000 && a < 300000) {System.out.println(a - (int)b);}
    	else if(a >= 300000 && a < 500000) {System.out.println(a - (int)c);}
    	else if(a >= 500000) {System.out.println(a - (int)d);}
    	else {System.out.println(a);}

    }


    /*
        각에서 0도 초과 90도 미만은 예각, 90도는 직각, 90도 초과 180도 미만은 둔각 180도는 평각으로 분류한다.
        입력받은 각에 따라 예각일 때 1, 직각일 때 2, 둔각일 때 3, 평각일 때 4를 출력하세요.
     */
    public void practice6() {
    	
    	System.out.print("각을 입력하시오 > ");
    	int a = sc.nextInt();
    	
    	if(a > 0 && a < 90) {System.out.print(1);}
    	if(a == 90) {System.out.print(2);}
    	if(a > 90 && a < 180) {System.out.print(3);}
    	if(a == 180) {System.out.print(4);}
    	
    }

    /*
      아이디, 비밀번호를 정해두고 로그인 기능을 작성하세요.
      로그인 성공 시 “로그인 성공”, 
      아이디가 틀렸을 시 “아이디가 틀렸습니다.“,
      비밀번호가 틀렸을 시 “비밀번호가 틀렸습니다.”를 출력하세요.

      아이디 : happy
      비밀번호 : 1234
      로그인 성공!
 
      아이디 : happy
      비밀번호 : 23467
      비밀번호가 틀렸습니다.

      아이디 : happy222
      비밀번호 : 1234
      아이디가 틀렸습니다.
    */
    public void practice7() {
    	
//        String name = "";
//		
//		System.out.print("이름을 입력해주세요 >");
//		name = sc.nextLine();
//		
//		System.out.println("김경미" == name); // false
//		System.out.println("김경미".equals(name)); // true, String 클래스의 equals() 메소드
//		System.out.println("김경미".charAt(0)); // String 클래스의 charAt(0) 메소드
//		
//		// 본인이면 "본인이다.", 본인이 아니라면 "본인이 아니다."
//		
//		if ("김경미".equals(name)) { 
//			System.out.println("본인이다.");
//		}
//		else {
//			System.out.println("본인이 아니다.");
//		}
    	
    	
    	int pw = 1234;
    	
    	System.out.print("아이디 : ");
    	String id = sc.nextLine();
    	
    	System.out.print("비밀번호 : ");
    	int b = sc.nextInt();
    	
    	if("Happy".equals(id)) {System.out.println("로그인 성공!");}
    	else {System.out.println("아이디가 틀렸습니다.");}
        if (b == pw) {System.out.println("로그인 성공!");}
        else {System.out.println("비밀번호가 틀렸습니다.");}
//    	else if(a == id) {System.out.println("비밀번호가 틀렸습니다.");}
//    	else if(b != pw) {System.out.println("비밀번호가 틀렸습니다.");}
//    	else if(a != id) {System.out.println("아이디가 틀렸습니다.");}
//    	else if(b == pw){System.out.println("아이디가 틀렸습니다.");}
    	

//    	 if(a != id && b == pw)
 
    }

    /*
        키, 몸무게를 double로 입력 받고 BMI지수를 계산하여 계산 결과에 따라
        저체중 / 정상체중 / 과체중 / 비만을 출력하세요.
        BMI = 몸무게 / (키(m) * 키(m))
        BMI가 18.5미만일 경우 저체중 / 18.5이상 23미만일 경우 정상체중
        BMI가 23이상 25미만일 경우 과체중 / 25이상 30미만일 경우 비만
        BMI가 30이상일 경우 고도 비만

        키(m)를 입력해 주세요 : 1.62
        몸무게(kg)를 입력해 주세요 : 46
        BMI 지수 : 17.527815881725342
        저체중

     */
    public void practice8() {
    	
    	System.out.print("키(m)를 입력해 주세요: ");
    	double a = sc.nextDouble();
    	
    	System.out.print("몸무게(kg)을 입력해 주세요 : ");
    	double b = sc.nextDouble();
    	
    	double bmi = b / (a * a); 
    	System.out.println(bmi);
    	
    	if(bmi < 18.5) {System.out.println("저체중");}
    	if(bmi >= 18.5 && bmi < 23) {System.out.println("정상체중");}
    	if(bmi >= 23 && bmi < 25) {System.out.println("과체중");}
    	if(bmi >= 25 && bmi < 30) {System.out.println("비만");}
    	if(bmi >= 30) {System.out.println("고도 비만");}
    	
    	
       
    }

    /*
        키보드로 두 개의 양수와 연산 기호를 입력 받아 연산 기호에 맞춰 연산 결과를 출력하세요.
        (단, 양수가 아닌 값을 입력하거나 제시되어 있지 않은 연산 기호를 입력 했을 시
        “잘못 입력하셨습니다. 프로그램을 종료합니다.” 출력)

        피연산자1 입력 : 15
        피연산자2 입력 : 4
        연산자를 입력(+,-,*,/,%) : /
        15 / 4 = 3

     */
    public void practice9() {
    	
    	System.out.print("피연산자1 입력 : ");
    	int a = sc.nextInt();
    	
    	System.out.print("피연산자2 입력 : ");
    	int b = sc.nextInt();
    	
    	System.out.print("연산자를 입력(+,-,*,/,% : ");
    	int c = sc.nextInt();
    	
//    	if(a < 0 || b < 0 || c != + || c != - || c != * || c != / || c != % ) {System.out.println("잘 못 입력 하셨습니다. 프로그램을 종료 합니다.");}
//    	if else ()
    	
    	

    }

    /*
      아래 예시와 같이 메뉴를 출력하고 메뉴 번호를 누르면 “OO메뉴입니다“를,
      종료 번호를 누르면 “프로그램이 종료됩니다.”를 출력하세요

        1. 입력
        2. 수정
        3. 조회
        4. 삭제
        9. 종료
        메뉴 번호를 입력하세요 : 3
        조회 메뉴입니다.
     */
    public void practice10() {

    }

    /*
        중간고사, 기말고사, 과제점수, 출석회수를 입력하고 Pass 또는 Fail을 출력하세요.
        총 점 100점 중 배점으로는 다음과 같다.
        중간고사 (20%), 기말고사 (30%), 과제 (30%), 출석 (20%)

        이 때, 출석 회수는 총 강의 회수 20회 중에서 출석한 날만 입력

        총 점이 70점 이상이면서 전체 강의의 70%이상 출석을 했을 경우 Pass,
        아니면 Fail을 출력하세요.


        중간 고사 점수 : 80
        기말 고사 점수 : 90
        과제 점수 : 50
        출석 회수 : 15
        ===========결과==========
        중간 고사 점수(20) : 16.0
        기말 고사 점수(30) : 27.0
        과제 점수 (30) : 15.0
        출석 점수 (20) : 15.0
        총점 : 73.0
        PASS

        중간 고사 점수 : 80
        기말 고사 점수 : 30
        과제 점수 : 60
        출석 회수 : 18
        ===========결과==========
        FAIL [점수 미달] (총점 61.0)

        중간 고사 점수 : 90
        기말 고사 점수 : 100
        과제 점수 : 80
        출석 회수 : 13
        ===========결과==========
        FAIL [출석 횟수 부족] (13/20)

        중간 고사 점수 : 100
        기말 고사 점수 : 80
        과제 점수 : 40
        출석 회수 : 10
        ===========결과==========
        FAIL [출석 횟수 부족] (10/20)
        FAIL [점수 미달] (총점 66.0)

     */
    public void practice11() {
        
    }
    
    public static void main(String[] args) {
		
    	ConditionPractice cp  = new ConditionPractice();
//    	cp.practice1();
//    	cp.practice2();
//    	cp.practice3();
//    	cp.practice4();
//    	cp.practice5();
//    	cp.practice6();
    	cp.practice7();
//    	cp.practice8();
//    	cp.practice9();
    	
    }
}