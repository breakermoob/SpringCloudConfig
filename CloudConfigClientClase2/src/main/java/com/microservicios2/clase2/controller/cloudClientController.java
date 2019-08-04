package com.microservicios2.clase2.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class cloudClientController {

	@Value("${config-client}")
	String profileActive;
	
	@GetMapping("/")
	public String getConfiguracion()
	{
		return profileActive;
	}
}
