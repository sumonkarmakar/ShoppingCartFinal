package com.shopping.ShoppingCartFinal.DAO;

import java.util.List;

import com.shopping.ShoppingCartFinal.Model.User1;

public interface UserDAO {
	public boolean insert(User1 user);
	
	public User1 getById(int id);
	
	public boolean update(User1 user);
	
	public boolean delete(User1 user);
	
	public List<User1> getAll();
}
