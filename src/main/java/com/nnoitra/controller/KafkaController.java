package com.nnoitra.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nnoitra.kafka.AppProducer;
import com.nnoitra.pojo.MyAgePredictor;

@RestController
@RequestMapping("/kafka")
public class KafkaController {

	@Autowired private AppProducer appProducer;
	
	@GetMapping("/{message}")
	public String v1(@PathVariable("message") String message) {
		appProducer.produceMessage("topicA", message);
		return "v1";
	}
	
	@PostMapping
	public String v2(@RequestBody MyAgePredictor myAgePredictor) {
		appProducer.produceMessage("topicA", myAgePredictor);
		return "v2";
	}

}
