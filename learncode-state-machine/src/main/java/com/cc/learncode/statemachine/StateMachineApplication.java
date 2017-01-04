/*
 * @author caojiayao 2017年1月4日 下午4:28:47
 */
package com.cc.learncode.statemachine;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.statemachine.StateMachine;

import com.cc.learncode.statemachine.common.Events;
import com.cc.learncode.statemachine.common.States;

/**
 * <p>
 * http://blog.didispace.com/spring-statemachine/
 * <P>
 * 
 * @author caojiayao
 * @version $Id: StateMachineApplication.java, v 0.1 2017年1月4日 下午4:28:47
 *          caojiayao Exp $
 */
@SpringBootApplication
public class StateMachineApplication implements CommandLineRunner {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(StateMachineApplication.class, args);
	}

	@Autowired
	private StateMachine<States, Events> stateMachine;

	@Override
	public void run(String... args) throws Exception {
		stateMachine.start();
		stateMachine.sendEvent(Events.PAY);
		stateMachine.sendEvent(Events.RECEIVE);
	}

}
