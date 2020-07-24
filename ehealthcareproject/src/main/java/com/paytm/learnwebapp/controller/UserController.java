package com.paytm.learnwebapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.paytm.learnwebapp.model.TrialUser;
import com.paytm.learnwebapp.service.UserService;

@RestController
public class UserController {

	@Autowired
	private UserService userService;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	@ResponseBody
	public String homepage()
	{
		return "<br><br><center><h2>Welcome Home!</h3></center>";
	}
	
	@RequestMapping(value = "/usertrial", method = RequestMethod.GET)
	@ResponseBody
	public List<TrialUser> getAll()
	{
		return userService.printAll();	
		//return "<br><br><center><h3>Welcome here..!</h3></center>";
	}
	
	@RequestMapping(value = "/usertrial/{id}")
	public TrialUser getById(@PathVariable String id)
	{
		TrialUser t = userService.getUser(id);
		return t;
	}
	
	@RequestMapping(value = "/usertrial/add", method = RequestMethod.POST)
	public String add(@RequestBody TrialUser userTest)
	{
		return userService.addUser(userTest);
	}
	
	@RequestMapping(value = "/usertrial/update/{id}", method = RequestMethod.PUT)
	public String update(@RequestBody TrialUser userTest, @PathVariable String id)
	{
		return userService.updateById(id, userTest);
	}
	
	@RequestMapping(value = "/usertrial/delete/{id}", method = RequestMethod.DELETE)
	public String deleteUser(@PathVariable String id)
	{
		return userService.deleteById(id);
	}
	
}
