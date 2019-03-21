package com.opendevup.web;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.opendevup.dao.AppUserRepository;
import com.opendevup.model.AppUser;
import com.opendevup.utils.EncrytedPasswordUtils;
import com.opendevup.utils.WebUtils;

@Controller
public class MainController {

	@Autowired
	AppUserRepository appuserrepository;
	
	EncrytedPasswordUtils encrypteP;
	
	@RequestMapping(value = { "/", "/welcome" }, method = RequestMethod.GET)
	public String welcomePage(Model model) {
		model.addAttribute("title", "Viens on grimpe");
		model.addAttribute("message", "Bienvenue!");
		return "welcomePage";
	}

	@RequestMapping(value = "/admin", method = RequestMethod.GET)
	public String adminPage(Model model, Principal principal) {

		User loginedUser = (User) ((Authentication) principal).getPrincipal();

		String userInfo = WebUtils.toString(loginedUser);
		model.addAttribute("userInfo", userInfo);

		return "adminPage";
	}

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String loginPage(Model model) {

		return "loginPage";
	}

	@RequestMapping(value = "/logoutSuccessful", method = RequestMethod.GET)
	public String logoutSuccessfulPage(Model model) {
		model.addAttribute("title", "Logout");
		return "logoutSuccessfulPage";
	}

	@RequestMapping(value = "/userInfo", method = RequestMethod.GET)
	public String userInfo(Model model, Principal principal) {

		
		String userName = principal.getName();

		System.out.println("Nom d'utilisateur: " + userName);

		User loginedUser = (User) ((Authentication) principal).getPrincipal();

		String userInfo = WebUtils.toString(loginedUser);
		model.addAttribute("userInfo", userInfo);

		return "userInfoPage";
	}

	@RequestMapping(value = "/403", method = RequestMethod.GET)
	public String accessDenied(Model model, Principal principal) {

		if (principal != null) {
			User loginedUser = (User) ((Authentication) principal).getPrincipal();

			String userInfo = WebUtils.toString(loginedUser);

			model.addAttribute("userInfo", userInfo);

			/*String message = "Hi " + principal.getName()
					+ "<br> Vous n'etes pas autorisé à faire cette action!";
			model.addAttribute("message", message);*/

		}

		return "403Page";
	}
	

	@RequestMapping(value="/form", method = RequestMethod.GET)
	public String formUser(Model model) {
		
		model.addAttribute("appuser", new AppUser());
		return "formUser";
	}
	
	@RequestMapping(value="/save", method = RequestMethod.POST)
	public String save(Model model,  AppUser u) {
		
		
		/*if(bindingresult.hasErrors()) {
			return"formUser";
		}
		
		String password = u.getEncrytedPassword();
		
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        u.setEncrytedPassword(encoder.encode(password));*/
		
		appuserrepository.save(u);
		return "confirmation";
	}
}