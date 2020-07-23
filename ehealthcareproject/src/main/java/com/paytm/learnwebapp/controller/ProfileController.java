package com.paytm.learnwebapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public String homepage()
	{
		return "Welcome Home!";
	}
}
