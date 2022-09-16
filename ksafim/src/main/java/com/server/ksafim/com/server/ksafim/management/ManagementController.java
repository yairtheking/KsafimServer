package com.server.ksafim.com.server.ksafim.management;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ManagementController {
	
	@RequestMapping(value="/funds/light", method = RequestMethod.GET)
	public String sayHello() {
		return "<h1>Ksafim Harel</h1>";
	}
}
