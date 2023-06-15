package com.netflix.controller;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.stream.Collectors;

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
	List<Video> saveVideo = new ArrayList<>();


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
	
	// 영상 저장하기
	public void saveVideo(Video video) {
	    saveVideo.add(video);
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
		System.out.println("Sharing video on " + platform + " : " + video.getTitle());
	}

	// 인기 영상 목록 조회하기
	public Video[] getPopularVideos() {
		List<Video> sortedVideos = videoList.stream()
	            .sorted(Comparator.comparingInt(Video::getLikes).reversed())
	            .limit(10)
	            .collect(Collectors.toList());

	    return sortedVideos.toArray(new Video[0]);
		}

	// 영상 재생 시간 계산하기
	public int calculateVideoDuration(Video video) {
		return video.getDuration();
	}

	
	
}




