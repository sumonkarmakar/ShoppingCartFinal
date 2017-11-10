package com.shopping.ShoppingCartFinal.DAOImpl;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.shopping.ShoppingCartFinal.DAO.UserDAO;
import com.shopping.ShoppingCartFinal.Model.Supplier;
import com.shopping.ShoppingCartFinal.Model.User1;

@Repository("userDAO")
@Transactional
public class UserDAOImpl implements UserDAO {
	@Autowired
	public SessionFactory sessionFactory;

	@Override
	public boolean insert(User1 user) {
		// TODO Auto-generated method stub
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(user);
			return true;
		} catch (Exception e) {
			System.out.println();
			return false;
		}
	}

	@Override
	public User1 getById(int id) {
		// TODO Auto-generated method stub
		return (User1) sessionFactory.getCurrentSession().get(User1.class, id);
	}

	@Override
	public boolean update(User1 user) {
		// TODO Auto-generated method stub
		try {
			sessionFactory.getCurrentSession().update(user);
			return true;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return false;
		}
	}

	@Override
	public boolean delete(User1 user) {
		// TODO Auto-generated method stub
		try {
			sessionFactory.getCurrentSession().delete(user);
			return true;
		} catch (Exception e) {
			System.out.println();
			return false;
		}
	}

	@Override
	public List<User1> getAll() {
		// TODO Auto-generated method stub
		return sessionFactory.getCurrentSession().createQuery("from User1").list();
	}

}
