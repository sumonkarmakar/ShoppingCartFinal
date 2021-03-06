package com.shopping.ShoppingCartFinal.ServiceImpl;

import java.io.Serializable;
import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shopping.ShoppingCartFinal.Model.Cart;
import com.shopping.ShoppingCartFinal.Model.Category;
import com.shopping.ShoppingCartFinal.Service.CartService;


@Service("cartService")
@Transactional
public class CartServiceImpl implements CartService {
	@Autowired
	public SessionFactory sessionFactory;
	@Override
	public void add(Cart cart) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		session.save(cart);
	}

	@Override
	public Cart getById(int cartId) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		return (Cart)session.get(Cart.class, cartId);
	}

	@Override
	public void update(Cart cartId) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		Cart cart = (Cart)session.get(Cart.class, (Serializable) cartId);
		session.update(cart);
	}

	@Override
	public List<Cart> getAll() {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		Query query  = session.createQuery("FROM Cart");
		return query.list();
	}

	@Override
	public void delete(Cart cartId) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		Cart cart = (Cart)session.get(Category.class, (Serializable) cartId);
		session.delete(cart);
	}

	/*@Override
	public Cart delete(int id) {
		// TODO Auto-generated method stub
		return null;
	}
*/
}
