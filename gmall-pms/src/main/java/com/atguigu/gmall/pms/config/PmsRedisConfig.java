package com.atguigu.gmall.pms.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.GenericJackson2JsonRedisSerializer;

import java.net.UnknownHostException;

/**
 * @API
 * @ClassName PmsRedisConfig
 * @Description TODO 只需要自己创建出自己需要的序列化器放入容器中即可
 * @Author lyg
 * @Date 2020/3/5 19:39
 * @Version 1.0
 **/
@Configuration
public class PmsRedisConfig {

    @Bean("redisTemplate")
    public RedisTemplate<Object, Object> redisTemplate(RedisConnectionFactory redisConnectionFactory) {
        RedisTemplate<Object, Object> template = new RedisTemplate<>();
        template.setConnectionFactory(redisConnectionFactory);
        // 修改默认的序列号方式
        template.setDefaultSerializer(new GenericJackson2JsonRedisSerializer());
        return template;
    }

}
