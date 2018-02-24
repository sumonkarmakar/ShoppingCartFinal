package com.shopping.ShoppingCartFinal.DAO;

import java.util.List;

import com.shopping.ShoppingCartFinal.Model.Role;

public interface RoleDAO {
	public boolean insert(Role role);
	
	public Role getById(int id);
	
	public boolean update(Role role);
	
	public boolean delete(Role role);
	
	public List<Role> getAll();
}
