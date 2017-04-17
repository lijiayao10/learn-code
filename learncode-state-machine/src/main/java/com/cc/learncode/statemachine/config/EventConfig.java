/*
 * @author caojiayao 2017年1月4日 下午5:35:41
 */
package com.cc.learncode.statemachine.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.statemachine.ExtendedState;
import org.springframework.statemachine.annotation.ExtendedStateVariable;
import org.springframework.statemachine.annotation.OnTransition;
import org.springframework.statemachine.annotation.WithStateMachine;

/**
 * <p>
 * 使用注解方式实现状态机
 * <P>
 * @author caojiayao 
 * @version $Id: EventConfig.java, v 0.1 2017年1月4日 下午5:35:41 caojiayao Exp $
 */
@WithStateMachine
public class EventConfig {
	private Logger logger = LoggerFactory.getLogger(getClass()) ;
	
	@OnTransition(target="UNPAID")
	public void create(){
		logger.info("订单创建，待支付");
	}
	
	@OnTransition(source="UNPAID",target="WAITING_FOR_RECCEIVE")
	public void pay(@ExtendedStateVariable ExtendedState extendedState){
		logger.info("用户完成支付，待收货");
	}
	
	@OnTransition(source = "WAITING_FOR_RECEIVE", target = "DONE")
    public void receive(@ExtendedStateVariable ExtendedState extendedState) {
        logger.info("用户已收货，订单完成");
    }
}
