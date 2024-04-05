package com.nnoitra;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.client.ClientHttpRequest;
import org.springframework.http.client.ClientHttpRequestInitializer;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ContextBeans {

	@Bean
	public RestTemplate restTemplate() {
		
		RestTemplate restTemplate = new RestTemplate();
		List<ClientHttpRequestInitializer> list = new ArrayList<>();
		ClientHttpRequestInitializer client = new ClientHttpRequestInitializer() {
			
			@Override
			public void initialize(ClientHttpRequest request) {
				// TODO Auto-generated method stub
//				request.
			}
		}; 
		restTemplate.setClientHttpRequestInitializers(list );
		return restTemplate;
	}
	
//	@Bean
//    public DataSource getDataSource() {
//        DataSourceBuilder dataSourceBuilder = DataSourceBuilder.create();
////        dataSourceBuilder.driverClassName("com.mysql.jdbc.Driver");
//        dataSourceBuilder.url("jdbc:mysql://localhost:3306/my_db");
//        dataSourceBuilder.username("root");
//        dataSourceBuilder.password("admin");
//        return dataSourceBuilder.build();
//    }
	
//	@Bean
//	public NewTopic topicA() {
//		return new NewTopic("topicA", 1, (short) 1);
//	}
	
//	@Bean
//	public NewTopic topicAge() {
//		return new NewTopic("topicAge", 1, (short) 1);
//	}
}
