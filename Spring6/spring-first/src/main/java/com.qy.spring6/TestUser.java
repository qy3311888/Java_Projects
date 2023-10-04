package com.qy.spring6;

import org.junit.jupiter.api.Test;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestUser {

    // 创建日志对象
    private Logger logger = LoggerFactory.getLogger(TestUser.class);

    @Test
    public void testUserObject() {
        // 加载Spring配置文件，创建对象
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");

        // 获取创建的对象
        User user = (User) context.getBean("user");
        System.out.println("1:" + user);

        // 使用对象调用方法进行测试
        System.out.print("2:");
        user.add();

        // 手动写日志
        logger.info("## 执行调用成功..");
    }

    // 反射创建对象
    @Test
    public void testUserObjectReflect() throws Exception {
        // 获取类Class对象
        Class clazz = Class.forName("com.qy.spring6.User");

        // 调用方法创建对象
        User user = (User) clazz.getDeclaredConstructor().newInstance();
        System.out.println("反射创建的对象:" + user);
    }
}
