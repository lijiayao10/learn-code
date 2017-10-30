package com.cc.learncode.eureka.service;

import java.util.List;

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

	@RequestMapping("/list")
	public List<String> add(@RequestParam("list") List<String> list, @RequestParam("str") String str) {
		System.out.println("list:" + list);
		System.out.println("str:" + str);

		return list;
	}
}
