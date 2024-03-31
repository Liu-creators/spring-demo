package org.example.methods;

import org.example.SpringConfig;
import org.example.spring.AnnotationConfigApplicationContext;
import org.example.spring.ApplicationContext;

/**
 * -03/29-2:01
 * -IOC 容器测试
 */
public class AutowiredExample {

    public static void main(String[] args) throws ClassNotFoundException {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);

        System.out.println("----------------------------------------------------");

        Object userMapper1 = applicationContext.getBean("userMapper");
        Object userMapper2 = applicationContext.getBean("userMapper");

        System.out.println(userMapper1);
        System.out.println(userMapper2);

        System.out.println("----------------------------------------------------");

        Object userService1 = applicationContext.getBean("userService");
        Object userService2 = applicationContext.getBean("userService");

        System.out.println(userService1);
        System.out.println(userService2);

        System.out.println("----------------------------------------------------");

        Object userController1 = applicationContext.getBean("userController");
        Object userController2 = applicationContext.getBean("userController");

        System.out.println(userController1);
        System.out.println(userController2);
    }
}
