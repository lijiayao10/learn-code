//package com.cc.netflix.zuul;
//
//import java.io.IOException;
//
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
//import org.springframework.context.annotation.Bean;
//
//import com.netflix.zuul.ZuulFilter;
//import com.netflix.zuul.context.RequestContext;
//
//@EnableZuulProxy
//@SpringBootApplication
//public class App {
//	public static void main(String[] args) {
//		SpringApplication.run(App.class, args);
//	}
//	
////	@Bean
////    public ZuulFilter zuulFallbackProvider() {
////        return new ZuulFallbackProvider() {
////            @Override
////            public String getRoute() {
////                return "zuulserver";
////            }
////
////            @Override
////            public ClientHttpResponse fallbackResponse() {
////                return new ClientHttpResponse() {
////                    @Override
////                    public HttpStatus getStatusCode() throws IOException {
////                        return HttpStatus.OK;
////                    }
////
////                    @Override
////                    public int getRawStatusCode() throws IOException {
////                        return 200;
////                    }
////
////                    @Override
////                    public String getStatusText() throws IOException {
////                        return "OK";
////                    }
////
////                    @Override
////                    public void close() {
////
////                    }
////
////                    @Override
////                    public InputStream getBody() throws IOException {
////                        return new ByteArrayInputStream("fallback".getBytes());
////                    }
////
////                    @Override
////                    public HttpHeaders getHeaders() {
////                        HttpHeaders headers = new HttpHeaders();
////                        headers.setContentType(MediaType.APPLICATION_JSON);
////                        return headers;
////                    }
////                };
////            }
////        };
////    }
//	
//	@Bean
//	public ZuulFilter zuulFilter(){
//		return new ZuulFilter() {
//			
//			public boolean shouldFilter() {
//				System.out.println("shouldFilter");
//				return true;
//			}
//			
//			public Object run() {
//				System.out.println("run");
//				try {
//					RequestContext.getCurrentContext().getResponse().sendRedirect("http://blog.csdn.net/liaokailin/");
//				} catch (IOException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//				return null;
//			}
//			
//			@Override
//			public String filterType() {
//				System.out.println("filterType");
//				return "route";
//			}
//			
//			@Override
//			public int filterOrder() {
//				System.out.println("filterOrder");
//				return 1;
//			}
//		};
//	}
//}
