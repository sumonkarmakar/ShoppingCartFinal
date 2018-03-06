package com.shopping.ShoppingCartFinal.Controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.shopping.ShoppingCartFinal.Service.*;
import com.shopping.ShoppingCartFinal.Model.*;
import com.shopping.ShoppingCartFinal.DAO.*;

@Controller
@RequestMapping("/record")
public class MainController {
	@Resource(name="userService")
	private UserService userService;
	@Resource(name="roleService")
	private RoleService roleService;
	
	@RequestMapping(value="/login")
	public String GetFront(Model model) {
		return "login";
	}
	
	
	@RequestMapping(value="/authenticate",method=RequestMethod.POST)
	public String authenticate(@RequestParam("uname")String userName,@RequestParam("pass")String password,HttpSession session,
			HttpServletRequest request,Model m) {
				
		boolean success = userService.validate(userName,password);
		User1 user = userService.getUserByName(userName);
		Set<Role> roles = user.getRole();
		String role =null;
		
		for(Role role1:roles) {
			if(role1.getRoleName().equalsIgnoreCase("admin")) {
				role = "admin";
			}
		}
		
		if(success) {
			session = request.getSession();
			session.setAttribute("users", userName);
			session.setAttribute("role", roles);
			return "Hello";
		}else {
			return "error";
		}
	}
	
	@RequestMapping(value="/Logout",method=RequestMethod.GET)
	public String Logout(HttpSession session,HttpServletRequest request,Model model) {
		HttpSession session2 = request.getSession();
		session2.removeAttribute("users");
		session2.removeAttribute("role");
		session2.invalidate();
		return "logout";
	}
	
	@RequestMapping(value="/list",method=RequestMethod.GET)
	public String getRecords(Model model) {
		List<User1> users = userService.getAll();
		List<UserDAO> userDAO = new ArrayList<UserDAO>();
		
		for(User1 user2:users) {
			User1 user = new User1();
			user.setUserId(user.getUserId());
			user.setUserName(user.getUserName());
			user.setPassword(user.getPassword());
			user.setRole(roleService.getAll());
		}
		model.addAttribute("users",userDAO);
		return "records";
	}
	
	@RequestMapping(value="/add",method=RequestMethod.POST)
	public String getAdd(Model model) {
		model.addAttribute("userAttribute",new User1());
		return "addUser";
	}
	
	@RequestMapping(value="/delete",method=RequestMethod.GET)
	public String getDelete(@RequestParam("id") User1 userId) {
		userService.delete(userId);
		return "redirect:/record/list";
	}
	
	@RequestMapping(value="/edit",method=RequestMethod.GET)
	public String getEdit(@RequestParam("id") Integer userId,Model model) {
		User1 user1 = userService.getById(userId);
		model.addAttribute("userAttribute", user1);
		return "editUser";
	}
	
	@RequestMapping(value="/edit",method=RequestMethod.POST)
	public String postEdit(@RequestParam("id") Integer userId,@ModelAttribute("userAttribute") User1 user) {
		return null;
	}
}
