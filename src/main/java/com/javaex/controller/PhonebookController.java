package com.javaex.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.javaex.service.PhonebookService;
import com.javaex.util.JsonResult;
import com.javaex.vo.PersonVo;

@RestController
public class PhonebookController {

	@Autowired
	private PhonebookService phonebookService;

	// 리스트 띄우기
	@GetMapping("/api/list")
	public JsonResult list() {
		System.out.println("PhonebookController.list()");

		List<PersonVo> personList = phonebookService.exeList();

		return JsonResult.success(personList);
	}
	
	@PostMapping("/api/write")
	public JsonResult write(@RequestBody PersonVo personVo) {
		System.out.println("PhonebookController.write2()");

		System.out.println(personVo.toString());

		phonebookService.exeWrite(personVo);

		return JsonResult.success(personVo);
	}
	
	// 수정
	@PutMapping("/api/modify/{personId}")
	public JsonResult modify(@PathVariable(value="personId") PersonVo personVo) {
		System.out.println("PhonebookController.modify()");
		System.out.println(personVo);

		phonebookService.exeModify(personVo);

		return JsonResult.success(personVo);    
	}

	// 수정폼
	@GetMapping("/api/modifyform")
	public JsonResult modifyForm() {
		System.out.println("PhonebookController.modifyForm()");

		List<PersonVo> personList = phonebookService.exeList();
		System.out.println(personList);
		return JsonResult.success(personList);
	}
	
	
	
	
}
