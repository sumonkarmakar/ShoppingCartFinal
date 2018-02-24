package com.shopping.ShoppingCartFinal.DAO;

import java.util.List;

import com.shopping.ShoppingCartFinal.Model.Product;

public interface ProductDAO {
	public boolean insert(Product product);
	
	public Product getById(int id);
	
	public boolean update(Product product);
	
	public boolean delete(Product product);
	
	public List<Product> getAll();
}
