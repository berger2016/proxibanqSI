package com.objis.cameroun.proxibanqSI.domaine;

public class Gerant extends Utilisateur {

	public Gerant(int idUtilisateur, String nom, String prenom, String code, String telephone, String email,
			String role, String login, String password) {
		super(idUtilisateur, nom, prenom, code, telephone, email, role, login, password);
		// TODO Auto-generated constructor stub
	}

	public Gerant(String nom, String prenom, String code, String telephone, String email, String role, String login,
			String password) {
		super(nom, prenom, code, telephone, email, role, login, password);
		// TODO Auto-generated constructor stub
	}

	public Gerant() {
		// TODO Auto-generated constructor stub
	}

}
