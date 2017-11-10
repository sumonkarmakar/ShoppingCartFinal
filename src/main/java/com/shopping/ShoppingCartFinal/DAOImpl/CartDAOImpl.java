package com.shopping.ShoppingCartFinal.DAOImpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.shopping.ShoppingCartFinal.DAO.CartDAO;
import com.shopping.ShoppingCartFinal.Model.Cart;
import com.shopping.ShoppingCartFinal.Model.Category;

@Repository("cartDAO")
public class CartDAOImpl implements CartDAO {
	@Autowired
	public SessionFactory sessionFactory;

	@Override
	public boolean insert(Cart cart) {
		// TODO Auto-generated method stub
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(cart);
			return true;
		} catch (Exception e) {
			System.out.println();
			return false;
		}
	}

	@Override
	public Cart getById(int id) {
		// TODO Auto-generated method stub
		return (Cart) sessionFactory.getCurrentSession().get(Cart.class, id);
	}

	@Override
	public boolean update(Cart cart) {
		// TODO Auto-generated method stub
		try{
			sessionFactory.getCurrentSession().saveOrUpdate(cart);
			return true;
		}
		catch(Exception e){
			System.out.println(e.getMessage());
			return false;
		}
	}

	@Override
	public boolean delete(Cart cart) {
		// TODO Auto-generated method stub
		try {
			sessionFactory.getCurrentSession().delete(cart);
			return true;
		} catch (Exception e) {
			System.out.println();
			return false;
		}
	}

	@Override
	public List<Cart> getAll() {
		// TODO Auto-generated method stub
		return sessionFactory.getCurrentSession().createQuery("from Cart").list();
	}

}
