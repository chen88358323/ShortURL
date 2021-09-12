package top.naccl.dwz.mapper.impl;

import top.naccl.dwz.mapper.Cache;

import java.util.concurrent.TimeUnit;

public class LocalCacheImpl implements Cache {
    @Override
    public String getVal(String key) {
        return null;
    }

    @Override
    public Boolean expire(String key, long timeout, TimeUnit unit) {
        return null;
    }

    @Override
    public void set(String key, String value, long timeout, TimeUnit unit) {

    }
}
