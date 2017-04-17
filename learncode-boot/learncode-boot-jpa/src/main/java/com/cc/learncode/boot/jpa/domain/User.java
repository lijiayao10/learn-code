/*
 * @author caojiayao 2017年1月4日 下午7:59:41
 */
package com.cc.learncode.boot.jpa.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * <p><p>
 * @author caojiayao 
 * @version $Id: User.java, v 0.1 2017年1月4日 下午7:59:41 caojiayao Exp $
 */
@Entity
public class User {
	
	@Id
	@GeneratedValue
	private Long id;
	
	@Column
	private String name;
	
	@Column
	private Integer age;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}
}
