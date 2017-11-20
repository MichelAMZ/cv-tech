package com.mamouz.cv.presentation;

import java.util.Locale;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mamouz.cv.entity.Login;
import com.mamouz.cv.entity.Profile;
import com.mamouz.cv.service.LoginService;

@Controller
public class LoginController {
	
	@Resource(name = "loginService")
	LoginService userService;
	
	@RequestMapping(value = "/login")
	public String showLogin(Locale locale, Model model ){
		
		model.addAttribute("login", new Login());
		
		return "login";
	}
	
	@RequestMapping(value = "/loginProcess")
	public String loginProcess(Login login, Model model){
		
		Profile profile = new Profile();
		//  valide le user . 
		profile = userService.validateUser(login);
	
		// la validation est ok, on affiche le profile.
		// sinon on retourne sur la page login avec message d'erreur
		if(profile.getNom() != null){

			model.addAttribute("profile", profile);
			model.addAttribute("welcome", "Bonjour ");
			model.addAttribute("deconn", "deconnexion");
			return "profile";					
		}
		else{
			String errMsg = "L'identifiant ou le mot de passe est erroné !"; 
			model.addAttribute("ErrorLogin", errMsg);
			return "login";
		}
	}
	
	@RequestMapping(value = "/loginDeconneted")
	public String deconnexion(Model model){
		
		Login login = new Login();
		login.deconnexion();	
		
		model.addAttribute("login", login);
		
		return "login";
	}
	
}
