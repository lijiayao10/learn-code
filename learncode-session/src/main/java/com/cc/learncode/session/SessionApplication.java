/*
 * @author caojiayao 2017年9月8日 下午2:50:59
 */
package com.cc.learncode.session;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

/**
 * <p>
 * <P>
 * 
 * @author caojiayao
 * @version $Id: SessionApplication.java, v 0.1 2017年9月8日 下午2:50:59 caojiayao
 *          Exp $
 */
@SpringBootApplication
public class SessionApplication {
	public static void main(String[] args) {
		new SpringApplicationBuilder(SessionApplication.class).web(true).run(args);
	}
}
