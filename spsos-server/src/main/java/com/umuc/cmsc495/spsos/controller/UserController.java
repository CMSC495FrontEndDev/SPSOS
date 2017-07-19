package com.umuc.cmsc495.spsos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.umuc.cmsc495.spsos.model.User;
import com.umuc.cmsc495.spsos.service.UserServiceInterface;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserServiceInterface userService;

	@RequestMapping(method = RequestMethod.POST)
	private void createUser(User user) {
		userService.createUser(user);
	}

	@RequestMapping(method = RequestMethod.PUT)
	private void updateUser(User user) {
		userService.updateUser(user);
	}

	@RequestMapping(method = RequestMethod.DELETE)
	private void deleteUser(User user) {
		userService.deleteUser(user);
	}

}
