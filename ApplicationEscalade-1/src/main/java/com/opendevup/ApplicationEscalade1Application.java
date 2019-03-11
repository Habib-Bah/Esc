package com.opendevup;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.opendevup.dao.ToposRepository;
import com.opendevup.model.Topos;

@SpringBootApplication
public class ApplicationEscalade1Application {

	public static void main(String[] args) {
		
		//Creation d'un Application Context pour avoir un bien qui va nous retourner un objet
		//qui implemente notre interface TopoSrepository
		ApplicationContext ctx = SpringApplication.run(ApplicationEscalade1Application.class, args);
		
		ToposRepository toposrepository = ctx.getBean(ToposRepository.class);
		toposrepository.save(new Topos("Site lanister", 16, 11, "130m", "8C", 18, "France", true));
	}

}
