package com.kh.practice1;

import java.util.Scanner;

import com.kh.practice1.controller.MusicController;
import com.kh.practice1.model.Music;

public class Application {

	private Scanner sc = new Scanner(System.in);
	private MusicController mc = new MusicController();

	public static void main(String[] args) {
		Application app = new Application();
		app.mainMenu();
	}

	public void mainMenu() {

		// 메뉴 화면 반복 실행 처리
		boolean check = true;

		try {
			while (check) {
				System.out.println("===================== 메인 메뉴 ==========================");
				System.out.println("1. 마지막 위치에 곡 추가"); // addList() 실행
				System.out.println("2. 첫 위치에 곡 추가"); // addAtZero()
				System.out.println("3. 전체 곡 목록 출력");// printAll()
				System.out.println("4. 특정 곡 검색 ");// searchMusic()
				System.out.println("5. 특정 곡 삭제"); // removeMusic()
				System.out.println("6. 특정 곡 수정"); // setMusic()
				System.out.println("7. 곡 명 오름차순 정렬"); // ascTitle()
				System.out.println("8. 가수 명 내림차순 정렬"); // descArtist()
				System.out.println("9. 종료"); // “종료” 출력 후 main()으로 리턴
				System.out.print("메뉴 번호 입력 : ");
				
				switch (Integer.parseInt(sc.nextLine())) {
				case 1:
					System.out.println("addList 실행");
					addList();
					break;
				case 2:
					System.out.println("addAtZero");
					addAtZero();
					break;
				case 3:
					System.out.println("printAll 실행");
					printAll();
					break;
				case 4:
					System.out.println("searchMusic 실행");
					searchMusic();
					break;
				case 5:
					System.out.println("removeMusic 실행");
					removeMusic();
					break;
				case 6:
					System.out.println("setMusic 실행");
					setMusic();
					break;
				case 7:
					System.out.println("ascTitle 실행");
					ascTitle();
					break;
				case 8:
					System.out.println("descArtist 실행");
					descArtist();
					break;
				case 9:
					System.out.println("메인 메뉴 종료");
					check = false;
					break;
				}
			}
		} catch (Exception e) {
			System.out.println("잘못 입력하셨습니다 : " + e.getMessage());
			mainMenu();
		}
	}

	public void addList() {

		System.out.println("****** 마지막 위치에 곡 추가 ******");
		
		// 곡 명과 가수 명을 사용자에게 입력 받는다.
		System.out.print("곡 명 : ");
		String title = sc.nextLine();
		
		System.out.print("가수 명 : ");
		String artist = sc.nextLine();
		
		// MusicController에 addList()를 이용해서 입력한 정보를 넘기고
		// 추가 성공 시 “추가 성공”, 추가 실패 시 “추가 실패” 콘솔창에 출력
		if (mc.addList(new Music(title, artist))) {
			System.out.println("추가 성공");
		} else {
			System.out.println("추가 실패");
		}
	}

	public void addAtZero() {
		System.out.println("****** 첫 위치에 곡 추가 ******");
		
		// 곡 명과 가수 명을 사용자에게 입력 받는다.
		System.out.print("곡 명 : ");
		String title = sc.nextLine();
		
		System.out.print("가수 명 : ");
		String artist = sc.nextLine();

		// MusicController에 addAtZero()를 이용해서 입력한 정보를 넘기고
		// 추가 성공 시 “추가 성공”, 추가 실패 시 “추가 실패” 콘솔 창에 출력
		if (mc.addAtZero(new Music(title, artist))) {
			System.out.println("추가 성공");
		} else {
			System.out.println("추가 실패");
		}
	}

	public void printAll() {
		System.out.println("****** 전체 곡 목록 출력 ******");
		// MusicController에 printAll() 반환 값을 출력한다
		for (Music music : mc.printAll()) {
			System.out.println(music);
		}
	}

	public void searchMusic() {
		System.out.println("****** 특정 곡 검색 ******");
		
		System.out.print("검색할 곡 명 : ");
		Music music = mc.searchMusic(sc.nextLine());

		if (music != null) {
			System.out.println(music + "을 검색 했습니다.");
		} else {
			System.out.println("검색할 곡이 없습니다.");
		}
		// 사용자에게 곡 이름을 받고 MusicController에 있는 searchMusic으로 값을 넘긴다.
		// searchMusic()의 반환 값에 따라 반환 값이 없으면 “검색한 곡이 없습니다.”
		// 반환 값이 있으면 “가수 명 – 곡 명 을 검색 했습니다.” 콘솔 창에 출력
	}

	public void removeMusic() {
		System.out.println("****** 특정 곡 삭제 ******");
		
		System.out.print("삭제할 곡 명 : ");
		Music music = mc.removeMusic(sc.nextLine());

		if (music != null) {
			System.out.println(music + "을 삭제 했습니다.");
		} else {
			System.out.println("삭제할 곡이 없습니다.");
		}
		// 사용자에게 삭제할 곡의 이름을 직접 받고 MusicController에 removeMusic으로
		// 값을 넘긴다. removeMusic()의 반환 값에 따라 반환 값이 없으면 “삭제할 곡이 없습니다.”
		// 반환 값이 있으면 “가수 명 – 곡 명을 삭제 했습니다.” 콘솔 창에 출력
	}

	public void setMusic() {
		System.out.println("****** 특정 곡 정보 수정 ******");
		
		System.out.print("검색할 곡 명 : ");
		String title = sc.nextLine();

		Music music = new Music();
		System.out.print("수정할 곡 명 : ");
		music.setTitle(sc.nextLine());
		
		System.out.print("수정할 가수 명 : ");
		music.setArtist(sc.nextLine());

		Music result = mc.setMusic(title, music); // Music

		if (result != null) {
			System.out.println(result + "의 값이 변경 되었습니다.");
		} else {
			System.out.println("수정할 곡이 없습니다.");
		}

		// 사용자에게 수정할 곡을 입력 하여 MusicController에 setMusic으로 검색 할 수 있게
		// 값을 넘기며 수정할 곡 명과 가수 명을 받아 setMusic으로 값을 넘긴다.
		// 검색 결과 값이 없으면 “수정할 곡이 없습니다.”, 검색 결과 값이 있고
		// 수정 했으면 “가수 명 – 곡 명의 값이 변경 되었습니다.” 콘솔 창에 출력
	}

	public void ascTitle() {
		System.out.println("****** 곡 명 오름차순 정렬 ******");

		for (Music music : mc.ascTitle()) {
			System.out.println(music);
		}
		// MusicController에 ascTitle()의 값에 따라 정렬
	}

	public void descArtist() {
		System.out.println("****** 가수 명 내림차순 정렬 ******");

		for (Music music : mc.descArtist()) {
			System.out.println(music);
		}
		// musicController에 descArtist()의 값에 따라 정렬
	}
}
