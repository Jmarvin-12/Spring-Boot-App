package com.mrh2020.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.mrh2020.entity.User;
import com.mrh2020.repository.RoleRepository;
import com.mrh2020.service.UserServiceImpl;

@Controller
public class UserController {

	@Autowired
	UserServiceImpl service;
	
	@Autowired
	RoleRepository rol;
	
	@GetMapping("/")
	public String index() {
		return "index";
	}
	
	@GetMapping("/userForm")
	public String getUserForm(Model model) {
		model.addAttribute("userForm", new User());
		model.addAttribute("roles", rol.findAll() );
		model.addAttribute("Users", service.getAllUsers());
		model.addAttribute("listTab", "active");
		return "user-form/user-view";
	}
	
}
