package com.cc.redis;

import redis.clients.jedis.Jedis;

public class JedisTest {

	public static void main(final String[] args) {
		final Jedis jedis = new Jedis("116.62.211.199", 6379);

		jedis.set("key1", "value1");


		System.out.println(jedis.get("key1"));
	}

}
