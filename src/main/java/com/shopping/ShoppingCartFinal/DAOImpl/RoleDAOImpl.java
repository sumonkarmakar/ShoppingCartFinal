package com.shopping.ShoppingCartFinal.DAOImpl;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.shopping.ShoppingCartFinal.DAO.RoleDAO;
import com.shopping.ShoppingCartFinal.Model.Product;
import com.shopping.ShoppingCartFinal.Model.Role;

@Repository("roleDAO")
@Transactional
public class RoleDAOImpl implements RoleDAO {
	@Autowired
	public SessionFactory sessionFactory;
	@Override
	public boolean insert(Role role) {
		// TODO Auto-generated method stub
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(role);
			return true;
		}catch(Exception e) {
			System.out.println();
			return false;
		}
	}

	@Override
	public Role getById(int id) {
		// TODO Auto-generated method stub
		return (Role) sessionFactory.getCurrentSession().get(Role.class, id);
	}

	@Override
	public List<Role> getAll() {
		// TODO Auto-generated method stub
		return sessionFactory.getCurrentSession().createQuery("from Role").list();
	}

	@Override
	public boolean update(Role role) {
		// TODO Auto-generated method stub
		try {
			sessionFactory.getCurrentSession().update(role);
			return true;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return false;
		}
	}

	@Override
	public boolean delete(Role role) {
		// TODO Auto-generated method stub
		try {
			sessionFactory.getCurrentSession().delete(role);
			return true;
		} catch (Exception e) {
			System.out.println();
			return false;
		}
	}

}
