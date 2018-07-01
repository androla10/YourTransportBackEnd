package com.devinspirare.reportpartner.ws.rest;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devinspirare.reportpartner.bean.OrquestadorResponse;

@RestController
public class OrquestadorController {
	
	
	private static final Logger log = LogManager.getLogger(OrquestadorController.class);

	@RequestMapping("/ejecutar")
	private OrquestadorResponse ejecutar() {
		log.info("Mensaje Info");
		OrquestadorResponse element = new OrquestadorResponse();
		element.setNombre("Zeler Benji");
		element.setApellido("Villarreal Marcelo");
		element.setEdad("23");
		return element;
	}
	
	
	
}
