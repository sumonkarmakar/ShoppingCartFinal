package com.shopping.ShoppingCartFinal.DAOImpl;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.shopping.ShoppingCartFinal.DAO.SupplierDAO;
import com.shopping.ShoppingCartFinal.Model.Product;
import com.shopping.ShoppingCartFinal.Model.Supplier;

@Repository("supplierDAO")
@Transactional
public class SupplierDAOImpl implements SupplierDAO {
	@Autowired
	public SessionFactory sessionFactory;
	@Override
	public boolean insert(Supplier supplier) {
		// TODO Auto-generated method stub
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(supplier);
			return true;
		} catch (Exception e) {
			System.out.println();
			return false;
		}
	}

	@Override
	public Supplier getById(int id) {
		// TODO Auto-generated method stub
		return (Supplier) sessionFactory.getCurrentSession().get(Supplier.class, id);
	}

	@Override
	public boolean update(Supplier supplier) {
		// TODO Auto-generated method stub
		try {
			sessionFactory.getCurrentSession().update(supplier);
			return true;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return false;
		}
	}

	@Override
	public boolean delete(Supplier supplier) {
		// TODO Auto-generated method stub
		try {
			sessionFactory.getCurrentSession().delete(supplier);
			return true;
		} catch (Exception e) {
			System.out.println();
			return false;
		}
	}

	@Override
	public List<Supplier> getAll() {
		// TODO Auto-generated method stub
		return sessionFactory.getCurrentSession().createQuery("from Supplier").list();
	}

}
