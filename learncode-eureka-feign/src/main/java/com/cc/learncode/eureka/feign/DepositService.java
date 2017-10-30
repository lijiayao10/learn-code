/*
 * @author caojiayao 2017年6月12日 下午8:56:19
 */
package com.cc.learncode.eureka.feign;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.netfinworks.common.domain.OperationEnvironment;
import com.netfinworks.deposit.api.domain.AdvanceRequest;
import com.netfinworks.deposit.api.domain.AdvanceResponse;
import com.netfinworks.deposit.api.domain.DepositDetailRequest;
import com.netfinworks.deposit.api.domain.DepositDetailResponse;
import com.netfinworks.deposit.api.domain.DepositListRequest;
import com.netfinworks.deposit.api.domain.DepositListResponse;
import com.netfinworks.deposit.api.domain.DepositRefundRequest;
import com.netfinworks.deposit.api.domain.DepositRefundResponse;
import com.netfinworks.deposit.api.domain.DepositRequest;
import com.netfinworks.deposit.api.domain.DepositResponse;

/**
 * <p>
 * <P>
 * 
 * @author caojiayao
 * @version $Id: DepositService.java, v 0.1 2017年6月12日 下午8:56:19 caojiayao Exp $
 */
//@FeignClient(value = "fund-deposit-server", path = "/deposit-web/")

@FeignClient(value = "fund-deposit-server", url = "${deposit.rest.url}/deposit/")
public interface DepositService {
	/**
	 * 充值请求
	 * 
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "/deposit")
	public DepositResponse deposit(@RequestBody @RequestParam("request") DepositRequest request,
			@RequestBody @RequestParam("envInfo") OperationEnvironment envInfo);

	/**
	 * 充值退款请求
	 * 
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "/refund")
	public DepositRefundResponse refund(@RequestParam("request") DepositRefundRequest request,
			@RequestParam("envInfo") OperationEnvironment envInfo);

	/**
	 * 充值查询
	 * 
	 * @param request
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value = "/query")
	public DepositDetailResponse query(@RequestParam("request") DepositDetailRequest request,
			@RequestParam("envInfo") OperationEnvironment envInfo);

	/**
	 * 充值列表查询请求
	 * 
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "/queryList")
	public DepositListResponse queryList(@RequestParam("request") DepositListRequest request,
			@RequestParam("envInfo") OperationEnvironment envInfo);

	/**
	 * 用于支付推进
	 * 
	 * @param request
	 * @param envInfo
	 * @return
	 */
	@RequestMapping(value = "/advance")
	public AdvanceResponse advance(@RequestParam("request") AdvanceRequest request,
			@RequestParam("envInfo") OperationEnvironment envInfo);
}
