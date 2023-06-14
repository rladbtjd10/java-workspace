package com.kh.step4;

import javax.swing.JOptionPane;

public class InputThreadTest {

	public static void main(String[] args) {
		
		Thread t = new Thread(new CountingThread());
		t.start();
		
		//1. 데이터 입력 //방법2
		String input = JOptionPane.showInputDialog("최종 로또 번호를 입력하세요....");
		System.out.println("입력하신 숫자는 " + input + " 입니다."); 
		

		
//		InputThread a = new InputThread();
//		InputThread_A b = new InputThread_A();//방법2
//		
//		Thread aThread = new Thread(a, "InputThread");
//		Thread bThread = new Thread(b, "InputThread_A");
//		
//		aThread.start();
//		bThread.start(); //-방법1 클래스2개로 빼주고 이와 같이 작성하기
		


	}

}

class CountingThread implements Runnable{

	@Override
	public void run() {
		 
		//2. 카운팅 작업 //방법2
		for(int i=10; i>0; i--) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {}
			System.out.println(i);
		}
	}
	
}
