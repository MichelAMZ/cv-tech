/**
 * 
 */
package com.mamouz.cv.entity;

import java.io.Serializable;
import java.sql.Date;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Transient;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author mikak
 *
 */
@Entity
public class Profile implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	// ----------- PROPRIETES ---------------------//

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idProfile;

	private String civilite;

	private String nom;

	private String prenom;

	private Date dateNaiss;

	@Transient
	private int age; // Age calculer à partir de l'année de naissance.

	private String reseauSociaux;

	// DATE CREATION ET MISE A JOUR
	 private Date dateCreate;

	 private Date dateUpdate;

	// ADRESSE

	private String numeroRue;

	private String nomRue;

	private String autre;

	private int CodePostale;

	private String ville;

	private String pays;

	private int telephone;

	private String Email;
	

	@ManyToMany (cascade = CascadeType.ALL)
	@JoinTable(name="PROFILE_TITRE_CV",
	joinColumns = {@JoinColumn(name="idProfile")},
	inverseJoinColumns = {@JoinColumn(name="idTitreCV")} )
	private Set<TitreCV> titre_cv = new HashSet<TitreCV>(0);

	// ----------- CONSTRUCTEURS -----------------//

	/**
	 * 
	 */
	public Profile() {
	}


	public Profile(String civilite, String nom, String prenom, Date dateNaiss, int age, String reseauSociaux,
			Date dateCreate, Date dateUpdate, String numeroRue, String nomRue, String autre, int codePostale,
			String ville, String pays, int telephone, String email, Set<TitreCV> titre_cv) {
		super();
		this.civilite = civilite;
		this.nom = nom;
		this.prenom = prenom;
		this.dateNaiss = dateNaiss;
		this.age = age;
		this.reseauSociaux = reseauSociaux;
		this.dateCreate = dateCreate;
		this.dateUpdate = dateUpdate;
		this.numeroRue = numeroRue;
		this.nomRue = nomRue;
		this.autre = autre;
		CodePostale = codePostale;
		this.ville = ville;
		this.pays = pays;
		this.telephone = telephone;
		Email = email;
		this.titre_cv = titre_cv;
	}


	/**
	 * @return the idProfile
	 */
	public long getIdProfile() {
		return idProfile;
	}

	/**
	 * @param idProfile the idProfile to set
	 */
	public void setIdProfile(long idProfile) {
		this.idProfile = idProfile;
	}

	/**
	 * @return the civilite
	 */
	public String getCivilite() {
		return civilite;
	}

	/**
	 * @param civilite the civilite to set
	 */
	public void setCivilite(String civilite) {
		this.civilite = civilite;
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
	 * @return the numeroRue
	 */
	public String getNumeroRue() {
		return numeroRue;
	}

	/**
	 * @param numeroRue the numeroRue to set
	 */
	public void setNumeroRue(String numeroRue) {
		this.numeroRue = numeroRue;
	}

	/**
	 * @return the dateNaiss
	 */
	public Date getDateNaiss() {
		return dateNaiss;
	}

	/**
	 * @param dateNaiss the dateNaiss to set
	 */
	public void setDateNaiss(Date dateNaiss) {
		this.dateNaiss = dateNaiss;
	}

	/**
	 * @return the nomRue
	 */
	public String getNomRue() {
		return nomRue;
	}

	/**
	 * @param nomRue the nomRue to set
	 */
	public void setNomRue(String nomRue) {
		this.nomRue = nomRue;
	}

	/**
	 * @return the reseauSociaux
	 */
	public String getReseauSociaux() {
		return reseauSociaux;
	}

	/**
	 * @param reseauSociaux the reseauSociaux to set
	 */
	public void setReseauSociaux(String reseauSociaux) {
		this.reseauSociaux = reseauSociaux;
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

	/**
	 * @return the telephone
	 */
	public int getTelephone() {
		return telephone;
	}

	/**
	 * @param telephone the telephone to set
	 */
	public void setTelephone(int telephone) {
		this.telephone = telephone;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return Email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		Email = email;
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
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}

	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @return the dateCreate
	 */
	public Date getDateCreate() {
		return dateCreate;
	}

	/**
	 * @param dateCreate the dateCreate to set
	 */
	public void setDateCreate(Date dateCreate) {
		this.dateCreate = dateCreate;
	}


	/**
	 * @return the dateUpdate
	 */
	public Date getDateUpdate() {
		return dateUpdate;
	}


	/**
	 * @param dateUpdate the dateUpdate to set
	 */
	public void setDateUpdate(Date dateUpdate) {
		this.dateUpdate = dateUpdate;
	}

	/**
	 * @return the titre_cv
	 */
	public Set<TitreCV> getTitre_cv() {
		return titre_cv;
	}

	/**
	 * @param titre_cv the titre_cv to set
	 */
	public void setTitre_cv(Set<TitreCV> titre_cv) {
		this.titre_cv = titre_cv;
	}


}
