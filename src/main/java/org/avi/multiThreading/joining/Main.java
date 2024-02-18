package org.avi.multiThreading.joining;

public class Main {
    public static void main(String[] args) {
        System.out.println("Main starting");
        Thread t1 = new Thread(() -> {
            System.out.println(Thread.currentThread().getName() + " running");
        }, "T1");
        t1.start();
        try {
            t1.join();  // joins current thread to parent for sequential execution, main here is blocked
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Main ending");
    }
}
