package com.joaocapucho.springi18n.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	
	@Autowired
	private MessageSource messageSource;

	@GetMapping(path = "/hello-world/{name}")
	public String helloWorld(@PathVariable String name) {
		return messageSource.getMessage("messages.hello.world", null, LocaleContextHolder.getLocale()) + ", " +  name;
	}
}
