package com.netflix.controller;

import java.util.ArrayList;
import java.util.List;

import com.netflix.model.Category;

public class CategoryController {
	
	    private List<Category> Categories;

	    public CategoryController() {
	        Categories = new ArrayList<>();
	    }

	    public void addCategory(Category category) {
	        Categories.add(category);
	    }

	    public void removeCategory(Category category) {
	        Categories.remove(category);
	    }

	    public List<Category> getAllCategories() {
	        return Categories;
	    }
	}


