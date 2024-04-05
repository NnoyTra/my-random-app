package com.nnoitra.service;

import java.util.List;

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

	public List<Person> getPersonById(int id) {
		List<Person> all = myRepository.findAll();
//		ArrayList<PersonRest> arrayList = new ArrayList<PersonRest>();
//		for (Person person : all) {
//			PersonRest e = new PersonRest();
//			e.set
//			arrayList.add(e);
//		}
//		
		return all;
	}

}
