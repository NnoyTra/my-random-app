package com.nnoitra.kafka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

import com.nnoitra.pojo.MyAgePredictor;

@Component
public class AppProducer {

	@Autowired
	private KafkaTemplate<Object, Object> template;
	
	public void produceMessage(String topic, String message) {
		this.template.send(topic, message);
	}
	
	public void produceMessage(String topic, MyAgePredictor myAgePredictor) {
		this.template.send(topic, myAgePredictor);
	}
	
}
