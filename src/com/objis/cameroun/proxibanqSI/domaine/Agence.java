package com.objis.cameroun.proxibanqSI.domaine;

import java.util.Date;

/**
 * @author Banga Erick
 * @since 05/02/2019
 * @see Description: Cette classe permet de conserver des informations liées a une Agence'
 * @version 1.0 
 */
public class Agence {

	private int idAgence;
	private Date dateCreation;
	private String nom;
	private String code;
	
	
	/**
	 * @param idAgence
	 * @param dateCreation
	 * @param nom
	 * @param code
	 */
	public Agence(int idAgence, Date dateCreation, String nom, String code) {
		super();
		this.idAgence = idAgence;
		this.dateCreation = dateCreation;
		this.nom = nom;
		this.code = code;
	}


	/**
	 * @param dateCreation
	 * @param nom
	 * @param code
	 */
	public Agence(Date dateCreation, String nom, String code) {
		super();
		this.dateCreation = dateCreation;
		this.nom = nom;
		this.code = code;
	}


	public Agence() {
		super();
	}


	/**
	 * @return the idAgence
	 */
	public int getIdAgence() {
		return idAgence;
	}


	/**
	 * @param idAgence the idAgence to set
	 */
	public void setIdAgence(int idAgence) {
		this.idAgence = idAgence;
	}


	/**
	 * @return the dateCreation
	 */
	public Date getDateCreation() {
		return dateCreation;
	}


	/**
	 * @param dateCreation the dateCreation to set
	 */
	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}


	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}


	/**
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}


	/**
	 * @return the code
	 */
	public String getCode() {
		return code;
	}


	/**
	 * @param code the code to set
	 */
	public void setCode(String code) {
		this.code = code;
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Agence [idAgence=" + idAgence + ", dateCreation=" + dateCreation + ", nom=" + nom + ", code=" + code
				+ "]";
	}
	
}
