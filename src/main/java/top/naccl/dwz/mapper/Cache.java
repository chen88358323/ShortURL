package top.naccl.dwz.mapper;

import java.util.concurrent.TimeUnit;

public interface Cache {

    String getVal(String key);

    Boolean expire(String key, long timeout, TimeUnit unit);

    void set(String key, String value, final long timeout, final TimeUnit unit);
}
