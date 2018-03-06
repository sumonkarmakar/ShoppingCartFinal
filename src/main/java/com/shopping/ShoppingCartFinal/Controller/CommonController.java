package com.shopping.ShoppingCartFinal.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CommonController {

	@RequestMapping("/")
	public String home() {
		return "index";
	}
	
	@RequestMapping("/login")
	public String loginpage() {
		return "login";
	}
	
	@RequestMapping("/UserDetail")
	public String user() {
		return "UserDetails";
	}
	
	@RequestMapping("/cart")
	public String cart() {
		return "cart";
	}
	
	@RequestMapping("/product")
	public String product() {
		return "product";
	}
	
}
