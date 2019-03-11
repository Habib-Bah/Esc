package com.opendevup.model;

import java.io.*;

import javax.persistence.*;


@Entity
@Table(name = "site", schema = "public")
public class Site implements Serializable{

	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@Column(name="nomsite")
	private String nomsite;
	
	@Column(name="localisation")
	private String localisation;
	
	@Column(name="nombredevoie")
	private int nombredevoie;
	
	@Column(name="nombredespits")
	private String nombredespits;

	@Column(name="adresse")
	private String adresse;

	public Site() {
		super();
		
	}

	public Site(String nomsite, String localisation, int nombredevoie, String nombredespits, String adresse) {
		super();
		this.nomsite = nomsite;
		this.localisation = localisation;
		this.nombredevoie = nombredevoie;
		this.nombredespits = nombredespits;
		this.adresse = adresse;
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

	public String getLocalisation() {
		return localisation;
	}

	public void setLocalisation(String localisation) {
		this.localisation = localisation;
	}

	public int getNombredevoie() {
		return nombredevoie;
	}

	public void setNombredevoie(int nombredevoie) {
		this.nombredevoie = nombredevoie;
	}

	public String getNombredespits() {
		return nombredespits;
	}

	public void setNombredespits(String nombredespits) {
		this.nombredespits = nombredespits;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	
	
}
