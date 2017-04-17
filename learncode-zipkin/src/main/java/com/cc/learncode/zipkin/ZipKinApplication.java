/*
 * @author caojiayao 2017年4月10日 下午3:18:34
 */
package com.cc.learncode.zipkin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import zipkin.server.EnableZipkinServer;

/**
 * <p>
 * <P>
 * 
 * @author caojiayao
 * @version $Id: ZipKinApplication.java, v 0.1 2017年4月10日 下午3:18:34 caojiayao
 *          Exp $
 */
@EnableZipkinServer
@SpringBootApplication
public class ZipKinApplication {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(ZipKinApplication.class, args);
	}

}
