package com.opendevup.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.opendevup.dao.SiteRepository;
import com.opendevup.dao.ToposRepository;
import com.opendevup.model.Site;
import com.opendevup.model.Topos;

@Controller
@RequestMapping(value = "/Topos")
public class ToposController {

	@Autowired
	private ToposRepository toposrepository;
	
	@Autowired
	private SiteRepository siterepository;
	

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
	
	@RequestMapping(value="/Recherche")
	public String Recherche(String localisation, Model model) {
		List<Site> listesite = siterepository.findByLocalisation(localisation);
		model.addAttribute("listesite", listesite);
		return ("recherche");
	}
	
}
