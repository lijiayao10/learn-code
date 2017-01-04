package com.cc.learncode.eureka.ribbon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * 
 * <p>
 * http://blog.didispace.com/springcloud2/
 * 
 * http://blog.didispace.com/spring-cloud-ribbon-failed-retry/
 * <P>
 * 
 * @author caojiayao
 * @version $Id: EurekaRibbonApplication.java, v 0.1 2016年12月23日 下午2:18:31
 *          caojiayao Exp $
 */
@SpringBootApplication
@EnableDiscoveryClient
public class EurekaRibbonApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaRibbonApplication.class, args);
	}

	@Bean
	@LoadBalanced
	RestTemplate restTemplate() {
		return new RestTemplate();
	}

}
