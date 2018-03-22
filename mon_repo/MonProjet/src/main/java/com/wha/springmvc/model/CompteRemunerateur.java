package com.wha.springmvc.model;

import java.sql.Date;

public class CompteRemunerateur extends Compte {
	
	private double taux ;

	public CompteRemunerateur() {
	
	
	}

	public CompteRemunerateur(Date dateCreation, double solde ,double taux ) {
		super(dateCreation, solde);
		this.taux=taux;
	}

	public double getTaux() {
		return taux;
	}

	public void setTaux(double taux) {
		this.taux = taux;
	}
	
	

}
