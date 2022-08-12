package com.woldier.redis.tools;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

public class RedisFactory {
    private static JedisPool jedisPool;

    static {
        JedisPoolConfig jedisPoolConfig =  new JedisPoolConfig();
        jedisPoolConfig.setMaxTotal(8);
        jedisPoolConfig.setMaxIdle(8);
        jedisPoolConfig.setMinIdle(0);
        jedisPoolConfig.setMaxWaitMillis(200);
        jedisPool = new JedisPool("192.168.59.130",6379);
    }

    public  static Jedis getJedis(){
        return jedisPool.getResource();
    }
}
