package org.avi.multiThreading.producerConsumer;

public class Main {
    public static void main(String[] args) {
        BlockingQueue q = new BlockingQueue(3);
        Thread t1 = new Thread(() -> {
            for(int i = 0; i < 5; i ++) {
                System.out.println(Thread.currentThread().getName() + " " + q.offer(Thread.currentThread().getName() + "-" + i));
            }
        }, "t1");

        Thread t2 = new Thread(() -> {
            for(int i = 0; i < 5; i ++) {
                System.out.println(Thread.currentThread().getName() + " " + q.offer(Thread.currentThread().getName() + "-" + i));
            }
        }, "t2");

        Thread t3 = new Thread(() -> {
            for(int i = 0; i < 10; i ++) {
                System.out.println(q.poll());
            }
        }, "t3");

        t1.start();
        t2.start();
        t3.start();
    }
}
