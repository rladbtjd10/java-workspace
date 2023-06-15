package com.netflix.controller;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

import com.netflix.model.User;
import com.netflix.model.Video;

public class VideoController {
	
	/*
	 * CRUD
	 * Create : 추가
	 * Read : 읽기 (1개, 목록)
	 * Update : 수정
	 * Delete : 삭제
	 */
	
	ArrayList<Video> videoList = new ArrayList<>();
	UserController userController = new UserController();


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
		if (videoList.contains(video)) {
		      videoList.remove(video);
		      return true;
	} 
		return false;
	}
	
	public void saveVideo(Video video) {
		return;
	}

	// 영상 검색하기
	public Video[] searchVideo(String keyword) {
		List<Video> searchResults = new ArrayList<>();
		for (Video video : videoList) {
			if (video.title.contains(keyword) || video.getDescription().contains(keyword)) {
				searchResults.add(video);
			}
		}
		return searchResults.toArray(new Video[0]);
	}

	// 영상 평가하기
	public void rateVideo(Video video, int rating) {
		video.setRating(rating);
	}

	// 영상 공유하기
	public void shareVideo(Video video, String platform) {
		// 공유 로직 구현
		System.out.println("Sharing video on " + platform + " : " + video.getTitle());
	}

	// 인기 영상 목록 조회하기
	public Video[] getPopularVideos() {
		// 인기 영상 로직 구현
		// 예시로서 랜덤하게 영상을 선택
		Random random = new Random();
		int numVideos = Math.min(videoList.size(), 5); // 최대 5개의 영상 반환
		Set<Integer> selectedIndices = new HashSet<>();
		List<Video> popularVideos = new ArrayList<>();
		while (selectedIndices.size() < numVideos) {
			int index = random.nextInt(videoList.size());
			if (!selectedIndices.contains(index)) {
				selectedIndices.add(index);
				popularVideos.add(videoList.get(index));
			}
		}
		return popularVideos.toArray(new Video[0]);
	}

	// 영상 재생 시간 계산하기
	public int calculateVideoDuration(Video video) {
		return video.getDuration();
	}

	// 사용자별 좋아요한 영상 목록 조회하기
	public Video[] getLikedVideos(User user) {
		List<Video> likedVideos = new ArrayList<>();
		for (Video video : videoList) {
			if (video.isLikedByUser(user)) {
				likedVideos.add(video);
			}
		}
		return likedVideos.toArray(new Video[0]);
	}
	
}




