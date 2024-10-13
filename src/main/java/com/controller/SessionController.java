package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.bean.UserBean;

@Controller
public class SessionController {

	@GetMapping("/signup")
	public String signup() {
		return "Signup";// jsp name
	}

	@GetMapping("/login")
	public String login() {
		return "Login";// jsp name
	}

	@PostMapping("/saveuser")
	public String saveUser(@Validated UserBean user,BindingResult result, Model model) {
		// request.getParameter()
		//
//		System.out.println(user.getFirstName());
//		System.out.println(user.getEmail());
//
//		boolean isError = false;
//
//		if (user.getFirstName() == null || user.getFirstName().trim().length() == 0) {
//			isError = true;
//			model.addAttribute("firstNameError", "Please Enter FirstName");// set
//		}
//
//		if (isError == true) {
//			return "Signup";
//		} else {
//
//			return "Login";// jsp name
//		}
//------------------------------------------------------------------------------------
		
		
		if(result.hasErrors()) {
			model.addAttribute("result",result);
			model.addAttribute("user",user);
			return "Signup";
		}else {
			return "Login";
		}
	}
}
