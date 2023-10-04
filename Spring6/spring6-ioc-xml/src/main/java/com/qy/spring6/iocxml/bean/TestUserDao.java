package com.qy.spring6.iocxml.bean;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestUserDao {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");

        // 根据类型获取bean
        UserDao userDao = context.getBean(UserDao.class);
        System.out.println("1.根据类获取bean：" + userDao);
        userDao.run();
    }
}
