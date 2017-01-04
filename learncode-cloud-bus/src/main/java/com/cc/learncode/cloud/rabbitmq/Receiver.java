package com.cc.learncode.cloud.rabbitmq;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * <p>消费者<P>
 * @author caojiayao 
 * @version $Id: Receiver.java, v 0.1 2016年12月30日 下午6:12:24 caojiayao Exp $
 */
@Component
@RabbitListener(queues = "hello")
public class Receiver {

	@RabbitHandler
	public void process(String hello) {
		System.out.println("Receiver : " + hello);
	}
}
