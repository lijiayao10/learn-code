package com.cc.learncode.eureka.feign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

import com.google.common.collect.Sets;
import com.manyi.iw.fin.frenzy.restful.spring.converter.ConverterTargetTypeCarrier;
import com.netfinworks.common.domain.OperationEnvironment;
import com.netfinworks.deposit.api.domain.DepositDetailRequest;
import com.netfinworks.deposit.api.domain.DepositDetailResponse;
import com.netfinworks.deposit.api.domain.DepositRequest;

/**
 * <p>
 * http://blog.didispace.com/springcloud2/
 * <P>
 * 
 * @author caojiayao
 * @version $Id: EurekaFeignApplication.java, v 0.1 2016年12月23日 下午2:58:29
 *          caojiayao Exp $
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class EurekaFeignApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaFeignApplication.class, args);
	}

	@Bean
	public ConverterTargetTypeCarrier createConverterTargetTypes() {
		return new ConverterTargetTypeCarrier(Sets.newHashSet(DepositRequest.class, OperationEnvironment.class,DepositDetailRequest.class,DepositDetailResponse.class,DepositDetailResponse.class));
	}
	
}
