package org.example;

import org.example.service.UserService;
import org.example.service.UserServiceImpl;
import org.example.spring.AnnotationConfigApplicationContext;
import org.example.spring.ApplicationContext;

/**
 * -03/29-2:01
 * -IOC 容器测试
 */
public class IOCExample {

    public static void main(String[] args) throws ClassNotFoundException {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);

        System.out.println("----------------------------------------------------");

        UserService userService = (UserService)applicationContext.getBean(UserServiceImpl.class);
        userService.test();
        userService.test();

    }
}
