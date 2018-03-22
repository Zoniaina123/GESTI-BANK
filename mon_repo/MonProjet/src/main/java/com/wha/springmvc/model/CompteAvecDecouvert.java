package com.wha.springmvc.model;

import java.sql.Date;

public class CompteAvecDecouvert extends Compte {

	private double decouvert;

	public CompteAvecDecouvert() {

	}

	public CompteAvecDecouvert(Date dateCreation, double solde, double decouvert) {
		super(dateCreation, solde);
		this.decouvert = decouvert;
		

	}

	public double getDecouvert() {
		return decouvert;
	}

	public void setDecouvert(double decouvert) {
		this.decouvert = decouvert;
	}
	
	

}
