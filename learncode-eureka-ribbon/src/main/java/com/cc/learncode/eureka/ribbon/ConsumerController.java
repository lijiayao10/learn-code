package com.cc.learncode.eureka.ribbon;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ConsumerController {
	
	@Autowired
	RestTemplate restTemplate;
	
	@RequestMapping("/add")
	public Integer add(){
		return restTemplate.getForEntity("http://EUREKA-SERVICE/add?a=10&b=20", Integer.class).getBody();
	}
}
