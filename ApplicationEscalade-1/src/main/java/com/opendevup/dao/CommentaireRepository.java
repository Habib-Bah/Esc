package com.opendevup.dao;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.opendevup.model.Commentaire;

public interface CommentaireRepository extends JpaRepository<Commentaire, Long>{

	@Query("select c from Commentaire c where c.nomutilisateur = : x")
	public Page<Commentaire> commentaire(@Param("x")String nom, Pageable pageable);
}
