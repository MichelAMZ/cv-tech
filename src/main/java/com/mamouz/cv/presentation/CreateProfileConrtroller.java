/**
 * 
 */
package com.mamouz.cv.presentation;

import java.util.Locale;
import java.util.Set;

import javax.annotation.Resource;
import javax.annotation.Resources;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mamouz.cv.entity.Adresse;
import com.mamouz.cv.entity.Login;
import com.mamouz.cv.entity.Profile;
import com.mamouz.cv.entity.TitreCV;
import com.mamouz.cv.service.interfaces.ILoginService;
import com.mamouz.cv.service.interfaces.IProfileService;
import com.mamouz.cv.service.interfaces.ITitreService;

/**
 * @author mikak
 *
 */
@Controller
public class CreateProfileConrtroller {

	private static final Logger logger = LoggerFactory.getLogger(ProfilesController.class);

	@Resource(name = "profileService")
	private IProfileService profileService;

	@Resource(name = "titreCVService")
	private ITitreService titreService;
	
	@Resource(name = "loginService")
	private ILoginService loginService;
	

	/*
	 * Affichel permet d'afficher le formulaire.
	 */
	@RequestMapping(value = "/createProfile")
	public String createProfile(Locale locale, Model model) {

		logger.info("\033[43m--------------IN Home ProfileController ----------------\033[0m\n");
		model.addAttribute("titreCV", new TitreCV());
		model.addAttribute("adresse", new Adresse());
		model.addAttribute("profile", new Profile());
		
		Profile profile2 = new Profile();
		Set<Adresse> adresses = profile2.getAdresse();
		
		model.addAttribute("adresses", adresses);
				
		logger.info("\033[43m--------------OUT Home ProfileController ----------------\033[0m\n");
		
		return "createProfile";
	}
	
	/*
	 * Class create Profile
	 */
	@RequestMapping(value = "/saveProfile")
	public String createProfile(Profile p, TitreCV t, Adresse ad, Model model) {
		
		try {

			logger.info("\033[43m--------------IN Create ProfileController ----------------\033[0m\n");
				// Récupération de la liste d'adresse et du titre.		
			p.getAdresse().add(ad);
			p.getTitre_cv().add(t);
			
			//Récupération du mail et password pour l'injecter dans le bean Login.
			
			Login login = new Login(p.getEmail(), p.getPasswd());
			p.getEmail();
			p.getPasswd();
			
			loginService.create(login);
			
			profileService.create(p);
			

			logger.debug("\033[42Le Profile à créer  : " + p + "\n-\033[0m");
		
			// Affichage d'identité des profiles
			model.addAttribute("profile", profileService.findById(p.getIdProfile()));

			logger.info("\033[43m--------------OUT Create ProfileController ----------------\033[0m\n");
		} catch (Exception e) {
			logger.debug("Error : \n" + e);
		}

		return "profile";
	}

}
