package com.cc.learncode.eureka.feign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * <p>
 * http://blog.didispace.com/springcloud2/
 * <P>
 * 
 * @author caojiayao
 * @version $Id: EurekaFeignApplication.java, v 0.1 2016年12月23日 下午2:58:29
 *          caojiayao Exp $
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class EurekaFeignApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaFeignApplication.class, args);
	}

}
