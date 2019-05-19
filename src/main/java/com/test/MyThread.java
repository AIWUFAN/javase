package com.test;

public class MyThread implements Runnable {


    static MyThread instance = new MyThread();

    static int j = 0;

    @Override
    public void run() {
        synchronized (this) {
            System.out.println(Thread.currentThread().getName() + "正在运行");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println(Thread.currentThread().getName() + "运行结束");
        }

//        for (int i = 0; i < 100000; i++) {
//            j++;
//        }
    }

    public static void main(String[] args) throws InterruptedException {
        System.out.println(Thread.currentThread().getName() + "正在运行");
        Thread t1 = new Thread(instance);
        Thread t2 = new Thread(instance);
        t1.start();
        t2.start();

        while (t1.isAlive() || t2.isAlive()) {
        }
        System.out.println(Thread.currentThread().getName() + "运行结束");
        //  t1.join();
        //  t2.join();

        //  System.out.println(j);
    }
}
