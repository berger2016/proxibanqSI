package com.objis.cameroun.proxibanqSI.domaine;

import java.util.Date;

/**
 * @author Banga Erick
 * @since 23/09/2018
 * @see Description: Cette classe permet de factoriser les proprietes et methodes communes aux classes 'Apprenant' et 'Enseignant'
 * @version 1.0 
 */
public class CompteEpargne extends Compte {

	private  double tauxRemuneration = 0.03;

	/**
	 * @param dateOuverture
	 * @param numCompte
	 * @param solde
	 */
	public CompteEpargne(Date dateOuverture, String numCompte, double solde) {
		super(dateOuverture, numCompte, solde);
		
	}

	public CompteEpargne(Date dateOuverture, String numCompte, double solde, double tauxRemuneration) {
		super(dateOuverture, numCompte, solde);
		this.tauxRemuneration = tauxRemuneration;
	}

	/**
	 * @return the tauxRemuneration
	 */
	public double getTauxRemuneration() {
		return tauxRemuneration;
	}

	/**
	 * @param tauxRemuneration the tauxRemuneration to set
	 */
	public void setTauxRemuneration(double tauxRemuneration) {
		this.tauxRemuneration = tauxRemuneration;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "CompteEpargne [tauxRemuneration=" + tauxRemuneration + "]";
	}

}
