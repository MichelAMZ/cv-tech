/**
 * 
 */
package com.mamouz.cv.entity;

import java.io.Serializable;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Transient;

import org.springframework.context.annotation.Lazy;
import org.springframework.web.context.annotation.SessionScope;

/**
 * @author mikak
 *
 */
@Entity
@SessionScope
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
	
	private String email;

	private int telephone;
	
	private String passwd;
	
	private Timestamp last_used = new Timestamp(System.currentTimeMillis());
	
	private Login login;
	

	@Transient
	private int age; // Age calculer à partir de l'année de naissance.

	private String reseauSociaux;

	// DATE CREATION ET MISE A JOUR
	private Timestamp dateCreate = new Timestamp(System.currentTimeMillis());

	private Timestamp dateUpdate = new Timestamp(System.currentTimeMillis());

	@ManyToMany(cascade = CascadeType.ALL, fetch=FetchType.EAGER)
	@Lazy(false)
	@JoinTable(name = "PROFILE_TITRE_CV", joinColumns = { @JoinColumn(name = "idProfile") }, inverseJoinColumns = {
			@JoinColumn(name = "idTitreCV") })
	private Set<TitreCV> titre_cv = new HashSet<TitreCV>(0);

	@OneToMany(cascade = CascadeType.ALL, fetch=FetchType.EAGER)
	@Lazy(false)
	@JoinTable(name = "PROFILE_ADRESEE", joinColumns = { @JoinColumn(name = "idProfile") }, inverseJoinColumns = {
			@JoinColumn(name = "idAdresse") })
	private Set<Adresse> adresse = new HashSet<Adresse>(0);
	
	@OneToMany(cascade = CascadeType.ALL, fetch=FetchType.EAGER)
	@JoinTable(name = "profile_experiences", 
	           joinColumns = @JoinColumn(name = "idProfile"))
	private Set<Experiences> experiences = new HashSet<Experiences>(0);
	
	/**
	 * 
	 */
	public Profile() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param civilite
	 * @param nom
	 * @param prenom
	 * @param dateNaiss
	 * @param email
	 * @param telephone
	 * @param passwd
	 * @param last_used
	 * @param login
	 * @param age
	 * @param reseauSociaux
	 * @param dateCreate
	 * @param dateUpdate
	 * @param titre_cv
	 * @param adresse
	 * @param experiences
	 */
	public Profile(String civilite, String nom, String prenom, Date dateNaiss, String email, int telephone,
			String passwd, Timestamp last_used, Login login, int age, String reseauSociaux, Timestamp dateCreate,
			Timestamp dateUpdate, Set<TitreCV> titre_cv, Set<Adresse> adresse, Set<Experiences> experiences) {
		super();
		this.civilite = civilite;
		this.nom = nom;
		this.prenom = prenom;
		this.dateNaiss = dateNaiss;
		this.email = email;
		this.telephone = telephone;
		this.passwd = passwd;
		this.last_used = last_used;
		this.login = login;
		this.age = age;
		this.reseauSociaux = reseauSociaux;
		this.dateCreate = dateCreate;
		this.dateUpdate = dateUpdate;
		this.titre_cv = titre_cv;
		this.adresse = adresse;
		this.experiences = experiences;
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
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
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
	 * @return the passwd
	 */
	public String getPasswd() {
		return passwd;
	}

	/**
	 * @param passwd the passwd to set
	 */
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}

	/**
	 * @return the last_used
	 */
	public Timestamp getLast_used() {
		return last_used;
	}

	/**
	 * @param last_used the last_used to set
	 */
	public void setLast_used(Timestamp last_used) {
		this.last_used = last_used;
	}

	/**
	 * @return the login
	 */
	public Login getLogin() {
		return login;
	}

	/**
	 * @param login the login to set
	 */
	public void setLogin(Login login) {
		this.login = login;
	}

	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
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
	 * @return the dateCreate
	 */
	public Timestamp getDateCreate() {
		return dateCreate;
	}

	/**
	 * @param dateCreate the dateCreate to set
	 */
	public void setDateCreate(Timestamp dateCreate) {
		this.dateCreate = dateCreate;
	}

	/**
	 * @return the dateUpdate
	 */
	public Timestamp getDateUpdate() {
		return dateUpdate;
	}

	/**
	 * @param dateUpdate the dateUpdate to set
	 */
	public void setDateUpdate(Timestamp dateUpdate) {
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

	/**
	 * @return the adresse
	 */
	public Set<Adresse> getAdresse() {
		return adresse;
	}

	/**
	 * @param adresse the adresse to set
	 */
	public void setAdresse(Set<Adresse> adresse) {
		this.adresse = adresse;
	}

	/**
	 * @return the experiences
	 */
	public Set<Experiences> getExperiences() {
		return experiences;
	}

	/**
	 * @param experiences the experiences to set
	 */
	public void setExperiences(Set<Experiences> experiences) {
		this.experiences = experiences;
	}

}