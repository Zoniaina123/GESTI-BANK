package com.wha.springmvc.model;

import java.util.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
@Entity
@DiscriminatorValue("CAD")
public class CompteAvecDecouvert extends Compte {

	private double decouvert;
	
	public CompteAvecDecouvert() {

	}

	public CompteAvecDecouvert(double solde, Date dateCreation, double decouvert,Client client ) {
		super(solde, dateCreation, client);
	
		this.decouvert = decouvert;
	
	}

	public double getDecouvert() {
		return decouvert;
	}

	public void setDecouvert(double decouvert) {
		this.decouvert = decouvert;
	}
	
	
	
	
	
}
