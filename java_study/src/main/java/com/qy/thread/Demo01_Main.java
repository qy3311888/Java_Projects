package com.qy.thread;

public class Demo01_Main {

    public static void main(String[] args) throws InterruptedException {

        // 启动一个子线程
        Demo02_Thread myThread1 = new Demo02_Thread();
        myThread1.setName("Qy");
        myThread1.start();

        // main方法线程
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + " Main executed " + i);
            Thread.sleep(1000);
        }
    }
}
