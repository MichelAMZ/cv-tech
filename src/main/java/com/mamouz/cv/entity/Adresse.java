/**
 * 
 */
package com.mamouz.cv.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author mikak
 *
 */
@Entity
public class Adresse implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idAdresse;

	private String numeroNomRue;

	private String autre;

	private int CodePostale;

	private String ville;

	private String pays;
//
//	private int telephone;

//	private String Email;

	/**************************************/
	// CONSTRUCTEURS //
	public Adresse() {
		super();
	}

	/**
 * @param numeroNomRue
 * @param autre
 * @param codePostale
 * @param ville
 * @param pays
 * @param telephone
 */
public Adresse(String numeroNomRue, String autre, int codePostale, String ville, String pays/*, int telephone*/) {
	super();
	this.numeroNomRue = numeroNomRue;
	this.autre = autre;
	CodePostale = codePostale;
	this.ville = ville;
//	this.pays = pays;
//	this.telephone = telephone;
}

/****************************************/
// GETTERS AND SETTERS //

	/**
	 * @return the idAdresse
	 */
	public long getIdAdresse() {
		return idAdresse;
	}

	/**
	 * @param idAdresse the idAdresse to set
	 */
	public void setIdAdresse(long idAdresse) {
		this.idAdresse = idAdresse;
	}

	/**
	 * @return the numeroNomRue
	 */
	public String getNumeroNomRue() {
		return numeroNomRue;
	}

	/**
	 * @param numeroNomRue the numeroNomRue to set
	 */
	public void setNumeroNomRue(String numeroNomRue) {
		this.numeroNomRue = numeroNomRue;
	}

	/**
	 * @return the autre
	 */
	public String getAutre() {
		return autre;
	}

	/**
	 * @param autre the autre to set
	 */
	public void setAutre(String autre) {
		this.autre = autre;
	}

	/**
	 * @return the codePostale
	 */
	public int getCodePostale() {
		return CodePostale;
	}

	/**
	 * @param codePostale the codePostale to set
	 */
	public void setCodePostale(int codePostale) {
		CodePostale = codePostale;
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

	/**
	 * @return the pays
	 */
	public String getPays() {
		return pays;
	}

	/**
	 * @param pays the pays to set
	 */
	public void setPays(String pays) {
		this.pays = pays;
	}

//	public void getIdAdresse(long id) {
//		idAdresse = 1;
//	}

//	/**
//	 * @return the telephone
//	 */
//	public int getTelephone() {
//		return telephone;
//	}
//
//	/**
//	 * @param telephone the telephone to set
//	 */
//	public void setTelephone(int telephone) {
//		this.telephone = telephone;
//	}
	
}
