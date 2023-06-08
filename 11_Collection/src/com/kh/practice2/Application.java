package com.kh.practice2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import com.kh.set.model.Person;

public class Application {

	public static void main(String[] args) {
		
		Application a = new Application();
//		a.method1();
		a.method2();
		
		
		//HashSet 또는 TreeSet(정렬) 사용!
		//로또 번호 : 1번만! 6개가 번호가 무작위
		//내 번호 : 랜덤으로 6개 번호가 랜덤으로~ 계속~
		//로또번호를 일치할 때까지! --> equals()
		
		}
	
	//TreeSet
	public void method1() {
		TreeSet<Integer> lotto = new TreeSet<>();
		
		int count = 0;
		
		// size()
		for(int i=0; lotto.size() < 6; i++) {
			int num = (int)(Math.random()*45)+1;
			lotto.add(num);
			
			
		} 
		//내 번호는 반복문 안에 반복문
		while(true) {
			TreeSet<Integer> mylotto = new TreeSet<>();
//			for(int j=0; mylotto.size() < 6; j++) {
//				int num1 = (int)(Math.random()*45)+1;
//				mylotto.add(num1);
//				}                                         //방법1
			
			while(mylotto.size() < 6) {
				int choose = (int)(Math.random()*45)+1;
				mylotto.add(choose);
			}                                             //방법2
			
			//내 번호가 랜덤 6개 숫자 추출
			//내 번호랑 로또 번호가 일치한지 횟수! : equals()
			
			System.out.println("로또 번호 : " + lotto);
			System.out.println("내 번호 : " + mylotto);
			
			count++;
			if(mylotto.equals(lotto)) {System.out.println("횟수 : " + count);break;}
			
		}

		
	}
	
	//HashSet
	public void method2() {
		
		HashSet<Integer> lotto = new HashSet<>();

        // size()
		for(int i=0; lotto.size() < 6; i++) {
			int num = (int)(Math.random()*45)+1;
			lotto.add(num);
		} 
		
		List lottoList = new ArrayList(lotto);
		Collections.sort(lottoList);
		
		int count = 0;
		
		//내 번호는 반복문 안에 반복문
		while(true) {
			HashSet<Integer> mylotto = new HashSet<>();
			//			for(int j=0; mylotto.size() < 6; j++) {
			//				int num1 = (int)(Math.random()*45)+1;
			//				mylotto.add(num1);
			//				}                                         //방법1

			while(mylotto.size() < 6) {
				int choose = (int)(Math.random()*45)+1;
				mylotto.add(choose);
			}                                             //방법2
			
			List mylottoList = new ArrayList(mylotto);
			Collections.sort(mylottoList);

			//내 번호가 랜덤 6개 숫자 추출
			//내 번호랑 로또 번호가 일치한지 횟수! : equals()

			System.out.println("로또 번호 : " + lottoList);
			System.out.println("내 번호 : " + mylottoList);

			count++;
			if(lottoList.equals(mylottoList)) {System.out.println("횟수 : " + count);break;}

		}
			
		}


	}
	

	


