package com.cc.learncode.config.client;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class ConfigClientService implements InitializingBean {
	
	@Value("${from}")
	private String from;

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println(this.from);
	}

	
	
}
