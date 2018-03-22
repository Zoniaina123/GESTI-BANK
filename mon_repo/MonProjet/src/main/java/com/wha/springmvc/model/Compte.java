package com.wha.springmvc.model;

import java.sql.Date;

public class Compte {
	private int numeroCompte ;
	
	private Date dateCreation ;
	
private double solde ;

public Compte() {

}

public Compte(Date dateCreation, double solde) {

	this.dateCreation = dateCreation;
	this.solde = solde;
}

public int getNumeroCompte() {
	return numeroCompte;
}

public void setNumeroCompte(int numeroCompte) {
	this.numeroCompte = numeroCompte;
}

public Date getDateCreation() {
	return dateCreation;
}

public void setDateCreation(Date dateCreation) {
	this.dateCreation = dateCreation;
}

public double getSold() {
	return solde;
}

public void setSolde(double solde) {
	
	this.solde = solde;
}
	
	
	
}
