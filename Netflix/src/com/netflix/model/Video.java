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
	
	private ArrayList<Video> Description;
	private int Rating;
	private boolean isLikedByUser;
	private int Duration;
	public Video() {
	}
	public Video(String title, Date uploadAt, int views, String imgUrl, String fileUrl, String desc, char kind,
			ArrayList<Video> description, int rating, boolean isLikedByUser, int duration) {
		this.title = title;
		this.uploadAt = uploadAt;
		this.views = views;
		this.imgUrl = imgUrl;
		this.fileUrl = fileUrl;
		this.desc = desc;
		this.kind = kind;
		Description = description;
		Rating = rating;
		this.isLikedByUser = isLikedByUser;
		Duration = duration;
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
	public ArrayList<Video> getDescription() {
		return Description;
	}
	public void setDescription(ArrayList<Video> description) {
		Description = description;
	}
	public int getRating() {
		return Rating;
	}
	public void setRating(int rating) {
		Rating = rating;
	}
	public boolean isLikedByUser() {
		return isLikedByUser;
	}
	public void setLikedByUser(boolean isLikedByUser) {
		this.isLikedByUser = isLikedByUser;
	}
	public int getDuration() {
		return Duration;
	}
	public void setDuration(int duration) {
		Duration = duration;
	}
	@Override
	public String toString() {
		return "Video [title=" + title + ", uploadAt=" + uploadAt + ", views=" + views + ", imgUrl=" + imgUrl
				+ ", fileUrl=" + fileUrl + ", desc=" + desc + ", kind=" + kind + ", Description=" + Description
				+ ", Rating=" + Rating + ", isLikedByUser=" + isLikedByUser + ", Duration=" + Duration + "]";
	}
		
		
		
		
		

}
