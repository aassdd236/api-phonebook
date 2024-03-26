package com.javaex.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javaex.dao.PhonebookDao;

@Service
public class PhonebookService {
	
	@Autowired
	private PhonebookDao phonebookDao;
}
