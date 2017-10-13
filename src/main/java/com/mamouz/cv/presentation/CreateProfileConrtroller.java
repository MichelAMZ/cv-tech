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

import com.mamouz.cv.entity.Profile;
import com.mamouz.cv.entity.TitreCV;
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
	

	/*
	 * Affichel permet d'afficher le formulaire.
	 */
	@RequestMapping(value = "/createProfile")
	public String createProfile(Locale locale, Model model) {

		logger.info("\033[43m--------------IN Home ProfileController ----------------\033[0m\n");
		model.addAttribute("titreCV", new TitreCV());
		model.addAttribute("profile", new Profile());
		
		logger.info("\033[43m--------------OUT Home ProfileController ----------------\033[0m\n");
		
		return "createProfile";
	}

	
	/*
	 * Class create Profile
	 */
	@RequestMapping(value = "/saveProfile")
	public String createProfile(Profile p, Model model, TitreCV t) {

		logger.info("\033[43m--------------IN Create ProfileController ----------------\033[0m\n");
		
		p.getTitre_cv().add(t);
		
		profileService.create(p);

		logger.debug("\033[42Le Profile à créer  : " + p + "\n-\033[0m");
			
		// Affichage de l'identité du profile
		model.addAttribute("profile", new Profile());

		// Affichage d'identité des profiles
		model.addAttribute("profile", profileService.findById(p.getIdProfile()));

		logger.info("\033[43m--------------OUT Create ProfileController ----------------\033[0m\n");

		return "profile";
	}

}
