package com.javaex.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javaex.dao.PhonebookDao;
import com.javaex.vo.PersonVo;

@Service
public class PhonebookService {

	@Autowired
	private PhonebookDao phonebookDao;

	public List<PersonVo> exeList() {
		System.out.println("PhonebookService.exeList()");

		List<PersonVo> personList = phonebookDao.personSelect();

		return personList;
	}

	public int exeWrite(PersonVo personVo) {
		System.out.println("PhonebookService.exeWrite()");

		// 비지니스로직X
		int count = phonebookDao.personInsert(personVo);

		return count;
	}

	public int exeModify(PersonVo personVo) {
		System.out.println("PhonebookService.exeModify()");

		int count = phonebookDao.personUpdate(personVo);

		return count;
	}

	public PersonVo exeModifyForm(int no) {
		System.out.println("PhonebookService.exeModifyForm()");

		PersonVo personVo = phonebookDao.personSelectOne(no);

		return personVo;
	}
}
