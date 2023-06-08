package com.baemin.controller;

import java.util.ArrayList;

import com.baemin.model.Video;

public class VideoController {
	
	/*
	 * CRUD
	 * Create : 추가
	 * Read : 읽기 (1개, 목록)
	 * Update : 수정
	 * Delete : 삭제
	 */
	
	ArrayList<Video> videoList = new ArrayList<>();

	
	public void upload(Video video) { //영상 업로드
		videoList.add(video);
	}

	
	public ArrayList<Video> VideoList() { //동영상 목록
		return videoList;
	}

	
	public Video viewVideo(int index) { // 동영상 1개 보기
		return videoList.get(index);
	}

	
	public Video updateVideo(int index, Video video) { //동영상 업데이트
		return videoList.set(index, video);
	}

	
	public boolean deleteVideo(Video video) { //동영상 삭제
		return videoList.remove(video);
	}
	
}
