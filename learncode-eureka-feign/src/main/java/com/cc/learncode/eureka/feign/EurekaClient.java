package com.cc.learncode.eureka.feign;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(serviceId="eureka-service")
public interface EurekaClient {
	
	@RequestMapping(method = RequestMethod.GET, value = "/add")
	Integer add(@RequestParam("a") Integer a, @RequestParam("b") Integer b);
}
