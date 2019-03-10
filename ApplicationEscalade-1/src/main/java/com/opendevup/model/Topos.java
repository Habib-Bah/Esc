package com.opendevup.model;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name = "topos", schema = "public")
public class Topos implements Serializable{

	

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@Column(name="nomsite")
	private String nomsite;
	
	@Column(name="secteur")
	private int secteur;
	
	@Column(name="nombredevoie")
	private int nombredevoie;
	
	@Column(name="hauteur")
	private String hauteur;
	
	@Column(name="cotation")
	private String cotation;
	
	@Column(name="nombredepoint")
	private int nombredepoint;
	
	@Column(name="localisation")
	private String localisation;
	
	@Column(name="disponibilite")
	public boolean disponibilite;
	
	public Topos(String nomsite, int secteur, int nombredevoie, String hauteur, String cotation, int nombredepoint,
			String localisation, boolean disponibilite) {
		super();
		this.nomsite = nomsite;
		this.secteur = secteur;
		this.nombredevoie = nombredevoie;
		this.hauteur = hauteur;
		this.cotation = cotation;
		this.nombredepoint = nombredepoint;
		this.localisation = localisation;
		this.disponibilite = disponibilite;
	}
	public Topos() {
		super();
		
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNomsite() {
		return nomsite;
	}
	public void setNomsite(String nomsite) {
		this.nomsite = nomsite;
	}
	public int getSecteur() {
		return secteur;
	}
	public void setSecteur(int secteur) {
		this.secteur = secteur;
	}
	public int getNombredevoie() {
		return nombredevoie;
	}
	public void setNombredevoie(int nombredevoie) {
		this.nombredevoie = nombredevoie;
	}
	public String getHauteur() {
		return hauteur;
	}
	public void setHauteur(String hauteur) {
		this.hauteur = hauteur;
	}
	public String getCotation() {
		return cotation;
	}
	public void setCotation(String cotation) {
		this.cotation = cotation;
	}
	public int getNombredepoint() {
		return nombredepoint;
	}
	public void setNombredepoint(int nombredepoint) {
		this.nombredepoint = nombredepoint;
	}
	public String getLocalisation() {
		return localisation;
	}
	public void setLocalisation(String localisation) {
		this.localisation = localisation;
	}
	public boolean isDisponibilite() {
		return disponibilite;
	}
	public void setDisponibilite(boolean disponibilite) {
		this.disponibilite = disponibilite;
	}
	
	
	
}
