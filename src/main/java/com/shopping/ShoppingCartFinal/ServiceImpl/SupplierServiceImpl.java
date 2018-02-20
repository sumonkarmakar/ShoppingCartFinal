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
import com.shopping.ShoppingCartFinal.Model.Supplier;
import com.shopping.ShoppingCartFinal.Service.SupplierService;

@Service("supplierService")
@Transactional
public class SupplierServiceImpl implements SupplierService {
	@Autowired
	public SessionFactory sessionFactory;
	@Override
	public void add(Supplier supplier) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		session.save(supplier);
	}

	@Override
	public Supplier getById(int supId) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		return (Supplier)session.get(Product.class, supId);
	}

	@Override
	public void update(Supplier supId) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		Product prod = (Product)session.get(Product.class, (Serializable) supId);
		session.update(prod);
	}

	@Override
	public List<Supplier> getAll() {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		Query query  = session.createQuery("FROM Supplier");
		return query.list();
	}

	@Override
	public void delete(Supplier supId) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		Supplier sup = (Supplier)session.get(Supplier.class, (Serializable) supId);
		session.delete(sup);
	}

}
