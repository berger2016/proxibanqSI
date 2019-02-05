package com.objis.cameroun.proxibanqSI.domaine;

/**
 * @author Banga Erick
 * @since 23/09/2018
 * @see Description: Cette classe permet de factoriser les proprietes et methodes communes aux classes 'Apprenant' et 'Enseignant'
 * @version 1.0 
 */
public class EcrituresComptable {

	private int idEcritureComptable;
	private double soldeDebit;
	private double soldeCredit;
	private String typeOperation;
		
	
	/**
	 * @param idEcritureComptable
	 * @param soldeDebit
	 * @param soldeCredit
	 * @param typeOperation
	 */
	public EcrituresComptable(int idEcritureComptable, double soldeDebit, double soldeCredit, String typeOperation) {
		super();
		this.idEcritureComptable = idEcritureComptable;
		this.soldeDebit = soldeDebit;
		this.soldeCredit = soldeCredit;
		this.typeOperation = typeOperation;
	}

	/**
	 * @param soldeDebit
	 * @param soldeCredit
	 * @param typeOperation
	 */
	public EcrituresComptable(double soldeDebit, double soldeCredit, String typeOperation) {
		super();
		this.soldeDebit = soldeDebit;
		this.soldeCredit = soldeCredit;
		this.typeOperation = typeOperation;
	}

	public EcrituresComptable() {
		super();
	}

	/**
	 * @return the idEcritureComptable
	 */
	public int getIdEcritureComptable() {
		return idEcritureComptable;
	}

	/**
	 * @param idEcritureComptable the idEcritureComptable to set
	 */
	public void setIdEcritureComptable(int idEcritureComptable) {
		this.idEcritureComptable = idEcritureComptable;
	}

	/**
	 * @return the soldeDebit
	 */
	public double getSoldeDebit() {
		return soldeDebit;
	}

	/**
	 * @param soldeDebit the soldeDebit to set
	 */
	public void setSoldeDebit(double soldeDebit) {
		this.soldeDebit = soldeDebit;
	}

	/**
	 * @return the soldeCredit
	 */
	public double getSoldeCredit() {
		return soldeCredit;
	}

	/**
	 * @param soldeCredit the soldeCredit to set
	 */
	public void setSoldeCredit(double soldeCredit) {
		this.soldeCredit = soldeCredit;
	}

	/**
	 * @return the typeOperation
	 */
	public String getTypeOperation() {
		return typeOperation;
	}

	/**
	 * @param typeOperation the typeOperation to set
	 */
	public void setTypeOperation(String typeOperation) {
		this.typeOperation = typeOperation;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "EcrituresComptable [idEcritureComptable=" + idEcritureComptable + ", soldeDebit=" + soldeDebit
				+ ", soldeCredit=" + soldeCredit + ", typeOperation=" + typeOperation + "]";
	}
	
}
