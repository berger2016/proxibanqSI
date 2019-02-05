package com.objis.cameroun.proxibanqSI.domaine;

import java.util.Date;

/**
 * @author Banga Erick
 * @since 23/09/2018
 * @see Description: Cette classe permet de factoriser les proprietes et methodes communes aux classes 'Apprenant' et 'Enseignant'
 * @version 1.0 
 */
public class CompteCourant extends Compte {

	private double autorisationDecouvert =1000;

	/**
	 * @param dateOuverture
	 * @param numCompte
	 * @param solde
	 * @param autorisationDecouvert
	 */
	public CompteCourant(Date dateOuverture, String numCompte, double solde, double autorisationDecouvert) {
		super(dateOuverture, numCompte, solde);
		this.autorisationDecouvert = autorisationDecouvert;
	}

	public CompteCourant(Date dateOuverture, String numCompte, double solde) {
		super(dateOuverture, numCompte, solde);
	}

	public CompteCourant() {

	}

	/**
	 * @return the autorisationDecouvert
	 */
	public double getAutorisationDecouvert() {
		return autorisationDecouvert;
	}

	/**
	 * @param autorisationDecouvert the autorisationDecouvert to set
	 */
	public void setAutorisationDecouvert(double autorisationDecouvert) {
		this.autorisationDecouvert = autorisationDecouvert;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "CompteCourant [autorisationDecouvert=" + autorisationDecouvert + "]";
	}
	

}
