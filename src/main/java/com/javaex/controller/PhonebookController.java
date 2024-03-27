package com.javaex.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javaex.service.PhonebookService;
import com.javaex.util.JsonResult;
import com.javaex.vo.PersonVo;

@RestController
public class PhonebookController {
	
	@Autowired
	private PhonebookService phonebookService;

	//리스트 띄우기
	@GetMapping("/api/list")
	public JsonResult list() {
		System.out.println("PhonebookController.list()");
		
		List<PersonVo> personList=phonebookService.exeList();
		
		return JsonResult.success(personList);
	}
}
