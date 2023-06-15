package com.netflix.imp;

import com.netflix.model.User;
import com.netflix.model.Video;

public interface VideoControllerImpl {
	
	/*
	 * CRUD
	 * Create : 추가
	 * Read : 읽기 (1개, 목록)
	 * Update : 수정
	 * Delete : 삭제
	 */
	
	public Video upload(); // 영상 업로드
	public Video[] VideoList();// 영상 목록
	public Video viewVideo();// 영상 1개 보기
	public Video updateVideo();// 동영상 수정
	public boolean deleteVideo();// 동영상 삭제
	public void saveVideo(Video video); //동영상 저장
	public Video[] searchVideo(String keyword);// 영상 검색하기
	public void rateVideo(Video video, int rating);// 영상 평가하기
	public void shareVideo(Video video, String platform);// 영상 공유하기
	public Video[] getPopularVideos();//인기 영상 목록 조회하기
	public int calculateVideoDuration(Video video);// 영상 재생 시간 계산하기
	public Video[] getLikedVideos(User user); //사용자별 좋아요한 영상 목록 조회하기
	
	
	
	
	
	
}


