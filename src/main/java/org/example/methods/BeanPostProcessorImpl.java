package org.example.methods;

import org.example.service.UserService;
import org.example.spring.BeanPostProcessor;
import org.example.spring.annotation.Component;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * -03/29-17:38
 * -BeanPostProcessor实现方法，在每个bean注入前后后执行
 */
@Component
public class BeanPostProcessorImpl implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) {
        System.out.println(beanName + "初始化之前...");
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) {
        System.out.println(beanName + "初始化之后...");
        // 实现JDK动态代理，可以用于对实现方法的动态加强以及做日志处理
        if (beanName.equals("userServiceImpl")) {  // 创建对象时，对bean实例对象做判断，生成对应的代理对象
//            System.out.println("---------userServiceImpl------------");
            return Proxy.newProxyInstance(UserService.class.getClassLoader(),
                    bean.getClass().getInterfaces(),
                    new InvocationHandler() {
                        @Override
                        public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                            System.out.println("代理增强处理");
                            return method.invoke(bean, args);
                        }
                    }); // 里面有new的对象实现 在编译时会有两个对应的class文件
        }
        return bean;
    }
}
