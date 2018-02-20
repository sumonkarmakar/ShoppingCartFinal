package com.shopping.ShoppingCartFinal.Service;

import java.util.List;
import com.shopping.ShoppingCartFinal.Model.User1;

public interface UserService {
	public void add(User1 user);
	
	public User1 getById(int id);
	
	public void update(User1 user);
	
	public List<User1> getAll();
	
	public void delete(User1 user);
}
