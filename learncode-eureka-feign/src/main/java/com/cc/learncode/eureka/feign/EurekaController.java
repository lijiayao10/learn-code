package com.cc.learncode.eureka.feign;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EurekaController {

	@Autowired
	EurekaClient eurekaClient;

	@RequestMapping("/add")
	public Integer add(@RequestParam Integer a, @RequestParam Integer b) {
		return eurekaClient.add(a, b);
	}
}
