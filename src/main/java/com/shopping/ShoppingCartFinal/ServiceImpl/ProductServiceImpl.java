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
import com.shopping.ShoppingCartFinal.Service.ProductService;

@Service("productService")
@Transactional
public class ProductServiceImpl implements ProductService {
	@Autowired
	public SessionFactory sessionFactory;
	@Override
	public void add(Product product) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		session.save(product);
	}

	@Override
	public Product getById(int prodId) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		return (Product)session.get(Product.class, prodId);
	}

	@Override
	public void update(Product prodId) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		Product prod = (Product)session.get(Product.class, (Serializable) prodId);
		session.update(prod);
	}

	@Override
	public void delete(Product prodId) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		Product prod = (Product)session.get(Product.class, (Serializable) prodId);
		session.delete(prod);
	}
	
	@Override
	public List<Product> getAll() {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		Query query  = session.createQuery("FROM Product");
		return query.list();
	}

}
