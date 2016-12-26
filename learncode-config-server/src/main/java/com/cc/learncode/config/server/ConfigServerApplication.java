package com.cc.learncode.config.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * <p>
 * http://blog.didispace.com/springcloud4-2/
 * <P>
 * 
 * @author caojiayao
 * @version $Id: ConfigServerApplication.java, v 0.1 2016年12月26日 下午4:27:41
 *          caojiayao Exp $
 */
@EnableDiscoveryClient
@EnableConfigServer
@SpringBootApplication
public class ConfigServerApplication {

	@RequestMapping("/")
	public String home() {
		return "Hello World!";
	}

	public static void main(String[] args) {
		SpringApplication.run(ConfigServerApplication.class, args);
	}
}
