package com.idealab.crelpweb.controllers;

import java.awt.List;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.idealabs.crelpweb.dao.IdeaDao;
import com.idealabs.crelpweb.dao.UserDao;
import com.idealabs.crelpweb.entities.Idea;
import com.idealabs.crelpweb.entities.User;
import com.idealabs.crelpweb.service.impl.UserServiceImpl;

@Controller
public class TestController {
	
	@Autowired
    private UserDao userDao;
	
	@Autowired
    private IdeaDao ideaDao;
	
	@RequestMapping(value = {"/"})
	public String IndexPage() {
		return "signUp";
	}


	
	
	@RequestMapping(value="/signUp")
	public String signUp() {
		return "signUp";
	}

	
	
	@RequestMapping(value="/loggingFrame")
	public String loggingFrame() {
		return "loggingFrame";
	}

	
	@RequestMapping(value="/myCabinet")
	public ModelAndView myCabinet1( @RequestParam String login,
									@RequestParam String password,
									@RequestParam String name,
									@RequestParam String surname,
									@RequestParam String phone,
									@RequestParam String email,
									@RequestParam String country,
									@RequestParam String birth,
									@RequestParam int role,
									HttpSession session
									) {
		
		
		
						User user = new User(login, password, name, surname,phone,email,country,birth,role);
						userDao.save(user);
						
						User user1 = userDao.findByLogin(login);
						
						Map<String, Object> model1 = new HashMap<>();
				        model1.put("user1", user1);
						
	ModelAndView model = new ModelAndView("myCabinet", model1);
session.setAttribute("id", user1.getId());
		
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
	
	

}
