package io.jasti.kishan.service.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@Value("${service.instance.name}")
	private String instance;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String message() {
		return "Hello from " + instance;
	}

}
