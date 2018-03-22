package com.wha.springmvc.model;

import java.sql.Date;

public class CompteSansDecouvert extends Compte {
	
	private double decouvert ;

	public CompteSansDecouvert() {
		this.decouvert=0;
	}

	public CompteSansDecouvert(Date dateCreation, double solde) {
		super(dateCreation, solde);

	}
	
	
	
	

}
