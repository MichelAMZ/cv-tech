package com.mamouz.cv.presentation;

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

@Controller
public class ProfileController {

	private static final Logger logger = LoggerFactory.getLogger(ProfilesController.class);

	@Resource(name = "profileService")
	private IProfileService profileService;

	@Resource(name = "titreCVService")
	private ITitreService titreService;

	@RequestMapping(value = "/profile")
	public void getProfileById(long id, Model model) {
		logger.info("\033[43m--------------IN edit ProfileController ----------------\033[0m\n");

		Profile profile = profileService.findById(id);
		//TitreCV titreCV = titreService.findById(id);
		//profile.getTitre_cv().add(titreCV);
		
		if (profile != null){
			model.addAttribute("profile", profile);
		}

		logger.info("\033[43m--------------OUT edit ProfileController ----------------\033[0m\n");

	}

}
