package com.opendevup.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "reservation", schema = "public")
public class Reservation implements Serializable{

	
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@Column(name="nomutilisateur")
	private String nomutilisateur;
	
	@Column(name="nomsite")
	private String nomsite;
	
	@Column(name="datedebut")
	private String datedebut;
	
	@Column(name="datefin")
	private String datefin;
	
	Site site;
	
	public Reservation(String nomutilisateur,  String nomsite, String datedebut, String datefin) {
		super();
		this.nomutilisateur = nomutilisateur;
		this.nomsite = nomsite;
		this.datedebut = datedebut;
		this.datefin = datefin;
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
	
	public String getNomsite() {
		return nomsite;
	}
	public void setNomsite(String nomsite) {
		this.nomsite = nomsite;
	}
	
	public String getSite(String nom) {
		return site.getNomsite();
	}
	public String getDatedebut() {
		return datedebut;
	}
	public void setDatedebut(String datedebut) {
		this.datedebut = datedebut;
	}
	public String getDatefin() {
		return datefin;
	}
	public void setDatefin(String datefin) {
		this.datefin = datefin;
	}
	
	
}
