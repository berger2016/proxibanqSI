package com.objis.cameroun.proxibanqSI.domaine;

/**
 * @author Banga Erick
 * @since 05/02/2019
 * @see Description: Cette classe permet de factoriser les proprietes et methodes communes aux classes 'Apprenant' et 'Enseignant'
 * @version 1.0 
 */
public class Client {
	
	private int idClient;
	private String adresse;
	private String codePostal;
	private String email;
	private String nom;
	private String prenom;
	private String telephone;
	private String profession;
	private String ville;
	
	/**
	 * @param idClient
	 * @param adresse
	 * @param codePostal
	 * @param email
	 * @param nom
	 * @param prenom
	 * @param telephone
	 * @param profession
	 * @param ville
	 */
	public Client(int idClient, String adresse, String codePostal, String email, String nom, String prenom,
			String telephone, String profession, String ville) {
		super();
		this.idClient = idClient;
		this.adresse = adresse;
		this.codePostal = codePostal;
		this.email = email;
		this.nom = nom;
		this.prenom = prenom;
		this.telephone = telephone;
		this.profession = profession;
		this.ville = ville;
	}

	/**
	 * @param adresse
	 * @param codePostal
	 * @param email
	 * @param nom
	 * @param prenom
	 * @param telephone
	 * @param profession
	 * @param ville
	 */
	public Client(String adresse, String codePostal, String email, String nom, String prenom, String telephone,
			String profession, String ville) {
		super();
		this.adresse = adresse;
		this.codePostal = codePostal;
		this.email = email;
		this.nom = nom;
		this.prenom = prenom;
		this.telephone = telephone;
		this.profession = profession;
		this.ville = ville;
	}

	/**
	 * @return the idClient
	 */
	public int getIdClient() {
		return idClient;
	}

	/**
	 * @param idClient the idClient to set
	 */
	public void setIdClient(int idClient) {
		this.idClient = idClient;
	}

	/**
	 * @return the adresse
	 */
	public String getAdresse() {
		return adresse;
	}

	/**
	 * @param adresse the adresse to set
	 */
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	/**
	 * @return the codePostal
	 */
	public String getCodePostal() {
		return codePostal;
	}

	/**
	 * @param codePostal the codePostal to set
	 */
	public void setCodePostal(String codePostal) {
		this.codePostal = codePostal;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
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
	 * @return the prenom
	 */
	public String getPrenom() {
		return prenom;
	}

	/**
	 * @param prenom the prenom to set
	 */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	/**
	 * @return the telephone
	 */
	public String getTelephone() {
		return telephone;
	}

	/**
	 * @param telephone the telephone to set
	 */
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	/**
	 * @return the profession
	 */
	public String getProfession() {
		return profession;
	}

	/**
	 * @param profession the profession to set
	 */
	public void setProfession(String profession) {
		this.profession = profession;
	}

	/**
	 * @return the ville
	 */
	public String getVille() {
		return ville;
	}

	/**
	 * @param ville the ville to set
	 */
	public void setVille(String ville) {
		this.ville = ville;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Client [idClient=" + idClient + ", adresse=" + adresse + ", codePostal=" + codePostal + ", email="
				+ email + ", nom=" + nom + ", prenom=" + prenom + ", telephone=" + telephone + ", profession="
				+ profession + ", ville=" + ville + "]";
	}
	

}