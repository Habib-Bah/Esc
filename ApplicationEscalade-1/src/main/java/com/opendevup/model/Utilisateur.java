package com.opendevup.model;

import java.io.Serializable;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

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
	
	@Column(name = "role")
	@NotNull
	private String role;
	
	@Column(name = "enabled")
	@NotNull
	private boolean enabled;

	
	
	public Utilisateur() {
		super();
		
		setRole("ROLE_ADMIN");
		setEnabled(true);
	}

	public Utilisateur(String nom, String prenom, String email, String motdepasse) {
		super();
		this.nom = nom;
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();       
		this.prenom = encoder.encode(motdepasse);
		this.email = email;
		this.motdepasse = motdepasse;
		setRole("ROLE_ADMIN");
		setEnabled(true);
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

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}
	
	

}
