package com.codegnan.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.codegnan.model.User;

@Controller
public class RegisterController {
	
	@RequestMapping(value="/registeruser")
/*	public String registerUser(HttpServletRequest request, Model model) {
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		String address = request.getParameter("address");
		String mobile = request.getParameter("mobile");
		User user = new User(name, email, password, address, mobile);
		model.addAttribute("user",user);
		return "user";
	}*/
	
	// another way to write the above lines
	public String registerUser(@ModelAttribute User user,Model model ) {
		model.addAttribute("user",user);
		return "user";
	}
}
