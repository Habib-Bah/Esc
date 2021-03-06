package com.opendevup.model;

import java.io.*;
import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "commentaire", schema = "public")
public class Commentaire implements Serializable{


	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@Column(name="nomutilisateur")
	@NotNull
	@Size(min=2, max=10) 
	private String nomutilisateur;
	
	@Column(name="texte")
	@NotNull
	@Size(min=2, max=100) 
	private String texte;

	public Commentaire() {
		super();
		
	}

	public Commentaire(String nomutilisateur, String texte) {
		super();
		this.nomutilisateur = nomutilisateur;
		this.texte = texte;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNomutilisateur() {
		return nomutilisateur;
	}

	public void setNomutilisateur(String nomutilisateur) {
		this.nomutilisateur = nomutilisateur;
	}

	public String getTexte() {
		return texte;
	}

	public void setTexte(String texte) {
		this.texte = texte;
	}
	
	
}
