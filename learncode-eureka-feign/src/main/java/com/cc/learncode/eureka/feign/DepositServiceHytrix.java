package com.cc.learncode.eureka.feign;

import org.springframework.stereotype.Component;

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
 * http://blog.didispace.com/springcloud3/
 * <P>
 * 
 * @author caojiayao
 * @version $Id: EurekaClientHytrix.java, v 0.1 2016年12月26日 下午4:19:03 caojiayao
 *          Exp $
 */
@Component
public class DepositServiceHytrix implements DepositService {

	/* (non-Javadoc)
	 * @see com.cc.learncode.eureka.feign.DepositService#deposit(com.netfinworks.deposit.api.domain.DepositRequest, com.netfinworks.common.domain.OperationEnvironment)
	 */
	@Override
	public DepositResponse deposit(DepositRequest request, OperationEnvironment envInfo) {
		System.out.println("DepositServiceHytrix");
		return null;
	}

	/* (non-Javadoc)
	 * @see com.cc.learncode.eureka.feign.DepositService#refund(com.netfinworks.deposit.api.domain.DepositRefundRequest, com.netfinworks.common.domain.OperationEnvironment)
	 */
	@Override
	public DepositRefundResponse refund(DepositRefundRequest request, OperationEnvironment envInfo) {
		System.out.println("DepositServiceHytrix");
		return null;
	}

	/* (non-Javadoc)
	 * @see com.cc.learncode.eureka.feign.DepositService#query(com.netfinworks.deposit.api.domain.DepositDetailRequest, com.netfinworks.common.domain.OperationEnvironment)
	 */
	@Override
	public DepositDetailResponse query(DepositDetailRequest request, OperationEnvironment envInfo) {
		System.out.println("DepositServiceHytrix");
		return null;
	}

	/* (non-Javadoc)
	 * @see com.cc.learncode.eureka.feign.DepositService#queryList(com.netfinworks.deposit.api.domain.DepositListRequest, com.netfinworks.common.domain.OperationEnvironment)
	 */
	@Override
	public DepositListResponse queryList(DepositListRequest request, OperationEnvironment envInfo) {
		System.out.println("DepositServiceHytrix");
		return null;
	}

	/* (non-Javadoc)
	 * @see com.cc.learncode.eureka.feign.DepositService#advance(com.netfinworks.deposit.api.domain.AdvanceRequest, com.netfinworks.common.domain.OperationEnvironment)
	 */
	@Override
	public AdvanceResponse advance(AdvanceRequest request, OperationEnvironment envInfo) {
		System.out.println("DepositServiceHytrix");
		return null;
	}

}
