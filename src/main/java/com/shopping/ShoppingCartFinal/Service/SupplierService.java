package com.shopping.ShoppingCartFinal.Service;

import java.util.List;

import com.shopping.ShoppingCartFinal.Model.Supplier;

public interface SupplierService {
	public void add(Supplier Supplier);

	public Supplier getById(int id);

	public void update(Supplier Supplier);

	// public Supplier delete(int id);

	public List<Supplier> getAll();

	public void delete(Supplier Supplier);
}
