package com.opendevup;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ApplicationEscalade1Application {

	public static void main(String[] args) {
		
		//Creation d'un Application Context pour avoir un bien qui va nous retourner un objet
		//qui implemente notre interface TopoSrepository
		ApplicationContext ctx = SpringApplication.run(ApplicationEscalade1Application.class, args);
		
		/*ToposRepository toposrepository = ctx.getBean(ToposRepository.class);
		toposrepository.save(new Topos("Site Lanister", 16, 11, "130m", "8C", 18, "France", true));*/
		
		/*SiteRepository site = ctx.getBean(SiteRepository.class);
		site.save(new Site("Site Lanister", "France", 11, "44", "6 rue gambeta"));
		site.save(new Site("Site Stark", "France", 25, "56", "22 avenue paul doumer"));*/
		
		/*CommentaireRepository com = ctx.getBean(CommentaireRepository.class);
		com.save(new Commentaire("Zappelini", "J'ai été au site du Stark et c'etait tout simplement magnifique. J'y retournerai"));*/
		
		/*List<Site> sit = site.findByLocalisation("France");
		
		sit.forEach(s -> System.out.println(s.getNomsite()));*/
	}

}
