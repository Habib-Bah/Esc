package com.opendevup;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.opendevup.dao.ToposRepository;
import com.opendevup.dao.UtilisateurRepository;
import com.opendevup.model.Topos;
import com.opendevup.model.Utilisateur;

@SpringBootApplication
public class ApplicationEscalade1Application {

	public static void main(String[] args) {
		
		//Creation d'un Application Context pour avoir un bien qui va nous retourner un objet
		//qui implemente notre interface TopoSrepository
		ApplicationContext ctx = SpringApplication.run(ApplicationEscalade1Application.class, args);
		
		ToposRepository toposrepository = ctx.getBean(ToposRepository.class);
		UtilisateurRepository utilisateurrepository = ctx.getBean(UtilisateurRepository.class);
		toposrepository.save(new Topos("Site Lanister", 16, 11, "130m", "8C", 18, "France", true));
		toposrepository.save(new Topos("Site Stark", 42, 25, "550m", "9A", 18, "France", true));
		toposrepository.save(new Topos("Site River", 18, 15, "230m", "7C", 19, "Espagne", true));
		toposrepository.save(new Topos("Site Phenix", 8, 10, "120m", "6A", 15, "Espagne", false));
		toposrepository.save(new Topos("Site de Coop", 14, 14, "330m", "8C", 19, "Allemagne", true));
		toposrepository.save(new Topos("Site le BT2", 9, 10, "110m", "7C", 11, "Italie", true));
		toposrepository.save(new Topos("Site Alpine", 19, 22, "770m", "9A", 20, "France", true));
		toposrepository.save(new Topos("Site Roja", 16, 11, "130m", "8C", 18, "Espagne", false));
		toposrepository.save(new Topos("Site TKK", 14, 11, "190m", "7B", 15, "Italie", true));
		toposrepository.save(new Topos("Site B42", 16, 11, "290m", "8A", 23, "France", true));
		toposrepository.save(new Topos("Site NKM", 16, 9, "130m", "6B", 18, "Espagne", true));
		toposrepository.save(new Topos("Site Marwn", 19, 19, "220m", "8A", 19, "France", true));
		toposrepository.save(new Topos("Site Loop", 12, 10, "150m", "7A", 18, "Allemagne", true));
		toposrepository.save(new Topos("Site Mixte", 10, 11, "170m", "6A", 15, "Italie", false));
		toposrepository.save(new Topos("Site The QQR", 17, 16, "220m", "9C", 17, "Espagne", true));
		
		toposrepository.save(new Topos("Site PatCoq", 16, 19, "590m", "8A", 27, "France", true));
		toposrepository.save(new Topos("Site Marwell", 20, 26, "730m", "9A", 22, "France", true));
		toposrepository.save(new Topos("Site CDN", 17, 17, "190m", "7A", 19, "Espagne", true));
		
		toposrepository.save(new Topos("Site PONG", 20, 21, "330m", "8C", 18, "Allemagne", true));
		toposrepository.save(new Topos("Site ICNI", 14, 14, "160m", "6A", 120, "France", true));
		
		utilisateurrepository.save(new Utilisateur("Zappelini", "Kristelle", "zappelini@hotmail.fr", "123456"));
	}

}
