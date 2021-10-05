package com.seven.controller;

import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.log4j.Log4j;


@Log4j
@Controller
public class CommonController {

	@RequestMapping( value = "/accessError")
	public void accessDenied(Authentication auth, Model model) {
		log.info("access Denied 다! :" +auth);
		
		model.addAttribute("msg", "access DeNied");
		model.addAttribute("msg1", auth);
	}
	
	@RequestMapping(value = "/customLogin" )
	public void customedLoginPage(String error, String logout,Model model) {
		log.info("error :" +error);
		log.info("logout :" +logout);
		log.info("customed Login Page !");
		model.addAttribute("msg", "customed");
	}
	
	@GetMapping("/customLogout")
	public void customLogout() {
		log.info("custom Logout");
	}
}
