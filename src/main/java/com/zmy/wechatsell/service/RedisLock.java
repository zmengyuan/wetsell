package com.zmy.wechatsell.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.util.StringUtils;

public class RedisLock {

    @Autowired
    private StringRedisTemplate redisTemplate;

    public boolean lock(String key,String value) {
        if (redisTemplate.opsForValue().setIfAbsent(key,value)) {
            return true;
        }

        String currentValue = redisTemplate.opsForValue().get(key);
        //如果锁过期
        if (!StringUtils.isEmpty(currentValue)
                && Long.parseLong(currentValue) < System.currentTimeMillis()) {
            //获取上一个锁的时间
            String oldVlaue = redisTemplate.opsForValue().getAndSet(key,value);
            if (! StringUtils.isEmpty(oldVlaue) && oldVlaue.equals(currentValue)) {
                return true;
            }
        }
        return false;
    }
}
