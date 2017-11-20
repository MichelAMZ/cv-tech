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
public class TitreCVController {

	private static final Logger logger = LoggerFactory.getLogger(ProfilesController.class);

	@Resource(name = "titreCVService")
	private ITitreService titreService;

	@Resource(name = "profileService")
	private IProfileService profileService;

	/*
	 * HOME Profile liste et edit....
	 */
	@RequestMapping(value = "/titreCV")
	public String getTitreCV(Locale locale, Model model, long id) {

		logger.info("\033[43m--------------IN Home TitreCVController ----------------\033[0m\n");

		TitreCV titreCV = titreService.findById(id);

		model.addAttribute("titreCV", titreCV);
		
		logger.info("\033[43m--------------OUT Home TitreCVController ----------------\033[0m\n");
		return "titreCV";
	}

	@RequestMapping(value = "/saveTitreCV")
	public String createTitreCV(TitreCV t, Model model) {

		logger.info("\033[43m--------------IN Create TitreCVCV Controller ----------------\033[0m\n");

		titreService.create(t);

		Profile profile = profileService.findById(t.getIdTitreCV());

		model.addAttribute("profile", profile);
		
		logger.info("\033[43m--------------OUT Create TitreCVCV Controller ----------------\033[0m\n");

		return "profile";
	}

	@RequestMapping(value = "/deleteTitreCV")
	public String deleteTitreCV(int id, Model model) {
		logger.info("\033[43m--------------IN delete TitreCVCV Controller ----------------\033[0m\n");

		titreService.remove(id);
		model.addAttribute("titreCV", new TitreCV());
		model.addAttribute("listeTitreCV", titreService.findAll());
		logger.info("\033[43m--------------OUT delete TitreCVCV Controller ----------------\033[0m\n");
		return "profiles";
	}

	@RequestMapping(value = "/editTitreCV")
	public String editTitreCV(int id, Model model) {
		logger.info("\033[43m--------------IN edit TitreCV Controller ----------------\033[0m\n");

		// On injecte l'id
		TitreCV t = titreService.findById(id);

		titreService.update(t);

		model.addAttribute("titreCV", t);

		logger.info("\033[43m--------------OUT edit TitreCV Controller ----------------\033[0m\n");
		return "profiles";
	}

}
