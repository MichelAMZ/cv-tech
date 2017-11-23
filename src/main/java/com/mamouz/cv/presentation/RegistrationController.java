/**
 * 
 */
package com.mamouz.cv.presentation;

import java.util.Locale;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mamouz.cv.entity.Adresse;
import com.mamouz.cv.entity.Login;
import com.mamouz.cv.entity.Profile;
import com.mamouz.cv.entity.TitreCV;
import com.mamouz.cv.service.ProfileService;
import com.mamouz.cv.service.interfaces.ILoginService;

/**
 * @author mikak
 *
 */
@Controller
public class RegistrationController {

	@Resource(name = "profileService")
	public ProfileService profileService;

	@Resource(name = "loginService")
	private ILoginService loginService;
	
	private static final Logger logger =
			LoggerFactory.getLogger(RegistrationController.class);
	
	/*
	 * Affiche la page de forms
	 */
	@RequestMapping(value = "/register")
	public String registerPage(Locale locale, Model model){
				
		model.addAttribute("profile", new Profile());
		model.addAttribute("adresse", new Adresse());
		model.addAttribute("titreCV", new TitreCV());
		
		return "register";
	}
		
	/*
	 * Class create Profile
	 */
	@RequestMapping(value = "/saveRegistration2")
	public String createRegistration(Profile p, Model model) {
		
		try {

			logger.info("\033[43m--------------IN Create ProfileController ----------------\033[0m\n");
						
			if (profileService.create(p)){
				//Récupération du mail et password pour l'injecter dans le bean Login.
				
				Login login = new Login(p.getEmail(), p.getPasswd());
				
				loginService.create(login);
			
				// Affichage d'identité des profiles
				model.addAttribute("profile", profileService.findById(p.getIdProfile()));
				
				if (!p.getAdresse().isEmpty()) {
					model.addAttribute("nullAdresse", "Modifier l'adresse ");

				} else {
					model.addAttribute("nullAdresse", "Ajouter l'adresse ");
				}
				
				if (p.getTitre_cv().isEmpty()) {
					model.addAttribute("nullTitreCV", "Ajouter un titre au CV ");

				} else {
					model.addAttribute("nullTitreCV", "Modifier le titre du CV ");
				}

			}else{
				model.addAttribute("profile", "nous avons un problème dans la création de votre profile !");
			}
			

			logger.info("\033[43m--------------OUT Create ProfileController ----------------\033[0m\n");
		} catch (Exception e) {
			logger.debug("Error : \n" + e);
		}

		return "profile";
	}
	
	/*
	 * Class create Profile
	 */
	@RequestMapping(value = "/saveRegistration")
	public String createProfile(Profile p, TitreCV t, Adresse ad, Model model) {
		
		try {

			logger.info("\033[43m--------------IN Create ProfileController ----------------\033[0m\n");
				// Récupération de la liste d'adresse et du titre.		
			p.getAdresse().add(ad);
			p.getTitre_cv().add(t);
			
			//Récupération du mail et password pour l'injecter dans le bean Login.
			
			Login login = new Login(p.getEmail(), p.getPasswd());
						
			loginService.create(login);
			
			profileService.create(p);
			

			logger.debug("\033[42Le Profile à créer  : " + p + "\n-\033[0m");
				
			// Affichage de l'identité du profile
			Profile profile = profileService.findById(p.getIdProfile());

			// Affichage d'identité des profiles
			model.addAttribute("profile", profile);
			
			logger.info("\033[43m--------------OUT Create ProfileController ----------------\033[0m\n");
		} catch (Exception e) {
			logger.debug("Error : \n" + e);
		}

		return "profile";
	}
	
}
