package com.cc.learncode.eureka.server;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 
 * <p>
 * http://blog.didispace.com/springcloud1/
 * <P>
 * 
 * @author caojiayao
 * @version $Id: EurekaServerApplication.java, v 0.1 2016年12月23日 上午10:48:09
 *          caojiayao Exp $
 */
@EnableEurekaServer
@SpringBootApplication
public class EurekaServerApplication {

	public static void main(String[] args) {
		new SpringApplicationBuilder(EurekaServerApplication.class).web(true).run(args);
	}
}
