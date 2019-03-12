package com.opendevup.web;

import java.util.*;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.opendevup.dao.ToposRepository;
import com.opendevup.model.Topos;
import com.opendevup.model.Utilisateur;

@Controller
@RequestMapping(value="/Topos")
public class ToposController {

	@Autowired
	private ToposRepository toposrepository;
	
	@RequestMapping(value="/ListeTopos")
	public String ListTopos(Model model) {
		
		List<Topos> topos = toposrepository.findAll();
		model.addAttribute("listetopos", topos);
		return "listetopos";
	}
	
	@GetMapping(value="/Inscription")
	public String Inscription(Model model) {
		
		model.addAttribute("utilisateur", new Utilisateur());
		return "inscription";
	}
}
