/**
 * 
 */
package com.mamouz.cv.entity;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 * @author mikak
 *
 */
@Entity
public class Experiences implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idExperience;
	
	private Date dateDebut;
	
	private Date dateFin;
	
	private String posteOccupe;
	
	private String nomEntreprise;
	
	private String lieu;
	
	private String technologie;
	
	private String EnvirTech;
	
	private String methodes;
	
	private String plusDetails;
	
	/**
	 * 
	 */
	public Experiences() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param dateDebut
	 * @param dateFin
	 * @param posteOccupe
	 * @param nomEntreprise
	 * @param lieu
	 * @param technologie
	 * @param envirTech
	 * @param methodes
	 * @param plusDetails
	 */
	public Experiences(Date dateDebut, Date dateFin, String posteOccupe, String nomEntreprise, String lieu,
			String technologie, String envirTech, String methodes, String plusDetails) {
		super();
		this.dateDebut = dateDebut;
		this.dateFin = dateFin;
		this.posteOccupe = posteOccupe;
		this.nomEntreprise = nomEntreprise;
		this.lieu = lieu;
		this.technologie = technologie;
		EnvirTech = envirTech;
		this.methodes = methodes;
		this.plusDetails = plusDetails;
	}
	/**
	 * @return the idExperience
	 */
	public long getIdExperience() {
		return idExperience;
	}
	/**
	 * @param idExperience the idExperience to set
	 */
	public void setIdExperience(long idExperience) {
		this.idExperience = idExperience;
	}
	/**
	 * @return the dateDebut
	 */
	public Date getDateDebut() {
		return dateDebut;
	}
	/**
	 * @param dateDebut the dateDebut to set
	 */
	public void setDateDebut(Date dateDebut) {
		this.dateDebut = dateDebut;
	}
	/**
	 * @return the dateFin
	 */
	public Date getDateFin() {
		return dateFin;
	}
	/**
	 * @param dateFin the dateFin to set
	 */
	public void setDateFin(Date dateFin) {
		this.dateFin = dateFin;
	}
	/**
	 * @return the posteOccupe
	 */
	public String getPosteOccupe() {
		return posteOccupe;
	}
	/**
	 * @param posteOccupe the posteOccupe to set
	 */
	public void setPosteOccupe(String posteOccupe) {
		this.posteOccupe = posteOccupe;
	}
	/**
	 * @return the nomEntreprise
	 */
	public String getNomEntreprise() {
		return nomEntreprise;
	}
	/**
	 * @param nomEntreprise the nomEntreprise to set
	 */
	public void setNomEntreprise(String nomEntreprise) {
		this.nomEntreprise = nomEntreprise;
	}
	/**
	 * @return the lieu
	 */
	public String getLieu() {
		return lieu;
	}
	/**
	 * @param lieu the lieu to set
	 */
	public void setLieu(String lieu) {
		this.lieu = lieu;
	}
	/**
	 * @return the technologie
	 */
	public String getTechnologie() {
		return technologie;
	}
	/**
	 * @param technologie the technologie to set
	 */
	public void setTechnologie(String technologie) {
		this.technologie = technologie;
	}
	/**
	 * @return the envirTech
	 */
	public String getEnvirTech() {
		return EnvirTech;
	}
	/**
	 * @param envirTech the envirTech to set
	 */
	public void setEnvirTech(String envirTech) {
		EnvirTech = envirTech;
	}
	/**
	 * @return the methodes
	 */
	public String getMethodes() {
		return methodes;
	}
	/**
	 * @param methodes the methodes to set
	 */
	public void setMethodes(String methodes) {
		this.methodes = methodes;
	}
	/**
	 * @return the plusDetails
	 */
	public String getPlusDetails() {
		return plusDetails;
	}
	/**
	 * @param plusDetails the plusDetails to set
	 */
	public void setPlusDetails(String plusDetails) {
		this.plusDetails = plusDetails;
	}

}
