package com.kh._abstract.step1;

public class BasketBall extends Sports{  //BasketBall 빨간불이 뜨면 클릭해서 오버라이드를 재정의 해야된다. 무조건!

	public BasketBall(int numberOfPlayers) {
		super(numberOfPlayers);
	}

	@Override
	public void rule() {
		
		System.out.println("BasketBall 선수의 수는 " + this.numberOfPlayers + "명, 공을 던져서 링에 넣어야 한다.");
	}

}
