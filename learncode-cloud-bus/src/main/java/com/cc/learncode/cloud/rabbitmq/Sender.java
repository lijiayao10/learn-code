package com.cc.learncode.cloud.rabbitmq;

import java.util.Date;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * <p>发送者<P>
 * @author caojiayao 
 * @version $Id: Sender.java, v 0.1 2016年12月30日 下午6:09:57 caojiayao Exp $
 */
@Component
public class Sender {

	@Autowired
	private AmqpTemplate rabbitTemplate;

	public void send() {
		String coutext = "hello " + new Date();
		System.out.println("Sender : " + coutext);
		this.rabbitTemplate.convertAndSend("hello", coutext);
	}
}
