package com.opendevup.sec;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SecurityController {

	@RequestMapping("/login")
	public String login() {
		
		return("login");
	}
	
	@RequestMapping("/403")
	public String accesDinied() {
		
		return("403");
	}
}
