package com.atguigu.jedis;

import redis.clients.jedis.Jedis;

public class Jedis_Demo1 {
    public static void main(String[] args) {
        //创建Jedis对象
        Jedis jedis = new Jedis("192.168.88.128", 6379);
        //测试
        String ping = jedis.ping();
        System.out.println(ping);
        jedis.close();
    }
}
