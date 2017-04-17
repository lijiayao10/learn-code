package com.cc.learncode.eureka.feign;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "eureka-service", fallback = EurekaClientHytrix.class)
public interface EurekaClient {
	
	@RequestMapping(method = RequestMethod.POST, value = "/add")
	Integer add(@RequestParam("a") Integer a, @RequestParam("b") Integer b);
}
