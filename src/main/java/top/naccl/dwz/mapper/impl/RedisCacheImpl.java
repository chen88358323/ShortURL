package top.naccl.dwz.mapper.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import top.naccl.dwz.mapper.Cache;

import java.util.concurrent.TimeUnit;

/**
 * @Description: redis缓存实现
 * @Author: cc
 * @Date: 2021-09-13
 */
@Repository("redisCacheImpl")
public class RedisCacheImpl implements Cache {

    @Autowired
    StringRedisTemplate redisTemplate;

    @Override
    public String getVal(String key) {
        return redisTemplate.opsForValue().get(key);
    }

    @Override
    public Boolean expire(String key, long timeout, TimeUnit unit) {
        return redisTemplate.expire(key,timeout,unit);
    }

    @Override
    public void set(String key, String value, long timeout, TimeUnit unit) {
        redisTemplate.opsForValue().set(key,value,timeout,unit);
    }
}
