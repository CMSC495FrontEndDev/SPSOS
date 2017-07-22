package com.umuc.cmsc495.spsos.service;

import com.umuc.cmsc495.spsos.dm.User;

public interface UserService {

	User createUser(User user);
	
	User updateUser(User user);
	
	User deleteUser(User user);
	
}
