package com.shopping.ShoppingCartFinal.ServiceImpl;

import java.io.Serializable;
import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shopping.ShoppingCartFinal.Model.Bill;
import com.shopping.ShoppingCartFinal.Model.Cart;
import com.shopping.ShoppingCartFinal.Model.Category;
import com.shopping.ShoppingCartFinal.Service.BillableService;

@Service("billService")
@Transactional
public class BillableServiceImpl implements BillableService {
	@Autowired
	public SessionFactory sessionFactory;

	@Override
	public void add(Bill bill) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		session.save(bill);
	}

	@Override
	public Bill getById(int billId) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		return (Bill) session.get(Bill.class, billId);
	}

	@Override
	public void update(Bill billId) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		Bill bill = (Bill) session.get(Bill.class, (Serializable) billId);
		session.update(bill);
	}

	@Override
	public List<Bill> getAll() {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		Query query = session.createQuery("FROM Bill");
		return query.list();
	}

	@Override
	public void delete(Bill billId) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		Bill bill = (Bill) session.get(Bill.class, (Serializable) billId);
		session.delete(bill);
	}

}
