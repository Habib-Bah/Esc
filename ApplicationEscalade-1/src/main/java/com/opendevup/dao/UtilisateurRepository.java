package com.opendevup.dao;
import org.springframework.data.repository.CrudRepository;

import com.opendevup.model.Utilisateur;

public interface UtilisateurRepository extends CrudRepository<Utilisateur, Long> {

	Utilisateur findByEmail(String email);
}
