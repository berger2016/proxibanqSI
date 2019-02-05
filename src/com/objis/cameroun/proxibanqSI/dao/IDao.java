package com.objis.cameroun.proxibanqSI.dao;
import com.objis.cameroun.proxibanqSI.domaine.Client;
import com.objis.cameroun.proxibanqSI.domaine.Compte;


public interface IDao {


	   /*
	    * Fonction permettant d'authentifier un Utilisateur et de valider son acces ou non dans le systeme
	   * */
	   public int authentifierUtilisateur(String login, String password);
	 
	 
	   /*
	  * Fonction permettant d'effectuer un virement d'un compte vers un autre 
	  * */
	   public int virementCompteACompte(Compte cmp1, Compte cmp2);

	 
	   /*
	   * Fonction permettant d'ajouter un client dans le systeme
	   * */
	   public int AjouterClient(Client cl);
	   
	   /*
	    * Fonction permettant d'effectuer un placement en Bourse
	    * */
	    public int GestionPatrimoine(Compte comp);


}
