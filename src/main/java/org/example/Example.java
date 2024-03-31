package org.example;

import org.example.spring.AnnotationConfigApplicationContext;
import org.example.spring.ApplicationContext;


/**
 * -03/29-16:17
 * -
 */
public class Example {
    public static void main(String[] args) throws ClassNotFoundException {
        ApplicationContext applicationContext =  new AnnotationConfigApplicationContext(SpringConfig.class);

        Object redisTemplate1 = applicationContext.getBean("redisTemplate");
        Object redisTemplate2 = applicationContext.getBean(RedisTemplate.class);
        System.out.println(redisTemplate1);
        System.out.println(redisTemplate2);
    }
}
