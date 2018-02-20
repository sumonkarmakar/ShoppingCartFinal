package com.shopping.ShoppingCartFinal.ServiceImpl;

import java.io.Serializable;
import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shopping.ShoppingCartFinal.Model.Product;
import com.shopping.ShoppingCartFinal.Model.User1;
import com.shopping.ShoppingCartFinal.Service.UserService;

@Service("userService")
@Transactional
public class UserServiceImpl implements UserService {
	@Autowired
	public SessionFactory sessionFactory;
	@Override
	public void add(User1 user) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		session.save(user);
	}

	@Override
	public User1 getById(int userId) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		return (User1)session.get(User1.class, userId);
	}

	@Override
	public void update(User1 userId) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		User1 user = (User1)session.get(User1.class, (Serializable) userId);
		session.update(user);
	}

	@Override
	public List<User1> getAll() {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		Query query  = session.createQuery("FROM User1");
		return query.list();
	}

	@Override
	public void delete(User1 userId) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		User1 user = (User1)session.get(User1.class, (Serializable) userId);
		session.delete(user);
	}

}
