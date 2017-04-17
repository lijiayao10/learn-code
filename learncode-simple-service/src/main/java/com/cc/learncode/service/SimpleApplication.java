/*
 * @author caojiayao 2017年4月10日 下午3:38:59
 */
package com.cc.learncode.service;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * <P>
 * 
 * @author caojiayao
 * @version $Id: SimpleApplication.java, v 0.1 2017年4月10日 下午3:38:59 caojiayao
 *          Exp $
 */
@SpringBootApplication
@RestController
@RequestMapping("/simple")
public class SimpleApplication {

	private static final Logger LOG = Logger.getLogger(SimpleApplication.class);

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(SimpleApplication.class, args);
	}

	@RequestMapping("home")
	public String home() {
		LOG.log(Level.INFO, " call Simple Service");
		return "Hello Simple Service";
	}

	@RequestMapping("home/{str}")
	public String home(@PathVariable String str) {
		LOG.log(Level.INFO, " call Simple Service, in str:" + str);
		return "Hello Simple Service, in str:" + str;
	}

}
