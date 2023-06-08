package com.youtube.imp;

import java.util.ArrayList;
import java.util.List;

import com.youtube.controller.UserController;
import com.youtube.model.Comment;

//팀과제는 이 방식!
public interface CommentImpl {

		//C : 댓글 작성 -->로그인 된 회원만 가능!
		public void addComment(String id, String password, Comment comment);
		public Comment viewComment(int index);
		public void updateComment(int index, Comment comment); 
		public void deleteComment(int index);
			
		
			
	

}
