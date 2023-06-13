package com.baemin.imp;

import com.baemin.model.User;

public interface UserControllerImpl {
	
	public boolean login();//로그인
	public boolean signUp(); //회원가입
	public User viewPrifile();//프로필 보기
	public User updateviewPrifile(); //프로필 수정
	public boolean deleteviewPrifile(); //계정 삭제

}
