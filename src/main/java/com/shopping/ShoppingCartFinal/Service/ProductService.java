package com.shopping.ShoppingCartFinal.Service;

import java.util.List;

import com.shopping.ShoppingCartFinal.Model.Product;

public interface ProductService {
	public void add(Product product);
	
	public Product getById(int id);
	
	public void update(Product product);
	
	public List<Product> getAll();
	
	public void delete(Product product);
}
