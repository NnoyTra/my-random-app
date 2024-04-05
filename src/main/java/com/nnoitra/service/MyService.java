package com.nnoitra.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nnoitra.entities.Person;
import com.nnoitra.repository.MyRepository;

@Service
public class MyService {

	private MyRepository myRepository;
	
	@Autowired
	public MyService(MyRepository myRepository) {
		super();
		this.myRepository = myRepository;
	}

	public Person getPersonById(int id) {
		return myRepository.findPersonById(id);
	}

}
