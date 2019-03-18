package com.opendevup.model;

public class Reservation {

	private String nomutilisateur;
	private String email;
	private String nomtopo;
	
	Site site;
	
	public Reservation(String nomutilisateur, String email, String nomsite) {
		super();
		this.nomutilisateur = nomutilisateur;
		this.email = email;
		this.nomtopo = nomsite;
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
		return nomtopo;
	}
	public void setNomsite(String nomsite) {
		this.nomtopo = nomsite;
	}
	
	public String getSite(String nom) {
		return site.getNomsite();
	}
	
}
