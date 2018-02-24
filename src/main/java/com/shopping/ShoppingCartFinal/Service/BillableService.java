package com.shopping.ShoppingCartFinal.Service;

import java.util.List;

import com.shopping.ShoppingCartFinal.Model.Bill;

public interface BillableService {
	public void add(Bill bill);

	public Bill getById(int id);

	public void update(Bill bill);

//	public Cart delete(int id);

	public List<Bill> getAll();

	public void delete(Bill bill);
}
