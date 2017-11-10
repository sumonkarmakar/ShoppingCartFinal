package com.shopping.ShoppingCartFinal.DAO;

import java.util.List;

import com.shopping.ShoppingCartFinal.Model.Supplier;

public interface SupplierDAO {
	public boolean insert(Supplier supplier);
	
	public Supplier getById(int id);
	
	public boolean update(Supplier supplier);
	
	public boolean delete(Supplier supplier);
	
	public List<Supplier> getAll();
}
