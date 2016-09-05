package com.shinowit.tools;

import org.apache.ibatis.cache.decorators.LoggingCache;

/**
 * Created by gengtongfei on 2016/8/26.
 */
public class LoggingRedisCache extends LoggingCache {
    public LoggingRedisCache(String id) {
        super(new MybatisRedisCache(id));
    }
}
