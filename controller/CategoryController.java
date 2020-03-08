package com.niit.controller;

import org.springframework.beans.factory.annotation.Autowired;

public class CategoryController {
	@Autowired
	categoryDAO categoryDAO;
	
	@RequestMapping("/category")
	public String showCategoryPage(Model m) {
		List<category> listCategory = categoryDAO.listCategory();
		m.addAttribute("categoryList",listCategory);
		
		return "Category";
		
	}
	@RequestMapping(value="/addCategory",method=RequestMethod.POST)
	public String addCategory(@RequestParam("categoryName")String categoryName @RequestParam("categoryDesc")String categoryDesc,Model m) {
		
	}
}
