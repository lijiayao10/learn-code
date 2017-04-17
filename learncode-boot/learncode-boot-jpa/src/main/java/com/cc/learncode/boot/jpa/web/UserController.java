/*
 * @author caojiayao 2017年1月4日 下午8:12:40
 */
package com.cc.learncode.boot.jpa.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.cc.learncode.boot.jpa.domain.User;
import com.cc.learncode.boot.jpa.repository.UserRepository;

/**
 * <p>
 * <p>
 * 
 * @author caojiayao
 * @version $Id: UserController.java, v 0.1 2017年1月4日 下午8:12:40 caojiayao Exp $
 */
@RestController
public class UserController {
	@Autowired
	private UserRepository userRepository;

	@ResponseBody
	@RequestMapping("/")
	public List<User> list() {
		return userRepository.findAll();
	}
}
