package com.javaex.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.javaex.service.PhonebookService;

@Controller
public class PhonebookController {
	
	@Autowired
	private PhonebookService phonebookService;

}
