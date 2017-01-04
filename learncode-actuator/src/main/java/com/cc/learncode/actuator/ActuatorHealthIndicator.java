/*
 * @author caojiayao 2017年1月4日 下午6:19:46
 */
package com.cc.learncode.actuator;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

/**
 * <p>
 * <P>
 * 
 * @author caojiayao
 * @version $Id: ActuatorHealthIndicator.java, v 0.1 2017年1月4日 下午6:19:46
 *          caojiayao Exp $
 */
@Component
public class ActuatorHealthIndicator implements HealthIndicator {

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.springframework.boot.actuate.health.HealthIndicator#health()
	 */
	@Override
	public Health health() {
		int errorCode = check();
		if (errorCode != 0) {
			return Health.down().withDetail("Error Code", errorCode).build();
		}
		return Health.up().build();

	}

	private int check() {
		return 1;
	}

}
