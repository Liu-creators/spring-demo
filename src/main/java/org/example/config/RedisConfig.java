package org.example.config;

import org.example.RedisTemplate;
import org.example.spring.annotation.Bean;
import org.example.spring.annotation.Configuration;
import org.example.spring.annotation.Lazy;

/**
 * -03/29-16:15
 * -Redis 配置类，自动注入RedisTemplate对象
 */
@Lazy
@Configuration
public class RedisConfig {
    /**
     * 获取RedisTemplate对象
     * @return 对象实例
     */
    @Bean
    @Lazy
    private RedisTemplate redisTemplate() {
        return new RedisTemplate();
    }
}
