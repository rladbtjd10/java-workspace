package com.netflix.model;

import java.util.Date;
import java.util.List;
import java.util.Locale.Category;

import javax.xml.stream.events.Comment;

public class Video {
	
	private String title;
	private Date uploadAt;
	private int views; 
	private String imgUrl;
	private String fileUrl;
	private String desc;
	private char kind; // shorts & video 둘 중 하나!
	
	private List<Comment> comments;
	private Category category;
		
		
		
		
		
		

}