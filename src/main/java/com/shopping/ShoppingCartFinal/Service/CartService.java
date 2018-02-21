package com.shopping.ShoppingCartFinal.Service;

import java.util.List;

import com.shopping.ShoppingCartFinal.Model.Cart;

public interface CartService {
	public void add(Cart Cart);

	public Cart getById(int id);

	public void update(Cart Cart);

//	public Cart delete(int id);

	public List<Cart> getAll();

	public void delete(Cart Cart);
}
