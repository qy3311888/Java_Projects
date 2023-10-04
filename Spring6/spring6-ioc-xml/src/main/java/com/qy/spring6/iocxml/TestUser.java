package com.qy.spring6.iocxml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestUser {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");

        // 1.根据id获取Bean
        User user1 = (User) context.getBean("user");
        System.out.println("1.id获取：" + user1);

        // 2.根据类型获取Bean,此时IoC容器中指定类型的bean只能有一个
        // User user2 = context.getBean(User.class);
        // System.out.println("2.类型获取：" + user2);

        // 3.根据id和类型获取
        User user3 = context.getBean("user1", User.class);
        System.out.println("3.id和类型获取：" + user3);
    }
}
