package com.shopping.ShoppingCartFinal.DAO;

import java.util.List;

import com.shopping.ShoppingCartFinal.Model.Cart;

public interface CartDAO {
	public boolean insert(Cart cart);
	
	public Cart getById(int id);
	
	public boolean update(Cart cart);
	
	public boolean delete(Cart cart);
	
	public List<Cart> getAll();
}
