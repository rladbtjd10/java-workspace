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
	
	private List<Comment> comments;
	private Category category;
	public ArrayList<Video> getDescription() {
		return null;
	}
	public void setRating(int rating) {
		
	}
	public boolean isLikedByUser(User user) {
		// TODO Auto-generated method stub
		return false;
	}
	public int getDuration() {
		// TODO Auto-generated method stub
		return 0;
	}
	public String getTitle() {
		// TODO Auto-generated method stub
		return null;
	}
	public boolean isLikedByUser(User user) {
		// TODO Auto-generated method stub
		return false;
	}
		
		
		
		
		
		

}
