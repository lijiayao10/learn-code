/*
 * @author caojiayao 2017年1月4日 下午7:57:26
 */
package com.cc.learncode.boot.jpa;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

/**
 * <p>
 * http://blog.didispace.com/springbootdata2/
 * http://blog.didispace.com/springbootmultidatasource/
 * <P>
 * 
 * @author caojiayao
 * @version $Id: JpaApplication.java, v 0.1 2017年1月4日 下午7:57:26 caojiayao Exp $
 */

@SpringBootApplication
public class JpaApplication {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new SpringApplicationBuilder(JpaApplication.class).web(true).run(args);
	}

}
