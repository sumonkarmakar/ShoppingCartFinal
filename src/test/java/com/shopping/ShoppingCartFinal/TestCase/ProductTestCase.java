package com.shopping.ShoppingCartFinal.TestCase;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.shopping.ShoppingCartFinal.DAO.CategoryDAO;
import com.shopping.ShoppingCartFinal.DAO.ProductDAO;

public class ProductTestCase {
	@Autowired
	static ProductDAO productDao;
	@Autowired
	static CategoryDAO categoryDao;
	

}
