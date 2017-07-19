package com.umuc.cmsc495.spsos.service;

import com.umuc.cmsc495.spsos.model.User;

public interface UserServiceInterface {

	User createUser(User user);
	
	User updateUser(User user);
	
	User deleteUser(User user);
	
}
