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
import com.mamouz.cv.service.interfaces.IAdresseservice;

/**
 * @author mikak
 *
 */
@Controller
public class AdresseController {

	private static final Logger logger = LoggerFactory.getLogger(ProfilesController.class);

	@Resource(name = "adresseService")
	private IAdresseservice adresseService;
	Adresse ad;

	/*
	 * HOME Adresse save et edit....
	 */
	@RequestMapping(value = "/adresse" )
	public String getAdresse(Locale locale, Model model) {

		logger.info("\033[43m--------------IN Home AdresseController ----------------\033[0m\n");
	
		//model.addAttribute("address", new Adresse());
		model.addAttribute("address", new Adresse());

		logger.info("\033[43m--------------OUT Home AdresseController ----------------\033[0m\n");
		return "adresse";
	}
	
	@RequestMapping(value = "/saveAdresse")
	public String createAdresse(Adresse ad, Model model) {

		logger.info("\033[43m--------------IN Create Adresse Controller ----------------\033[0m\n");

		adresseService.create(ad);

		logger.debug("\033[42Le Adresse à créer  : " + ad + "\n-\033[0m");

		model.addAttribute("adresse", new Adresse());

		logger.info("\033[43m--------------OUT Create Adresse Controller ----------------\033[0m\n");

		return "profiles";
	}

	@RequestMapping(value = "/deleteAdresse")
	public String deleteAdresse(int id, Model model) {
		logger.info("\033[43m--------------IN delete Adresse Controller ----------------\033[0m\n");

		adresseService.remove(id);
		model.addAttribute("adresse", new Adresse());
		logger.info("\033[43m--------------OUT delete Adresse Controller ----------------\033[0m\n");
		return "profiles";
	}

	@RequestMapping(value = "/editAdresse")
	public String editAdresse(int id, Model model) {
		logger.info("\033[43m--------------IN edit Adresse Controller ----------------\033[0m\n");

		// On injecte l'id
		Adresse ad = adresseService.findById(id);

		adresseService.update(ad);

		model.addAttribute("adresse", ad);
		model.addAttribute("adresses", adresseService.findAll());
		logger.info("\033[43m--------------OUT edit TitreCV Controller ----------------\033[0m\n");
		return "profiles";
	}
}
