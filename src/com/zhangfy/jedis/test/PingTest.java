package com.zhangfy.jedis.test;

import redis.clients.jedis.Jedis;

public class PingTest {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Jedis jedis = new Jedis("127.0.0.1", 6379);
		System.out.println(jedis.ping());
	}

}
