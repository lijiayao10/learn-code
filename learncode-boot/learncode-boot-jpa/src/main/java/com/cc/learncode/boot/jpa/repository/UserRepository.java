/*
 * @author caojiayao 2017年1月4日 下午7:58:41
 */
package com.cc.learncode.boot.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.cc.learncode.boot.jpa.domain.User;

/**
 * <p>
 * <p>
 * 
 * @author caojiayao
 * @version $Id: UserRepository.java, v 0.1 2017年1月4日 下午7:58:41 caojiayao Exp $
 */
public interface UserRepository extends JpaRepository<User, Long> {
	User findByName(String name);

	User findByNameAndAge(String name, Integer age);

	@Query("from User u where u.name =:name")
	User findUser(@Param("name") String name);
}
