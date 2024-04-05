package com.nnoitra.controller;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.databind.node.ObjectNode;
import com.nnoitra.entities.Person;
import com.nnoitra.service.MyService;

@RestController
@RequestMapping("/my")
public class MyController {

	private static final URI BASE_URL = URI.create("https://datausa.io/api/data?drilldowns=Nation&measures=Population");
	@Autowired private RestTemplate restTemplate;
	@Autowired private MyService myService;
	
	@GetMapping
	public ObjectNode myController() throws Exception {
		ObjectNode response = restTemplate.getForObject(BASE_URL, ObjectNode.class);
		if (response != null)
			return response;
		throw new Exception("Error processing the request");
	}
	@GetMapping("/person/{id}")
	public Person getPersonById(@PathVariable("id") int id) {
		Person personById = myService.getPersonById(id);
		return personById;
	}
}
