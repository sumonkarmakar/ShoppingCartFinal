package com.shopping.ShoppingCartFinal.DAOImpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.shopping.ShoppingCartFinal.DAO.BillDAO;
import com.shopping.ShoppingCartFinal.Model.Bill;

@Repository("billDAO")
public class BillDAOImpl implements BillDAO {
	@Autowired
	public SessionFactory sessionFactory;
	@Override
	public boolean insert(Bill bill) {
		// TODO Auto-generated method stub
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(bill);
			return true;
		} catch (Exception e) {
			System.out.println();
			return false;
		}
	}

	@Override
	public Bill getById(int id) {
		// TODO Auto-generated method stub
		return (Bill) sessionFactory.getCurrentSession().get(Bill.class, id);
	}

	@Override
	public boolean update(Bill bill) {
		// TODO Auto-generated method stub
		try{
			sessionFactory.getCurrentSession().saveOrUpdate(bill);
			return true;
		}
		catch(Exception e){
			System.out.println(e.getMessage());
			return false;
		}
	}

	@Override
	public boolean delete(Bill bill) {
		// TODO Auto-generated method stub
		try {
			sessionFactory.getCurrentSession().delete(bill);
			return true;
		} catch (Exception e) {
			System.out.println();
			return false;
		}
	}

	@Override
	public List<Bill> getAll() {
		// TODO Auto-generated method stub
		return sessionFactory.getCurrentSession().createQuery("from Bill").list();
	}

}
