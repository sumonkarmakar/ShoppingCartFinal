package com.shopping.ShoppingCartFinal.Controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.shopping.ShoppingCartFinal.DAO.ProductDAO;
import com.shopping.ShoppingCartFinal.Model.*;
import com.shopping.ShoppingCartFinal.Service.*;

@Controller
@RequestMapping("/product")
public class ProductController {

	@Resource(name="categoryService")
	private CategoryService categoryService;
	@Resource(name="productService")
	private ProductService productService;
	@Resource(name="userService")
	private UserService userService;
	@Resource(name="billableService")
	private BillableService billableService;
	
	@RequestMapping(value="/list",method=RequestMethod.GET)
	public String getRecords(Model model,HttpSession session,HttpServletRequest req) {
		session = req.getSession(false);
		String userName = (String)session.getAttribute("users");
		List<Product> products = productService.getAll();
		List<ProductDAO> productDAO = new ArrayList<ProductDAO>();
		
		return null;
		
	}
	
	
}
