/*
 * @author caojiayao 2017年4月10日 下午2:36:28
 */
package com.cc.learncode.sleuth;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.http.client.OkHttpClientHttpRequestFactory;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * <p>
 * <P>
 * 
 * @author caojiayao
 * @version $Id: Application.java, v 0.1 2017年4月10日 下午2:36:28 caojiayao Exp $
 */
// @EnableZipkinStreamServer
@SpringBootApplication
@RestController
public class SleuthApplication {

	@Autowired
	private RestTemplate restTemplate;

	private static final Logger LOG = Logger.getLogger(SleuthApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(SleuthApplication.class, args);
	}

	@RequestMapping("/")
	public String home() {
		LOG.log(Level.INFO, "you called home");
		return "Hello World";
	}

	@Bean
	public RestTemplate getRestTemplate() {
		return new RestTemplate(new OkHttpClientHttpRequestFactory());
	}

	@RequestMapping("/callhome")
	public String callHome() {
		LOG.log(Level.INFO, "calling home");
		return restTemplate.getForObject("http://localhost:8080", String.class);
	}

	@RequestMapping("/simple")
	public String callSimple() {
		LOG.log(Level.INFO, "calling home");
		return restTemplate.getForObject("http://localhost:8089/simple/home", String.class);
	}

	@RequestMapping("/simple/{str}")
	public String callSimple(@PathVariable String str) {
		LOG.log(Level.INFO, "calling home");
		return restTemplate.getForObject("http://localhost:8089/simple/home/{str}", String.class, str);
	}

	@RequestMapping("/simpleAll/{str}")
	public String callSimpleAll(@PathVariable String str) {
		LOG.log(Level.INFO, "calling home");
		return this.callSimple() + "//" + this.callSimple(str);
	}
	
	
	@RequestMapping("/servletHome")
	public String servletHome() {
		LOG.log(Level.INFO, "calling servletHome");
		return restTemplate.getForObject("http://localhost:8090/learncode-servlet2/callHome", String.class);
	}
}
