package com.cc.learncode.eureka.service;

import java.util.Arrays;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * 
 * <p>
 * http://blog.didispace.com/springcloud1/
 * <P>
 * 
 * @author caojiayao
 * @version $Id: EurekaServiceApplication.java, v 0.1 2016年12月23日 上午11:13:20
 *          caojiayao Exp $
 */
@EnableDiscoveryClient
@EnableEurekaClient
@SpringBootApplication
public class EurekaServiceApplication {

	public static void main(String[] args) {
		System.out.println(Arrays.toString(args));
		new SpringApplicationBuilder(EurekaServiceApplication.class).web(true).run(args);
	}
}
