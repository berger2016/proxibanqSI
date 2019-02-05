package com.objis.cameroun.proxibanqSI.domaine;

import java.util.Date;

/**
 * @author Banga Erick
 * @since 23/09/2018
 * @see Description: Cette classe permet de factoriser les proprietes et methodes communes aux classes 'Apprenant' et 'Enseignant'
 * @version 1.0 
 */

public class Compte {
	
	private Date dateOuverture;
	private String numCompte;
	private double solde;
	
	/**
	 * @param dateOuverture
	 * @param numCompte
	 * @param solde
	 */
	public Compte(Date dateOuverture, String numCompte, double solde) {
		super();
		this.dateOuverture = dateOuverture;
		this.numCompte = numCompte;
		this.solde = solde;
	}

	public Compte() {
		super();
	}

	/**
	 * @return the dateOuverture
	 */
	public Date getDateOuverture() {
		return dateOuverture;
	}

	/**
	 * @param dateOuverture the dateOuverture to set
	 */
	public void setDateOuverture(Date dateOuverture) {
		this.dateOuverture = dateOuverture;
	}

	/**
	 * @return the numCompte
	 */
	public String getNumCompte() {
		return numCompte;
	}

	/**
	 * @param numCompte the numCompte to set
	 */
	public void setNumCompte(String numCompte) {
		this.numCompte = numCompte;
	}

	/**
	 * @return the solde
	 */
	public double getSolde() {
		return solde;
	}

	/**
	 * @param solde the solde to set
	 */
	public void setSolde(double solde) {
		this.solde = solde;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Compte [dateOuverture=" + dateOuverture + ", numCompte=" + numCompte + ", solde=" + solde + "]";
	}
	
}
