/**
 * 
 */
package com.mamouz.cv.entity;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 * @author mikak
 *
 */
@Entity
@Table(name = "T_PROFILE")
public class Profile {

	// ----------- PROPRIETES ---------------------//
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idProfile;

	private String civilite;

	private String nom;

	private String prenom;

	private Date dateNaiss;

	@Transient
	private int age; // Age calculer à partir de l'année de naissance.

	private String reseauSociaux;

	// DATE CREATION ET MISE A JOUR

//	 private LocalDate dateCreate;
//	
//	 private LocalDate dateUpdate;

	// ADRESSE

	private int numeroRue;

	private String nomRue;

	private String autre;

	private int CodePostale;

	private String ville;

	private String pays;

	private int telephone;

	private String Email;
	
//	@OneToOne(cascade = CascadeType.ALL)
//	@JoinTable(name="T_PROFILE_TITRECV")
//	private TitreCV titreCV;
	
//	@ManyToMany (cascade = CascadeType.ALL)
//	@JoinTable(name="T_TITRE_CV",
//	joinColumns = {@JoinColumn(name="idProfile")},
//	inverseJoinColumns = {@JoinColumn(name="idTitreCV")} )
//	private Set<TitreCV> titre_cv = new HashSet<TitreCV>(0);

	// ----------- CONSTRUCTEURS -----------------//

	/**
	 * 
	 */
	public Profile() {
	}

	


	public Profile(String civilite, String nom, String prenom, Date dateNaiss, int age, String reseauSociaux, int numeroRue,
		String nomRue, String autre, int codePostale, String ville, String pays, int telephone, String email,
		TitreCV titreCV) {
	super();
	this.civilite = civilite;
	this.nom = nom;
	this.prenom = prenom;
	this.dateNaiss = dateNaiss;
	this.age = age;
	this.reseauSociaux = reseauSociaux;
	this.numeroRue = numeroRue;
	this.nomRue = nomRue;
	this.autre = autre;
	CodePostale = codePostale;
	this.ville = ville;
	this.pays = pays;
	this.telephone = telephone;
	Email = email;
}


	// ------------ GETTERS AND SETTERS --------------------//

	
	
	/**
	 * @param idProfile
	 *            the idProfile to set
	 */
	public void setIdProfile(int idProfile) {
		this.idProfile = idProfile;
	}

	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}
	
	/**
	 * @return the idProfile
	 */
	public int getIdProfile() {
		return idProfile;
	}

	/**
	 * @param nom
	 *            the nom to set
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
	 * @param prenom
	 *            the prenom to set
	 */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	/**
	 * @param age
	 *            the age to set
	 */
	public void setAge(int age) {

	}

	/**
	 * @return the civilite
	 */
	public String getCivilite() {
		return civilite;
	}

	/**
	 * @param civilite
	 *            the civilite to set
	 */
	public void setCivilite(String civilite) {
		this.civilite = civilite;
	}

	/**
	 * @return the dateNaiss
	 */
	public Date getDateNaiss() {
		return dateNaiss;
	}

	/**
	 * @param dateNaiss
	 *            the dateNaiss to set
	 */
	public void setDateNaiss(Date dateNaiss) {
		this.dateNaiss = dateNaiss;
	}

	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @return the reseauSociaux
	 */
	public String getReseauSociaux() {
		return reseauSociaux;
	}

	/**
	 * @param reseauSociaux
	 *            the reseauSociaux to set
	 */
	public void setReseauSociaux(String reseauSociaux) {
		this.reseauSociaux = reseauSociaux;
	}

	/**
	 * @return the numeroRue
	 */
	public int getNumeroRue() {
		return numeroRue;
	}

	/**
	 * @param numeroRue
	 *            the numeroRue to set
	 */
	public void setNumeroRue(int numeroRue) {
		this.numeroRue = numeroRue;
	}

	/**
	 * @return the nomRue
	 */
	public String getNomRue() {
		return nomRue;
	}

	/**
	 * @param nomRue
	 *            the nomRue to set
	 */
	public void setNomRue(String nomRue) {
		this.nomRue = nomRue;
	}

	/**
	 * @return the autre
	 */
	public String getAutre() {
		return autre;
	}

	/**
	 * @param autre
	 *            the autre to set
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
	 * @param codePostale
	 *            the codePostale to set
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
	 * @param ville
	 *            the ville to set
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
	 * @param pays
	 *            the pays to set
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
	 * @param telephone
	 *            the telephone to set
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
	 * @param email
	 *            the email to set
	 */
	public void setEmail(String email) {
		Email = email;
	}
	
}
