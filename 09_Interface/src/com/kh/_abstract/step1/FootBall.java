package com.kh._abstract.step1;

public class FootBall extends Sports{ //FootBall 빨간불이 뜨면 클릭해서 오버라이드를 재정의 해야된다. 무조건!

	public FootBall(int numberOfPlayers) {
		super(numberOfPlayers);
	}

	@Override
	public void rule() {
		System.out.println("FootBall의 선수의 수는 " +this.numberOfPlayers + "명, 손이 아닌 발로 공을 차야한다.");
	}

}
