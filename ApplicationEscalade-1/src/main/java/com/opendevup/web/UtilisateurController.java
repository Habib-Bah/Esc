package com.opendevup.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.opendevup.dao.UtilisateurRepository;
import com.opendevup.model.Utilisateur;

@Controller
public class UtilisateurController {
	
	@Autowired
	private UtilisateurRepository utilisateurrepository;
	
	@GetMapping("/greeting")
    public String greetingForm(Model model) {
        model.addAttribute("greeting", new Utilisateur());
        return "greeting";
    }
	
	@PostMapping("/greeting")
    public String greetingSubmit(@ModelAttribute Utilisateur greeting) {
        return "result";
    }
	
	@RequestMapping(value="/inscription")
	public String Inscriptionform(Model model) {
		model.addAttribute("utilisateur", new Utilisateur());
		return "inscription";
	}
	
	@RequestMapping(value="/saveUtilisateur")
	public String save(Model model, Utilisateur u) {
		
		utilisateurrepository.save(u);
		return "inscription";
	}
}
