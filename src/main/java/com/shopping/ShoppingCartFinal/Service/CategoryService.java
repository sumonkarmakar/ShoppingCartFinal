package com.shopping.ShoppingCartFinal.Service;

import java.util.List;

import com.shopping.ShoppingCartFinal.Model.Category;

public interface CategoryService {
	public void add(Category category);
	
	public Category getById(int id);
	
	public void update(Category category);
	
	//public Category delete(int id);
	
	public List<Category> getAll();

	public void delete(Category category);

}
