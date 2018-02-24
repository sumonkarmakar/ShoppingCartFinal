package com.shopping.ShoppingCartFinal.DAO;

import java.util.List;

import com.shopping.ShoppingCartFinal.Model.Category;

public interface CategoryDAO {
	public boolean insert(Category category);
	
	public Category getById(int id);
	
	public boolean update(Category category);
	
	public boolean delete(Category category);
	
	public List<Category> getAll();
}
