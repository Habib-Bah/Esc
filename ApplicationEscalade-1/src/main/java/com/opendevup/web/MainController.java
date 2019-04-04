package com.opendevup.web;

import java.security.Principal;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.opendevup.dao.AppUserRepository;
import com.opendevup.dao.CommentaireRepository;
import com.opendevup.dao.ReservationRepository;
import com.opendevup.dao.ToposRepository;
import com.opendevup.model.AppUser;
import com.opendevup.model.Commentaire;
import com.opendevup.model.Reservation;
import com.opendevup.model.Topos;
import com.opendevup.utils.EncrytedPasswordUtils;
import com.opendevup.utils.WebUtils;

@Controller
public class MainController {

	static List<Topos> toposL;

	@Autowired
	AppUserRepository appuserrepository;

	@Autowired
	CommentaireRepository commentairerepository;

	@Autowired
	ToposRepository toporepository;

	@Autowired
	ToposRepository toposrepository;
	
	@Autowired
	ReservationRepository reservationrepository;

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

			/*
			 * String message = "Hi " + principal.getName() +
			 * "<br> Vous n'etes pas autorisé à faire cette action!";
			 * model.addAttribute("message", message);
			 */

		}

		return "403Page";
	}

	@RequestMapping(value = "/form", method = RequestMethod.GET)
	public String formUser(Model model) {

		model.addAttribute("appuser", new AppUser());
		return "formUser";
	}

	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String save(Model model, AppUser u) {

		/*
		 * if(bindingresult.hasErrors()) { return"formUser"; }
		 * 
		 * String password = u.getEncrytedPassword();
		 * 
		 * BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		 * u.setEncrytedPassword(encoder.encode(password));
		 */

		appuserrepository.save(u);
		return "confirmation";
	}

	@RequestMapping(value = "/formc", method = RequestMethod.GET)
	public String greetingForm(Model model) {
		model.addAttribute("commentaire", new Commentaire());
		return "formC";
	}

	@RequestMapping(value = "/saveC", method = RequestMethod.POST)
	public String greetingSubmit(Model model, Commentaire c) {

		commentairerepository.save(c);
		return "result";
	}

	@RequestMapping(value = "/formR", method = RequestMethod.GET)
	public String recherTopo(Model model, @RequestParam(name = "localisation", defaultValue = "") String mc) {

		toposL = toposrepository.findByLocalisation(mc);
		model.addAttribute("toposL", toposL);
		return "formR";
	}

	@RequestMapping(value = "/recherche", method = RequestMethod.POST)
	public String reche(Model model) {

		model.addAttribute("toposL", toposL);
		return "recherche";
	}

	@RequestMapping(value = "/formReservation", method = RequestMethod.GET)
	public String formReservation(Model model) {

		model.addAttribute("reservation", new Reservation());
		return "formReservation";
	}

	@RequestMapping(value = "/saveReservation", method = RequestMethod.POST)
	public String saveR(Model model, Reservation reservation) {

		List<Topos> t = toporepository.findAll();

		for (Topos topo : t) {

			if (topo.getNomsite().equalsIgnoreCase(reservation.getNomsite())
					|| !topo.getNomsite().equalsIgnoreCase(reservation.getNomsite())) {
				if (topo.isDisponibilite()) {
					topo.setDisponibilite(false);
				} else {
					return "mauvaiseReservation";
				}
			}

		}

		reservationrepository.save(reservation);
		return "resultatReservation";
	}

	@RequestMapping(value = "/formTopos", method = RequestMethod.GET)
	public String formTopo(Model model) {

		model.addAttribute("topos", new Topos());
		return "formTopos";
	}

	@RequestMapping(value = "/saveTopo", method = RequestMethod.POST)
	public String saveT(Model model, Topos topos) {

		topos.setDisponibilite(true);
		toporepository.save(topos);
		return "resultatTopos";
	}

	@RequestMapping(value = "/fin", method = RequestMethod.GET)
	public String finReser(Model model) {

		model.addAttribute("reservation", new Reservation());
		return "fin";
	}

	@RequestMapping(value = "/saveFin", method = RequestMethod.POST)
	public String saveFinRE(Model model, Reservation reservation) {

		List<Topos> t = toporepository.findAll();
		for (Topos topo : t) {

			if (topo.getNomsite().equalsIgnoreCase(reservation.getNomsite())){
				if (topo.isDisponibilite()) {
					return "mauvaiseReservation2";
					
					
				} else {
					topo.setDisponibilite(true);
				}
			}

		}
		return "resultatFinReservation";
	}
	
	
	@RequestMapping(value = "/find", method = RequestMethod.GET)
	public String find(Model model) {

		model.addAttribute("topos", new Topos());
		return "find";
	}

	@RequestMapping(value = "/saveFind", method = RequestMethod.POST)
	public String save(Model model, Topos topos) {

		
	List<Topos>tp = toposrepository.findAll();
	
	List<Topos> topo = new ArrayList<>();
	
	for(Topos t : tp) {
		if (t.getLocalisation().equalsIgnoreCase(topos.getLocalisation())) {
			topo.add(t);
		}
	}
	model.addAttribute("topo", topo);
		
		return "findResult";
	}
}