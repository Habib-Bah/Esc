package com.opendevup.metier;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.opendevup.model.Commentaire;

@Service
@Transactional
public class ToposMetierImpl implements IToposMetier{


	

	@Override
	public void publiercommentaire(String nomutilisateur, String texte) {
		
	}

	@Override
	public Page<Commentaire> commentaires(String texte, int page, int size) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void reserversite(String nomuser, String nomsite) {
		// TODO Auto-generated method stub
		
	}

}
