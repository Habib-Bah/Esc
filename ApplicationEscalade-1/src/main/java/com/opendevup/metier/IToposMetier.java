package com.opendevup.metier;

import org.springframework.data.domain.*;

import com.opendevup.model.Commentaire;

public interface IToposMetier {

	public void publiercommentaire(String nomutilisateur, String texte);
	public Page<Commentaire> commentaires(String texte, int page, int size);
	public void reserversite(String nomuser, String nomsite);
	
}
