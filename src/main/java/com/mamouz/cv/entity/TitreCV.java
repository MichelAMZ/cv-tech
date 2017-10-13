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
public class TitreCV implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	// ----------------- PROPRIETES ---------------------//
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idTitreCV;
	
	private String titre;

	private String typePoste;
	
	//------- CONSTRUCTEURS ------------------------//
	
	/**
	 * 
	 */
	public TitreCV() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param titreCV
	 * @param typePoste
	 */
	public TitreCV(String titre, String typePoste) {
		super();
		this.titre = titre;
		this.typePoste = typePoste;
	}

	/**
	 * @return the idTitreCV
	 */
	public long getIdTitreCV() {
		return idTitreCV;
	}

	/**
	 * @param idTitreCV the idTitreCV to set
	 */
	public void setIdTitreCV(long idTitreCV) {
		this.idTitreCV = idTitreCV;
	}

	/**
	 * @return the titreCV
	 */
	public String getTitre() {
		return titre;
	}

	/**
	 * @param titreCV the titreCV to set
	 */
	public void setTitre(String titre) {
		this.titre = titre;
	}

	/**
	 * @return the typePoste
	 */
	public String getTypePoste() {
		return typePoste;
	}

	/**
	 * @param typePoste the typePoste to set
	 */
	public void setTypePoste(String typePoste) {
		this.typePoste = typePoste;
	}

	// ------------------- GETTETERS AND SETTERS----------------------------------//
}
