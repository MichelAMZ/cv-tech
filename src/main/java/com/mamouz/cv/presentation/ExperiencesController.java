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

import com.mamouz.cv.entity.Experiences;
import com.mamouz.cv.service.interfaces.IExperienceService;

/**
 * @author mikak
 *
 */
@Controller
public class ExperiencesController {

	private static final Logger logger = LoggerFactory.getLogger(ProfilesController.class);

	@Resource(name = "experiencesService")
	private IExperienceService experiencesService;

	@RequestMapping(value = "/experience")
	public String showExperiences(Locale locale, Model model) {
		logger.info("\033[43m--------------IN get by Id ExperiencesController ----------------\033[0m\n");

		model.addAttribute("experiences", new Experiences());

		logger.info("\033[43m--------------OUT get by Id ExperiencesController ----------------\033[0m\n");

		return "experience";
	}

	/*
	 * Class create Profile
	 */
	@RequestMapping(value = "/saveExperience")
	public String createExperiences(Experiences exp, Model model) {

		try {

			logger.info("\033[43m--------------IN Create ProfileController ----------------\033[0m\n");
		
			// Récupération du mail et password pour l'injecter dans le bean
			// Login.
	
			experiencesService.create(exp);

			logger.debug("\033[42Le Experiences à créer  : " + exp + "\n-\033[0m");

			// Affichage d'identité des profiles
			model.addAttribute("experience", experiencesService.findById(exp.getIdExperience()));

			logger.info("\033[43m--------------OUT Create ExperiencesController ----------------\033[0m\n");
		} catch (Exception e) {
			logger.debug("Error : \n" + e);
		}

		return "profile";
	}
}
