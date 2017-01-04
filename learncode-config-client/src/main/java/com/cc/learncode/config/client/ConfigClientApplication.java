package com.cc.learncode.config.client;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * <p>
 * http://blog.didispace.com/springcloud7/
 * http://blog.didispace.com/springcloud7/
 * <P>
 * 
 * @author caojiayao
 * @version $Id: ConfigClientApplication.java, v 0.1 2016年12月30日 下午3:18:33
 *          caojiayao Exp $
 */
@EnableDiscoveryClient
@SpringBootApplication
public class ConfigClientApplication {

	public static void main(String[] args) {
		new SpringApplicationBuilder(ConfigClientApplication.class).web(true).run(args);

		/**
		 * 这里需要格外注意：上面这些属性必须配置在bootstrap.properties中，config部分内容才能被正确加载。
		 * 因为config的相关配置会先于application.properties，而bootstrap.properties的加载也
		 * 是先于application.properties。
		 */
	}
}
