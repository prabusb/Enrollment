/**
 * 
 */
package com.troy.software.enrollment.controller;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;


import com.troy.software.enrollment.corebusiness.UserBusiness;
import com.troy.software.enrollment.domain.model.UserDetails;
import com.troy.software.enrollment.persistence.repository.User;
import com.troy.software.enrollment.validator.UserDetailsValidator;


/**
 * @author EX1V9
 *
 */

/**
 * Handles requests for the application home page.
 */
@Controller
@SessionAttributes("userDetails")
public class EnrollmentController {
	
	@Autowired
	User user;
	
	@Autowired
	UserBusiness userBusiness;
	
	@Autowired
	UserDetailsValidator userDetailsValidator;
	
	
	
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Model model) {
		System.out.println("inside home");
		UserDetails userDetails = new UserDetails();
		model.addAttribute("userDetails", userDetails);				
		return "welcome";
	}
	
	/**
	 * Login.
	 */
	@RequestMapping(value = "/", method = RequestMethod.POST)	
	public String login(@ModelAttribute("userDetails") UserDetails userDetails, BindingResult result, SessionStatus status, HttpServletRequest request) {		
		System.out.println("inside login");
		userDetailsValidator.validateLoginDetails(userDetails, result);
		if (!result.hasErrors() && userDetails != null) {
			userDetails.setInvalidUser(false);
			status.setComplete();
			if (!userBusiness.isValidUser(userDetails)) {				
				ObjectError error = new ObjectError("login.username", "Username or Password is not correct");
				result.addError(error);
				userDetails.setInvalidUser(true);
				return "welcome";
			}
		}
		
		return "welcome";
	}
	
	/**
	 * Add a user.
	 */
	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public String addUser(Model model) {
		System.out.println("inside add user");
		UserDetails userDetails = new UserDetails();
		model.addAttribute("userDetails", userDetails);				
		return "registerUser";

	}
	
	/**
	 * Save the new user.
	 */
	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public String addUser(@ModelAttribute("userDetails") UserDetails userDetails, BindingResult result, SessionStatus status, HttpServletRequest request) {
		System.out.println("checking");
		if (request.getParameter("_cancel") != null) {
			return "redirect:/";
		}
		System.out.println("checking 1" + userDetails.getUsername());
		userDetailsValidator.validateRegisterUser(userDetails, result);
		if (result.hasErrors()) {
			return	"registerUser";
		}
		if (userDetails != null) {
			status.setComplete();
			userBusiness.registerUser(userDetails);
		}
		System.out.println("checking 2" + userDetails);
		return "welcome";
	}
	
	/**
	 * Edit a user.
	 */
	@RequestMapping(value = "/userDetailsEdit/{rollNumber}", method = RequestMethod.GET)
	public String editUser(@PathVariable("rollNumber") String rollNumber, Model model) {
		
		UserDetails userDetails = userBusiness.getUserDetails(rollNumber);
		model.addAttribute("userDetails", userDetails );

		return "editUser";
	}
	
	/**
	 * Edit a user.
	 */
	@RequestMapping(value = "/userDetailsEdit/{rollNumber}", method = RequestMethod.POST)
	public String editBook(@ModelAttribute("userDetails") UserDetails userDetails, BindingResult result, SessionStatus status, HttpServletRequest request) {
		System.out.println("checking");
		if (request.getParameter("_cancel") != null) {
			return "welcome";
		}
		return "welcome";
	}


}
