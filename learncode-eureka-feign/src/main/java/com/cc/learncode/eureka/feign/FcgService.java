/*
 * @author caojiayao 2017年6月12日 下午8:56:19
 */
package com.cc.learncode.eureka.feign;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * <p>
 * <P>
 * 
 * @author caojiayao
 * @version $Id: DepositService.java, v 0.1 2017年6月12日 下午8:56:19 caojiayao Exp $
 */
//@FeignClient(value = "fund-deposit-server", path = "/deposit-web/")

@FeignClient(value = "fcg-deposit-server", url = "http://fin.superjiadev.com/fcg/")
public interface FcgService {
	/**
	 * 充值请求
	 * 
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "/gateway?service=query_balance&v=1.0")
	public String test(String name);
}
