package com.nnoitra.kafka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class AppConsumer {

	private final Logger logger = LoggerFactory.getLogger(AppConsumer.class);
	
	
//	@KafkaListener(id = "topicAGroup", topics = "topicA")
	public void topicAListen(byte[] in) {
		logger.info("Received from topicA: " + new String(in));
	}
}
