/**
 * 
 */
package com.mamouz.cv.presentation;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mamouz.cv.entity.Profile;
import com.mamouz.cv.service.interfaces.IProfileService;

/**
 * @author Michel
 *
 */
@Controller
public class myCvController {
	
	private static final Logger logger = LoggerFactory.getLogger(myCvController.class);

	@Resource(name = "profileService")
	private IProfileService profileService;

	@RequestMapping(value = "/myCV")
	public void getCVById(long id, Model model) {
		logger.info("\033[43m--------------IN get by Id ProfileController ----------------\033[0m\n");

		Profile profile = profileService.findById(id);
		
		if (profile != null){
			model.addAttribute("profile", profile);
		}
		
		logger.info("\033[43m--------------OUT get by Id ProfileController ----------------\033[0m\n");

	}
}
