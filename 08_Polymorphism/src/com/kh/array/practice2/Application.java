package com.kh.array.practice2;

import java.util.Scanner;

import com.kh.array.practice2.controller.MemberController;
import com.kh.array.practice2.model.Member;

public class Application {
	
	private Scanner sc = new Scanner(System.in);
	private MemberController mc = new MemberController();

	public static void main(String[] args) {
		
		Application app = new Application();
		app.mainMenu();
		
		// mainMenu 호출
		
		
	}
	
	public void mainMenu() {
		
		boolean a = true;
		
		while(a) {
			// 현재 등록된 회원 수에 따라 메인 메뉴 다르게 출력 /현재 등록된 회원 수가 3명 미만일 경우
			// 현재 등록된 회원 수가 10명일 때 / 회원 수가 모두 꽉 찼기 때문에 일부 메뉴만 오픈됩니다
			// 메뉴 번호에 없는 번호를 누를 시 “잘못 입력하셨습니다. 다시 입력해주세요.” 출력 후 메뉴 반복
		System.out.println("최대 등록 가능한 회원 수는 3명입니다.");
		System.out.println("현재 등록된 회원 수는" + mc.count +"입니다.");
		if(mc.count < 3) {System.out.println("1. 새 회원 등록");} 
		else {System.out.println("회원 수가 모두 꽉 찾기 때문에 일부 메뉴만 오픈됩니다.");}
		
		System.out.println("2. 회원 정보 수정");
		System.out.println("3. 전체 회원 정보 출력");
		System.out.println("9. 끝내기");
		
		System.out.print("메뉴 번호 : ");

		
		switch(Integer.parseInt(sc.nextLine())){
		
		case 1:
			this.insertMember(); break;
		case 2:
			this.updateMember(); break;
		case 3:
			this.printAll(); break;
		case 9:
			a=false; break;
		default :
			System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
			
			System.out.println("2. 회원 정보 수정");
			System.out.println("3. 전체 회원 정보 출력");
			System.out.println("9. 끝내기");
			System.out.println("메뉴 번호 : ");
			
			
		}
		
		}
	}
	public void insertMember() {
		// 기존 회원 아이디가 있는 경우 “중복된 아이디입니다. 다시 입력해주세요.” 출력
		System.out.print("아이디 : ");
		String id = sc.nextLine();
		
		// mc.checkId 활용! 중복된 아이디 체크!
		if(mc.checkId(id)!=-1) { // 회원 정보 일때(회원정보가 아닌게 아닐때)
			System.out.println("중복된 아이디입니다. 다시 입력해주세요.");
			this.insertMember();
		}else {
			System.out.print("이름 : ");
			String name = sc.nextLine();
			
			System.out.print("비밀번호 : ");
			String password = sc.nextLine();
			
			System.out.print("이메일 : ");
			String email = sc.nextLine();
			
			System.out.print("성별(M/F) : ");
			char gender = sc.nextLine().charAt(0);
			
			System.out.print("나이 : ");
			int age = Integer.parseInt(sc.nextLine());
			
			//1번의 경우
//			mc.insertMember(id, name, password, email, gender, age);
			
			//2번의 경우 - 생성자로 값 임시 저장해서 넘기고 있음!
	        Member m = new Member(id, name, password, email, gender, age); // 위에 입력해준값을 받아서 controller에 저장하고 mc.insertMember(m)으로 다시 빼옴
	        
	        //2번의 경우 - setter로 값을 임시 저장해서 넘기기! 위에꺼랑 같은의미!
	        /*
	        Member m = new Member();
	        m.setId(id);
	        m.setName(name);
	        m.setPassword(password);
	        m.setEmail(email);
	        m.setGender(gender);
	        m.setAge(age);
	        */
	        mc.insertMember(m);
		}
		
	}
	public void updateMember() {
		// id를 조회해서 회원 정보가 없다면 “회원 정보가 없습니다.” 출력
		
		System.out.print("수정할 회원의 아이디 : ");
		String id = sc.nextLine();
		
		if(mc.checkId(id)==-1) { //회원 정보가 아닐때
			System.out.println("회원 정보가 없습니다.");
			return;
			
		}
		
		
		System.out.print("수정할 이름 : ");
		String name = sc.nextLine();
		
		System.out.print("수정할 이메일 : ");
		String email = sc.nextLine();
		
		System.out.print("수정할 비밀번호 : ");
		String password = sc.nextLine();

		mc.updateMember(id, name, password, email);
	}
	
	public void printAll() {
		// 저장된 회원 정보 출력
		
		Member[] mArr = mc.printAll();
		for(Member m : mArr) {
			if(m!=null) System.out.println(m);
		}

		
	}


}
