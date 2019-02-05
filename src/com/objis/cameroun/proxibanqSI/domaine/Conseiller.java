package com.objis.cameroun.proxibanqSI.domaine;

public class Conseiller extends Utilisateur {

	public Conseiller(int idUtilisateur, String nom, String prenom, String code, String telephone, String email,
			String role, String login, String password) {
		super(idUtilisateur, nom, prenom, code, telephone, email, role, login, password);
		// TODO Auto-generated constructor stub
	}

	public Conseiller(String nom, String prenom, String code, String telephone, String email, String role, String login,
			String password) {
		super(nom, prenom, code, telephone, email, role, login, password);
		// TODO Auto-generated constructor stub
	}

	public Conseiller() {
		// TODO Auto-generated constructor stub
	}

}
