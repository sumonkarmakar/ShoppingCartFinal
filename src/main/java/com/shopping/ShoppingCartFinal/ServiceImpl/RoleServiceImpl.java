package com.shopping.ShoppingCartFinal.ServiceImpl;

import java.io.Serializable;
import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shopping.ShoppingCartFinal.Model.Product;
import com.shopping.ShoppingCartFinal.Model.Role;
import com.shopping.ShoppingCartFinal.Service.RoleService;

@Service("roleService")
@Transactional
public class RoleServiceImpl implements RoleService {
	@Autowired
	public SessionFactory sessionFactory;
	@Override
	public void add(Role role) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		session.save(role);
	}

	/*@Override
	public Role getById(int id) {
		// TODO Auto-generated method stub
		return null;
	}*/

	@Override
	public void update(Role roleId) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		Role role = (Role)session.get(Role.class, (Serializable) roleId);
	}

	@Override
	public void delete(Role roleId) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		Role role = (Role)session.get(Role.class, (Serializable) roleId);
		session.delete(role);
	}

	/*@Override
	public List<Role> getAll() {
		// TODO Auto-generated method stub
		return null;
	}*/

}
