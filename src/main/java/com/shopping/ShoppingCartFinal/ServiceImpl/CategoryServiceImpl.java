package com.shopping.ShoppingCartFinal.ServiceImpl;

import java.io.Serializable;
import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shopping.ShoppingCartFinal.Model.Category;
import com.shopping.ShoppingCartFinal.Service.CategoryService;

@Service("categoryService")
@Transactional
public class CategoryServiceImpl implements CategoryService{
	@Autowired
	public SessionFactory sessionFactory;
	@Override
	public void add(Category category) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		session.save(category);
	}

	@Override
	public Category getById(int catId) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		return (Category)session.get(Category.class, catId);
	}

	@Override
	public void update(Category catId) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		Category cat = (Category)session.get(Category.class, (Serializable) catId);
		session.update(cat);
	}

	
	@Override
	public void delete(Category catId) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		Category cat = (Category)session.get(Category.class, (Serializable) catId);
		session.delete(cat);
	}

	@Override
	public List<Category> getAll() {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		Query query  = session.createQuery("FROM Category");
		return query.list();
	}

}
