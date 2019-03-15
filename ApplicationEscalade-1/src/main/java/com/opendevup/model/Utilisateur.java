package com.opendevup.model;

import java.io.Serializable;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "utilisateur", schema = "public")
public class Utilisateur implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	
	@Column(name = "nom")
	@NotNull
	@Size(min=2, max=10) 
	private String nom;

	@Column(name = "prenom")
	@NotNull
	private String prenom;

	@Column(name = "email")
	@NotNull
	@Size(min=5, max=20)
	private String email;

	@Column(name = "motdepasse")
	@NotNull
	private String motdepasse;

	public Utilisateur() {
		super();
	}

	public Utilisateur(String nom, String prenom, String email, String motdepasse) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.motdepasse = motdepasse;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMotdepasse() {
		return motdepasse;
	}

	public void setMotdepasse(String motdepasse) {
		this.motdepasse = motdepasse;
	}

}
