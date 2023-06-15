package com.netflix.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale.Category;

import javax.xml.stream.events.Comment;

public class Video {
	
	public String title;
	private Date uploadAt;
	private int views; 
	private String imgUrl;
	private String fileUrl;
	private String desc;
	private char kind; // shorts & video 둘 중 하나!
	private ArrayList<Video> videoList; //영상목록
	private int Rating; //영상등급
	private int likes; //좋아요
	private int Duration; //비디오재생시간
	private String description; //영상 설명
	private List<Video> saveVideo;//영상 저장
	
	public Video() {
	}

	public Video(String title, Date uploadAt, int views, String imgUrl, String fileUrl, String desc, char kind,
			ArrayList<Video> videoList, int rating, int likes, int duration, String description,
			List<Video> saveVideo) {
		super();
		this.title = title;
		this.uploadAt = uploadAt;
		this.views = views;
		this.imgUrl = imgUrl;
		this.fileUrl = fileUrl;
		this.desc = desc;
		this.kind = kind;
		this.videoList = videoList;
		Rating = rating;
		this.likes = likes;
		Duration = duration;
		this.description = description;
		this.saveVideo = saveVideo;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Date getUploadAt() {
		return uploadAt;
	}

	public void setUploadAt(Date uploadAt) {
		this.uploadAt = uploadAt;
	}

	public int getViews() {
		return views;
	}

	public void setViews(int views) {
		this.views = views;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}

	public String getFileUrl() {
		return fileUrl;
	}

	public void setFileUrl(String fileUrl) {
		this.fileUrl = fileUrl;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public char getKind() {
		return kind;
	}

	public void setKind(char kind) {
		this.kind = kind;
	}

	public ArrayList<Video> getVideoList() {
		return videoList;
	}

	public void setVideoList(ArrayList<Video> videoList) {
		this.videoList = videoList;
	}

	public int getRating() {
		return Rating;
	}

	public void setRating(int rating) {
		Rating = rating;
	}

	public int getLikes() {
		return likes;
	}

	public void setLikes(int likes) {
		this.likes = likes;
	}

	public int getDuration() {
		return Duration;
	}

	public void setDuration(int duration) {
		Duration = duration;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<Video> getSaveVideo() {
		return saveVideo;
	}

	public void setSaveVideo(List<Video> saveVideo) {
		this.saveVideo = saveVideo;
	}

	@Override
	public String toString() {
		return "Video [title=" + title + ", uploadAt=" + uploadAt + ", views=" + views + ", imgUrl=" + imgUrl
				+ ", fileUrl=" + fileUrl + ", desc=" + desc + ", kind=" + kind + ", videoList=" + videoList
				+ ", Rating=" + Rating + ", likes=" + likes + ", Duration=" + Duration + ", description=" + description
				+ ", saveVideo=" + saveVideo + "]";
	}
	
	
	
		
		
		
		
		

}
