package com.shopping.ShoppingCartFinal.DAOImpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.shopping.ShoppingCartFinal.DAO.ProductDAO;
import com.shopping.ShoppingCartFinal.Model.Product;

@Repository("productDAO")
@Transactional
public class ProductDAOImpl implements ProductDAO {
	@Autowired
	public SessionFactory sessionFactory;

	public boolean insert(Product product) {
		// TODO Auto-generated method stub
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(product);
			return true;
		} catch (Exception e) {
			System.out.println();
			return false;
		}
	}

	public Product getById(int id) {
		// TODO Auto-generated method stub
		return (Product) sessionFactory.getCurrentSession().get(Product.class, id);
	}

	public boolean update(Product product) {
		// TODO Auto-generated method stub
		try {
			sessionFactory.getCurrentSession().update(product);
			return true;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return false;
		}
	}

	public boolean delete(Product product) {
		// TODO Auto-generated method stub
		try {
			sessionFactory.getCurrentSession().delete(product);
			return true;
		} catch (Exception e) {
			System.out.println();
			return false;
		}
	}

	public List<Product> getAll() {
		// TODO Auto-generated method stub
		return sessionFactory.getCurrentSession().createQuery("from Product").list();
	}

}
