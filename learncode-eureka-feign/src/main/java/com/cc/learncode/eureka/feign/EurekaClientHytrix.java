package com.cc.learncode.eureka.feign;

import org.springframework.stereotype.Component;

/**
 * <p>
 * http://blog.didispace.com/springcloud3/
 * <P>
 * 
 * @author caojiayao
 * @version $Id: EurekaClientHytrix.java, v 0.1 2016年12月26日 下午4:19:03 caojiayao
 *          Exp $
 */
@Component
public class EurekaClientHytrix implements EurekaClient {

	public Integer add(Integer a, Integer b) {
		return -1;
	}
}
