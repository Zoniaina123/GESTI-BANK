package com.wha.springmvc.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
//import javax.persistence.Table;

import com.mysql.fabric.xmlrpc.Client;



@Entity
//@Table(name="Conseiller")
//@DiscriminatorValue("Conseiller")

public class Conseiller extends User {

	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int matricule;

	private Date dateDebut;

	private Client clients;
	
	
	
	
	

	/**
	 * Default constructor
	 */
	public Conseiller() {
	}

	public Conseiller(int matricule, Date dateDebut, Client clients) {
		super();
		this.matricule = matricule;
		this.dateDebut = dateDebut;
		this.clients = clients;
	}
	
	
	public Conseiller(int id, String username, String prenom, String email, String pwd, String address, String numTel) {
		super(id, username, prenom, email, pwd, address, numTel);
		// TODO Auto-generated constructor stub
	}



	public int getMatricule() {
		return matricule;
	}

	public void setMatricule(int matricule) {
		this.matricule = matricule;
	}

	public Date getDateDebut() {
		return dateDebut;
	}

	public void setDateDebut(Date dateDebut) {
		this.dateDebut = dateDebut;
	}

	public Client getClients() {
		return clients;
	}

	public void setClients(Client clients) {
		this.clients = clients;
	}

	@Override
	public String toString() {
		return "Conseiller [matricule=" + matricule + ", dateDebut=" + dateDebut + ", clients=" + clients + "]";
	}
	

}