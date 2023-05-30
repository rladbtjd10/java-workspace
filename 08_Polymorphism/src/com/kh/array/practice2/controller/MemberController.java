package com.kh.array.practice2.controller;

import com.kh.array.practice2.model.Member;

public class MemberController {

	private Member[] mArr = new Member[3];
	public int count = 0;
	
//	public void insertMember(String id, String name, String password, String email, char gender, int age) {} //1번의경우
	public void insertMember(Member m) {
		//Member 객체를 객체배열에 저장
		//객체 배열에 하나씩 추가한다고 생각! count를 인덱스라고 생각!
		//score[0] = 100; 
		//syuArr[0] = new Student("김길동", "자바", 100);
		
		//mArr[count++] = new Member(m.getId(), m.getName(), m.getPassword(), m.getEmail(), m.getGender(), m.getAge());
		mArr[count++] = m;
	}
	public boolean updateMember(String id, String name, String password, String email) {
		//Id로 조회된 회원의 정보 수정
		//checkId 활용! <-- index를 뽑아오는 거
		//추가처럼 수정도 같은 방식! 해당 인덱스 값에 넣는 방식!
		//setter 이용!
		int index = this.checkId(id);
		if(index!=-1) {
			mArr[index].setName(name);
			mArr[index].setPassword(password);
			mArr[index].setEmail(email);
			return true;
		}
		
		return false;
	}
	public int checkId(String id) {
		//Id 회원 조회
		for(int i=0; i<mArr.length; i++) {
			if(mArr[i]!=null && mArr[i].getId().equals(id)) {
				return i;
			}
		}
		return -1;
	}
	public Member[] printAll() {
		//Member객체반환
		return mArr;

	}

}
