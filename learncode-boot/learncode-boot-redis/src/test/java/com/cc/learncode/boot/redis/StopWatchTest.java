/*
 * @author caojiayao 2017年1月16日 上午10:42:12
 */
package com.cc.learncode.boot.redis;

import org.springframework.util.StopWatch;

/**
 * <p>
 * <P>
 * 
 * @author caojiayao
 * @version $Id: StopWatchTest.java, v 0.1 2017年1月16日 上午10:42:12 caojiayao Exp $
 */
public class StopWatchTest {
	public static void main(String[] args) throws InterruptedException {
		StopWatch stopWatch = new StopWatch(Thread.currentThread().getName());
		stopWatch.start();

		Thread.sleep(1000);

		stopWatch.stop();

		System.out.println("log:" + stopWatch.toString());
	}
}
