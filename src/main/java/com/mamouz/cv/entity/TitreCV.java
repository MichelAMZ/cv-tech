/**
 * 
 */
package com.mamouz.cv.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author mikak
 *
 */
@Entity
@Table(name="T_TITRE_CV")
public class TitreCV {
	
	// ----------------- PROPRIETES ---------------------//
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idTitreCV;
	
	private String titre;

	private String typePoste;
	
//	@ManyToMany (cascade = CascadeType.ALL)
//	@JoinTable(name="T_PROFILE",
//	joinColumns = {@JoinColumn(name="idProfile")},
//	inverseJoinColumns = {@JoinColumn(name="idTitreCV")} )
//	private Set<Profile> profile = new HashSet<Profile>(0);
	
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
	public int getIdTitreCV() {
		return idTitreCV;
	}

	/**
	 * @param idTitreCV the idTitreCV to set
	 */
	public void setIdTitreCV(int idTitreCV) {
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
