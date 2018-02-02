package com.idealabs.crelpweb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {
	
	
	@RequestMapping(value = {"/"})
	public String IndexPage() {
		return "index";
	}


	
	
	@RequestMapping(value="/signIn")
	public String signIn() {
		return "signIn";
	}

	
	@RequestMapping(value="/loggingFrame")
	public String loggin() {
		return "loggingFrame";
	}

}
