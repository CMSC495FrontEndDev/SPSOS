package com.umuc.cmsc495.spsos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.umuc.cmsc495.spsos.model.Sandwich;
import com.umuc.cmsc495.spsos.service.SandwichServiceInterface;

@RestController
@RequestMapping("/sandwich")
public class SandwichController {
	
	@Autowired
	private SandwichServiceInterface sandwichService;

	@RequestMapping(method = RequestMethod.PUT)
	private void updateSandwich(Sandwich sandwich) {
		sandwichService.updateSandwich(sandwich);
	}

}
