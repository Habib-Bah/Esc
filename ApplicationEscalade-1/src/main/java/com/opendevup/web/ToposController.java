package com.opendevup.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.opendevup.dao.ToposRepository;
import com.opendevup.model.Topos;

@Controller
@RequestMapping(value = "/Topos")
public class ToposController {

	@Autowired
	private ToposRepository toposrepository;
	

	@RequestMapping(value = "/ListeTopos")
	public String ListTopos(Model model) {
		
		List<Topos> topos = toposrepository.findAll();
		model.addAttribute("listetopos", topos);
		return "listetopos";
	}
	
	@RequestMapping(value ="/Connexion")
	public String Connexion() {
		return "connexion";
	}
	
	
}
