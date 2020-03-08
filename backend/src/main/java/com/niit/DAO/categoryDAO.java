package com.niit.DAO;

import java.util.List;

import proj.niit.model.category;


public interface categoryDAO {
	
	public boolean addCategory(category category);
	public boolean deleteCategory(category category);
	public boolean updatecategory(category category);
	public List<category> listcategories();
	public category getcategory(int categoryId);
	
}
