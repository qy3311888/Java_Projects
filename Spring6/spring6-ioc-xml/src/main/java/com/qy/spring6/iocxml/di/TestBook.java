package com.qy.spring6.iocxml.di;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBook {
    @Test
    public void testSetter() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean-di.xml");
        Book book = context.getBean("book", Book.class);
        System.out.println("基于set注入：" + book);
    }

    @Test
    public void testConstructor() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean-di.xml");
        Book bookC = context.getBean("bookC", Book.class);
        System.out.println("基于构造器注入：" + bookC);
    }
}
