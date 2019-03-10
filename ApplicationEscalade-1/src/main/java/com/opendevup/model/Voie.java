package com.opendevup.model;

import java.io.*;
import javax.persistence.*;

@Entity
@Table(name = "voie", schema = "public")
public class Voie implements Serializable{

	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@Column(name="nomvoie")
	private String nomvoie;
	
	@Column(name="nomsite")
	private String nomsite;
	
	@Column(name="longueur")
	private int longueur;
	
	@Column(name="cotation")
	private String cotation;

	public Voie(String nomvoie, String nomsite, int longueur, String cotation) {
		super();
		this.nomvoie = nomvoie;
		this.nomsite = nomsite;
		this.longueur = longueur;
		this.cotation = cotation;
	}

	public Voie() {
		super();
		
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNomvoie() {
		return nomvoie;
	}

	public void setNomvoie(String nomvoie) {
		this.nomvoie = nomvoie;
	}

	public String getNomsite() {
		return nomsite;
	}

	public void setNomsite(String nomsite) {
		this.nomsite = nomsite;
	}

	public int getLongueur() {
		return longueur;
	}

	public void setLongueur(int longueur) {
		this.longueur = longueur;
	}

	public String getCotation() {
		return cotation;
	}

	public void setCotation(String cotation) {
		this.cotation = cotation;
	}	
	
}
