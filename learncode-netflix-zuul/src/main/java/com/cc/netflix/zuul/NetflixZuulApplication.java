//package com.cc.netflix.zuul;
//
//import java.io.IOException;
//
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.boot.builder.SpringApplicationBuilder;
//import org.springframework.boot.context.embedded.FilterRegistrationBean;
//import org.springframework.boot.context.embedded.ServletRegistrationBean;
//import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
//import org.springframework.context.annotation.Bean;
//import org.springframework.stereotype.Component;
//
//import com.netflix.zuul.FilterFileManager;
//import com.netflix.zuul.FilterLoader;
//import com.netflix.zuul.ZuulFilter;
//import com.netflix.zuul.context.ContextLifecycleFilter;
//import com.netflix.zuul.context.RequestContext;
//import com.netflix.zuul.filters.FilterRegistry;
//import com.netflix.zuul.groovy.GroovyCompiler;
//import com.netflix.zuul.groovy.GroovyFileFilter;
//import com.netflix.zuul.http.ZuulServlet;
//import com.netflix.zuul.monitoring.MonitoringHelper;
//
///**
// * 
// * <p>
// * http://blog.didispace.com/springcloud5/
// * <P>
// * 
// * @author caojiayao
// * @version $Id: Application.java, v 0.1 2016年12月20日 下午8:07:42 caojiayao Exp $
// */
//@EnableZuulProxy
//@SpringBootApplication
//public class NetflixZuulApplication {
//	public static void main(String[] args) {
//		new SpringApplicationBuilder(NetflixZuulApplication.class).web(true).run(args);
//
//		// groovy 方式
//		FilterLoader.getInstance().setCompiler(new GroovyCompiler());
//		try {
//			FilterFileManager.setFilenameFilter(new GroovyFileFilter());
//			FilterFileManager.init(10, "groovy");
//		} catch (Exception e) {
//			throw new RuntimeException(e);
//		}
//	}
//
//	@Component
//	public static class MyCommandLineRunner implements CommandLineRunner {
//		@Override
//		public void run(String... args) throws Exception {
//			MonitoringHelper.initMocks();
//			initJavaFilters();
//		}
//
//		private void initJavaFilters() {
//			final FilterRegistry r = FilterRegistry.instance();
//
//			r.put("javaPreFilter", new ZuulFilter() {
//				@Override
//				public int filterOrder() {
//					return 50000;
//				}
//
//				@Override
//				public String filterType() {
//					return "pre";
//				}
//
//				@Override
//				public boolean shouldFilter() {
//					return true;
//				}
//
//				@Override
//				public Object run() {
//					System.out.println("running javaPreFilter");
//					RequestContext.getCurrentContext().set("name", "liaokailin");
//					return null;
//				}
//			});
//
//			r.put("javaRoutingFilter", new ZuulFilter() {
//				@Override
//				public int filterOrder() {
//					return 50000;
//				}
//
//				@Override
//				public String filterType() {
//					return "route";
//				}
//
//				@Override
//				public boolean shouldFilter() {
//					return true;
//				}
//
//				@Override
//				public Object run() {
//					System.out.println("running javaRoutingFilter");
//					try {
//						RequestContext.getCurrentContext().getResponse()
//								.sendRedirect("http://blog.csdn.net/liaokailin/");
//					} catch (IOException e) {
//						e.printStackTrace();
//					}
//					return null;
//				}
//			});
//
//			r.put("javaPostFilter", new ZuulFilter() {
//				@Override
//				public int filterOrder() {
//					return 50000;
//				}
//
//				@Override
//				public String filterType() {
//					return "post";
//				}
//
//				@Override
//				public boolean shouldFilter() {
//					return true;
//				}
//
//				@Override
//				public Object run() {
//					System.out.println("running javaPostFilter");
//					System.out.println(RequestContext.getCurrentContext().get("name").toString());
//					return null;
//				}
//
//			});
//
//		}
//
//	}
//
//	@Bean
//	public ServletRegistrationBean zuulServlet() {
//		ServletRegistrationBean servlet = new ServletRegistrationBean(new ZuulServlet());
//		servlet.addUrlMappings("/test");
//		return servlet;
//	}
//
//	@Bean
//	public FilterRegistrationBean contextLifecycleFilter() {
//		FilterRegistrationBean filter = new FilterRegistrationBean(new ContextLifecycleFilter());
//		filter.addUrlPatterns("/*");
//		return filter;
//	}
//}