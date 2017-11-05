/**
 * 
 */
package com.mamouz.cv.presentation;

import java.util.Locale;
import java.util.Set;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mamouz.cv.entity.Adresse;
import com.mamouz.cv.entity.Profile;
import com.mamouz.cv.entity.TitreCV;
import com.mamouz.cv.service.ProfileService;

/**
 * @author mikak
 *
 */
@Controller
public class RegistrationController {
	
	@Resource
	public ProfileService userService;
	
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
	
}
