package com.baemin.controller;

import com.baemin.model.Video;

public class VideoController {
	
	/*
	 * CRUD
	 * Create : 추가
	 * Read : 읽기 (1개, 목록)
	 * Update : 수정
	 * Delete : 삭제
	 */
	
	Video[] videoList = new Video[5];
	int index = 0;

	
	public Video upload(Video video) { //영상 업로드
		return videoList[index++] = video;
	}

	
	public Video[] VideoList() { //동영상 목록
		return videoList;
	}

	
	public Video viewVideo(int index) { // 동영상 1개 보기
		return videoList[index];
	}

	
	public Video updateVideo(int index, Video video) { //동영상 업데이트
		return videoList[index] = video;
	}

	
	public boolean deleteVideo() { //동영상 삭제
		return false;
	}

}
