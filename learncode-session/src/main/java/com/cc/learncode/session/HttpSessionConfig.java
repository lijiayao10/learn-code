/*
 * @author caojiayao 2017年9月8日 下午1:55:24
 */
package com.cc.learncode.session;

import org.springframework.context.annotation.Configuration;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;

/**
 * <p>
 * <P>
 * 
 * @author caojiayao
 * @version $Id: HttpSessionConfig.java, v 0.1 2017年9月8日 下午1:55:24 caojiayao Exp
 *          $
 */
@Configuration
@EnableRedisHttpSession
public class HttpSessionConfig {

}
