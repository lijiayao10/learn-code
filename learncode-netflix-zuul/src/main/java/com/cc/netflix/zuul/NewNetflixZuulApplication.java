package com.cc.netflix.zuul;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;

/**
 * 
 * <p>
 * http://blog.didispace.com/springcloud5/
 * <P>
 * 
 * @author caojiayao
 * @version $Id: Application.java, v 0.1 2016年12月20日 下午8:07:42 caojiayao Exp $
 */
@EnableZuulProxy
@SpringCloudApplication
@EnableDiscoveryClient
public class NewNetflixZuulApplication {
	
	private final static Logger log = LoggerFactory.getLogger(NewNetflixZuulApplication.class);
	
	public static void main(String[] args) {
		new SpringApplicationBuilder(NewNetflixZuulApplication.class).web(true).run(args);
	}
	
	@Bean
	public ZuulFilter getAccessFilter() {
		return new ZuulFilter() {

			@Override
			public boolean shouldFilter() {
				return true;
			}

			@Override
			public Object run() {
				RequestContext ctx = RequestContext.getCurrentContext();
				HttpServletRequest request = ctx.getRequest();
				
				log.info(String.format("%s request to %s", request.getMethod(),request.getRequestURL().toString()));

				Object accessToken = request.getParameter("accessToken");
				if(accessToken == null){
					log.warn("access token is empty");
					ctx.setSendZuulResponse(false);
					ctx.setResponseStatusCode(401);
					return null;
				}
				
				log.info("access token ok");
				return null;
			}

			@Override
			public String filterType() {
				return "pre";
			}

			@Override
			public int filterOrder() {
				return 0;
			}
		};
	}
}