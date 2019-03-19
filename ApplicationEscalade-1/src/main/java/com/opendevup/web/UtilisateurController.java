package com.opendevup.web;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.opendevup.dao.CommentaireRepository;
import com.opendevup.dao.UtilisateurRepository;
import com.opendevup.model.Commentaire;
import com.opendevup.model.Reservation;
import com.opendevup.model.Utilisateur;

@Controller
public class UtilisateurController {
	
	@Autowired
	private UtilisateurRepository utilisateurrepository;
	
	@Autowired
	private CommentaireRepository commentairerepository;
	
	@GetMapping("/greeting")
    public String greetingForm(Model model) {
        model.addAttribute("greeting", new Commentaire());
        return "greeting";
    }
	
	@PostMapping("/greeting")
    public String greetingSubmit(@ModelAttribute Commentaire greeting) {
        return "result";
    }
	
	/*@RequestMapping(value="/saveCommentaire")
	public String saveC(Model model, @Valid Commentaire c, BindingResult bindingresult) {
		
		if(bindingresult.hasErrors()) {
			return"greeting";
		}
		
		commentairerepository.save(c);
		return "resultatcommentaire";
	}*/
	
	@RequestMapping(value = "/ListeCommentaire")
	public String ListCommentaire(Model model) {

		List<Commentaire> commentaire = commentairerepository.findAll();
		model.addAttribute("listecom", commentaire);
		return "listecommentaire";
	}
	
	@RequestMapping(value="/inscription")
	public String Inscriptionform(Model model) {
		model.addAttribute("utilisateur", new Utilisateur());
		return "inscription";
	}
	
	@RequestMapping(value="/saveUtilisateur")
	public String save(Model model, @Valid Utilisateur u, BindingResult bindingresult) {
		
		if(bindingresult.hasErrors()) {
			return"inscription";
		}
		
		utilisateurrepository.save(u);
		return "resultat";
	}
	
	@RequestMapping(value="/reservation")
	public String Reservation(Model model) {
		model.addAttribute("reservation", new Reservation());
        return "reservation";
	}
	
	@PostMapping("/reservation")
    public String reservationSubmit(@ModelAttribute Reservation reservation) {
        return "resultreservation";
    }
	
}
