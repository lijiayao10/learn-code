package com.cc.redis;

import redis.clients.jedis.Jedis;

public class JedisTest {
	
	public static void main(String[] args) {
		Jedis jedis = new Jedis("192.168.31.130", 6379);
		
		jedis.set("key1", "value1");
		
		
		System.out.println(jedis.get("key1"));
	}

}
