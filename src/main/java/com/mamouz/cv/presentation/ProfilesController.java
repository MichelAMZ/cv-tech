package com.mamouz.cv.presentation;

import java.util.Locale;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mamouz.cv.entity.Profile;
import com.mamouz.cv.service.interfaces.IProfileService;
import com.mamouz.cv.service.interfaces.ITitreService;

@Controller
public class ProfilesController {

	private static final Logger logger = LoggerFactory.getLogger(ProfilesController.class);

	@Resource(name = "profileService")
	private IProfileService profileService;

	@Resource(name = "titreCVService")
	private ITitreService titreService;

	/*
	 * HOME Profile liste et edit....
	 */
	@RequestMapping(value = "/profiles")
	public String profiles(Locale locale, Model model) {

		logger.info("\033[43m--------------IN Home ProfileController ----------------\033[0m\n");

		model.addAttribute("profile", new Profile());

		Object ob = profileService.findAll();

		if (ob != null) {
			model.addAttribute("profiles", profileService.findAll());
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

		profileService.update(p);

		model.addAttribute("profile", p);
		model.addAttribute("profiles", profileService.findAll());
		logger.info("\033[43m--------------OUT edit ProfileController ----------------\033[0m\n");
		return "createProfile";
	}
	
//	@RequestMapping(value = "/profile")
//	public Profile getProfileById(Profile p, Model model){
//		logger.info("\033[43m--------------IN edit ProfileController ----------------\033[0m\n");
//
//		p = profileService.findById(p.getIdProfile());
//
//		model.addAttribute("profile", p);
//		
//		logger.info("\033[43m--------------OUT edit ProfileController ----------------\033[0m\n");
//		
//		return p;
//	}

}
