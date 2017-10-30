package com.cc.learncode.eureka.feign;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.netfinworks.common.domain.OperationEnvironment;
import com.netfinworks.deposit.api.domain.DepositDetailRequest;
import com.netfinworks.deposit.api.domain.DepositDetailResponse;
import com.netfinworks.deposit.api.domain.DepositRequest;
import com.netfinworks.deposit.api.domain.DepositResponse;

@RestController
public class EurekaController {

	@Autowired
	EurekaClient eurekaClient;

	@Autowired
	DepositService depositService;

	@Autowired
	FcgService fcgService;

	@RequestMapping("/add")
	public Integer add(@RequestParam Integer a, @RequestParam Integer b) {
		return eurekaClient.add(a, b);
	}

	@ResponseBody
	@RequestMapping("/deposit")
	public DepositResponse deposit(@RequestParam("request") DepositRequest request,
			@RequestParam("envInfo") OperationEnvironment envInfo) {
		return depositService.deposit(request, envInfo);
	}

	@ResponseBody
	@RequestMapping("/query")
	public DepositDetailResponse query(@RequestParam("request") DepositDetailRequest request,
			@RequestParam("envInfo") OperationEnvironment envInfo) {
		return depositService.query(request, envInfo);
	}

	@ResponseBody
	@RequestMapping("/test")
	public String test(String name) {
		return fcgService.test(name);
	}
}
