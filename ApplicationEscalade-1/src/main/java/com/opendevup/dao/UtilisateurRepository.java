package com.opendevup.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.opendevup.model.Utilisateur;

public interface UtilisateurRepository extends JpaRepository<Utilisateur, Long> {

}
