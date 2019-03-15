package com.opendevup.model;

public class Reservation {

	private String nomutilisateur;
	private String email;
	private String nomsite;
	
	Site site;
	
	public Reservation(String nomutilisateur, String email, String nomsite) {
		super();
		this.nomutilisateur = nomutilisateur;
		this.email = email;
		this.nomsite = nomsite;
	}
	public Reservation() {
		super();
		
	}
	public String getNomutilisateur() {
		return nomutilisateur;
	}
	public void setNomutilisateur(String nomutilisateur) {
		this.nomutilisateur = nomutilisateur;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getNomsite() {
		return nomsite;
	}
	public void setNomsite(String nomsite) {
		this.nomsite = nomsite;
	}
	
	public String getSite(String nom) {
		return site.getNomsite();
	}
	
}
