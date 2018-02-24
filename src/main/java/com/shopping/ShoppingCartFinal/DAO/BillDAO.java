package com.shopping.ShoppingCartFinal.DAO;

import java.util.List;

import com.shopping.ShoppingCartFinal.Model.Bill;

public interface BillDAO {
	public boolean insert(Bill bill);

	public Bill getById(int id);

	public boolean update(Bill bill);

	public boolean delete(Bill bill);

	public List<Bill> getAll();
}
