package com.nnoitra.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nnoitra.entities.Person;
import com.nnoitra.repository.CarRepository;
import com.nnoitra.repository.PersonRepository;

@Service
public class PersonService {

	private PersonRepository myRepository;
	private CarRepository carRepository;
	
	@Autowired
	public PersonService(PersonRepository myRepository, CarRepository carRepository) {
		super();
		this.myRepository = myRepository;
		this.carRepository = carRepository;
	}

	public Person getPersonById(int id) {
		Person personById = myRepository.findPersonById(id);
		personById.setCarList(carRepository.findAllPersonCars(id));
		return personById;
	}

}
