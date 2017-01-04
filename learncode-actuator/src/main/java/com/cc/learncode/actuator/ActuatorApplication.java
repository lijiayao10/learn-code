/*
 * @author caojiayao 2017年1月4日 下午6:17:22
 */
package com.cc.learncode.actuator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * <p>
 * http://blog.didispace.com/spring-boot-actuator-1/
 * <P>
 * 
 * @author caojiayao
 * @version $Id: ActuatorApplication.java, v 0.1 2017年1月4日 下午6:17:22 caojiayao
 *          Exp $
 */
@SpringBootApplication
public class ActuatorApplication {
	public static void main(String[] args) {
		SpringApplication.run(ActuatorApplication.class, args);
	}
}
