package com.netflix.imp;

import java.util.List;

import com.netflix.model.Category;

public interface CategoryController {
	
	void addCategory(Category category);
    void removeCategory(Category category);
    List<Category> getAllCategories();

}
