package com.cc.learncode.eureka.service;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 
 * <p>
 * <P>
 * 
 * @author caojiayao
 * @version $Id: EurekaController.java, v 0.1 2016年12月23日 上午11:16:14 caojiayao
 *          Exp $
 */
@RestController
public class EurekaController {

	@RequestMapping("/add")
	public Integer add(@RequestParam Integer a, @RequestParam Integer b) {
		return a + b;
	}
}
