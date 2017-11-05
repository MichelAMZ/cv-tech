package com.mamouz.cv.presentation;

import java.util.Locale;
import java.util.Set;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mamouz.cv.entity.Adresse;
import com.mamouz.cv.entity.Profile;
import com.mamouz.cv.entity.TitreCV;
import com.mamouz.cv.service.interfaces.IAdresseservice;
import com.mamouz.cv.service.interfaces.IProfileService;
import com.mamouz.cv.service.interfaces.ITitreService;

@Controller
public class ProfilesController {

	private static final Logger logger = LoggerFactory.getLogger(ProfilesController.class);

	@Resource(name = "profileService")
	private IProfileService profileService;

	@Resource(name = "titreCVService")
	private ITitreService titreService;
	private IAdresseservice adService;

	/*
	 * HOME Profile liste et edit....
	 */
	@RequestMapping(value = "/profiles")
	public String profiles(Locale locale, Model model) {

		logger.info("\033[43m--------------IN Home ProfileController ----------------\033[0m\n");

			Object obj = profileService.findAll();
			
			if(obj != null){
				model.addAttribute("profiles", profileService.findAll());
			}
			else{
				String err =  "Rien à afficher !";
				model.addAttribute("profiles", err);
			}

		logger.info("\033[43m--------------OUT Home ProfileController ----------------\033[0m\n");
		return "profiles";
	}


	@RequestMapping(value = "/deleteProfile")
	public String deleteProfile(int id, Model model) {
		logger.info("\033[43m--------------IN delete ProfileController ----------------\033[0m\n");
		logger.info("control id : " + id);
		profileService.remove(id);
		model.addAttribute("profile", new Profile());
		model.addAttribute("profiles", profileService.findAll());
		logger.info("\033[43m--------------OUT delete ProfileController ----------------\033[0m\n");
		return "profiles";
	}

	@RequestMapping(value = "/editProfile")
	public String editProfile(int id, Model model) {
		logger.info("\033[43m--------------IN edit ProfileController ----------------\033[0m\n");
		Profile p = profileService.findById(id);
		//Set<Adresse> ad = p.getAdresse();
		
		profileService.update(p);
		
		model.addAttribute("profile", p);
		model.addAttribute("titreCV", new TitreCV());
		model.addAttribute("adresse", new Adresse());
		logger.info("\033[43m--------------OUT edit ProfileController ----------------\033[0m\n");
		return "createProfile";
	}
	
}
