package org.example;

import org.example.spring.InitializingBean;
import org.example.spring.annotation.Component;

/**
 * -03/29-15:43
 * -Spring初始化完成后（字段注入之后）调用
 */
@Component
public class InitializingBeanImpl implements InitializingBean {
    @Override
    public void afterPropertiesSet() {
        System.out.println("执行InitializingBean.afterPropertiesSet()");
    }
}
