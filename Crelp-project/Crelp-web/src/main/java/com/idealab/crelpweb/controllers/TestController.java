package com.idealab.crelpweb.controllers;

import java.awt.List;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.hibernate.exception.ConstraintViolationException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.idealabs.crelpweb.dao.IdeaDao;
import com.idealabs.crelpweb.dao.UserDao;
import com.idealabs.crelpweb.entities.Idea;
import com.idealabs.crelpweb.entities.User;
import com.idealabs.crelpweb.service.SecurityService;
import com.idealabs.crelpweb.service.constant.Roles;
import com.idealabs.crelpweb.service.impl.UserServiceImpl;
import com.mysql.jdbc.exceptions.jdbc4.MySQLIntegrityConstraintViolationException;

@Controller
public class TestController {
	
	@Autowired
    private UserDao userDao;
	
	@Autowired
    private IdeaDao ideaDao;
	
	@Autowired
	private SecurityService securityService;
	
	@Autowired
	@Qualifier("mailSender")
	private JavaMailSender mailSender;
	
	@RequestMapping(value = {"/"})
	public String IndexPage() {
		return "index";
	}

	
	@RequestMapping(value = {"/Contacts"})
	public String ContactsPage() {
		return "Contacts";
	}

	
	
	@RequestMapping(value="/signUp")
	public String signUp() {
		return "signUp";
	}

	
	
	@RequestMapping(value="/LogIn")
	public String loggingFrame() {
		return "LogIn";
	}

	
	
	
	
	
	@RequestMapping(value="/myCabinet")
	public ModelAndView LogIn() {
		String url = "redirect:/cabinet";

		
		Integer accountId = securityService.getLoggedAccountId();
						
		Roles role = securityService.getLoggedRole();
		url += "/"+role.toString();
		url+= "/"+accountId;
		
		ModelAndView model = new ModelAndView(url);
		
						
		return model;
	}
	
	@RequestMapping(value="/saveIdea")
	public ModelAndView SaveIdea(@RequestParam String title,
								@RequestParam String idea, HttpSession session) {
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		LocalDate localDate = LocalDate.now();		
		String date;
		date = String.valueOf(dtf.format(localDate));
		
		Idea idea1 = new Idea(title, idea,String.valueOf(session.getAttribute("id")), date);
ideaDao.save(idea1);
		
		Map<String, Object> model1 = new HashMap<>();
        model1.put("idea1", idea1);
        
        
		ModelAndView model = new ModelAndView("myCabinet", model1 );
		
									return model;
		
	}
	
	
	

	@RequestMapping(value = {"/Registration"})
	public ModelAndView Registration(@RequestParam  String login,
								@RequestParam  String password,
								@RequestParam  String name,
								@RequestParam  String surname,
								@RequestParam  String phone,
								@RequestParam  String email,
								@RequestParam  String country,
								@RequestParam  String birth,
								@RequestParam  Integer role,
								@RequestParam  String sex,
								@RequestParam  String other,
						
								HttpSession session) {
		
		
		
		
		
		
try {
	
	DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
	LocalDate localDate = LocalDate.now();		
	String date;
	date = String.valueOf(dtf.format(localDate));
	
	
	
		User user = new User(login, password, toUppCase(name), toUppCase(surname),phone,email,toUppCase(country),birth,role, sex, date, other);
		userDao.save(user);
		
		 ModelAndView model = new ModelAndView("LogIn");
		 
		 SimpleMailMessage message = new SimpleMailMessage(); 
	       message.setTo(email); 
	        message.setSubject("Thank you for registration on Crelp.com"); 
	        message.setText("Greetings, "+name+" Your profile has been successfully created! We are waiting for your great charity activities! ");
	        mailSender.send(message);
		return model;
          }catch(DataIntegrityViolationException e) {
        	  
        	  ModelAndView model1 = new ModelAndView("signUp");
        	  model1.addObject("FailMessage", "User with same data is already exists");
        	  model1.addObject("status", 1);
      		
				return model1;
        	  
	
}
		
		

		
		
		
		
	}

	
	@RequestMapping(value = "/cabinet/user/{id}")
	public ModelAndView cabinet(   @PathVariable Integer id  ){
		
		
		User user = userDao.findById(id).get();
		
		Map<String, Object> model = new HashMap<>();
        model.put("user", user);
        

	 ModelAndView mav = new ModelAndView("UserCabinet", model );
	
	
	return mav;
	
	}
			
			
	
	@RequestMapping(value = "/cabinet/investor/{id}")
	public ModelAndView investor(   @PathVariable Integer id  ){
		
		
		User investor = userDao.findById(id).get();
		
		Map<String, Object> model = new HashMap<>();
        model.put("investor", investor);
        

	 ModelAndView mav = new ModelAndView("InvestorCabinet", model );
	
	
		return mav;
		
	
	}
	
	
	
	
	@RequestMapping(value = {"/access_denided"})
	public ModelAndView accessDenied() {
		
		
		
		
	   	  ModelAndView model1 = new ModelAndView("LogIn");
    	  model1.addObject("FailMessage", "Login or password is incorrect");
    	  model1.addObject("status", 1);
  		
			return model1;
	}
	
	
	
	private String toUppCase(String str) {
		
	return	str.substring(0,1).toUpperCase() + str.substring(1).toLowerCase();
		
		
	}
	
	
	
	
	
	
	
	
	

}
