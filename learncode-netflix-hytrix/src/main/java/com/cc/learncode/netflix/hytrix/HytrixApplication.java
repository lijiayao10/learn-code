package com.cc.learncode.netflix.hytrix;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * <p>
 * http://blog.didispace.com/springcloud3/
 * <P>
 * 
 * @author caojiayao
 * @version $Id: HytrixApplication.java, v 0.1 2016年12月23日 下午5:29:08 caojiayao
 *          Exp $
 */
@EnableDiscoveryClient
@EnableCircuitBreaker
@SpringBootApplication
public class HytrixApplication {

	public static void main(String[] args) {
		SpringApplication.run(HytrixApplication.class, args);
	}
	
	@Bean
	@LoadBalanced
	RestTemplate restTemplate() {
		return new RestTemplate();
	}

}
