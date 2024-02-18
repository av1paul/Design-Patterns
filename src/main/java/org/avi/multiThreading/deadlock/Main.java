package org.avi.multiThreading.deadlock;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Main Starting");
        String lock1 = "avi";
        String lock2 = "paul";

        Thread t1 = new Thread(() -> {
            synchronized (lock1) {
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (lock2) {
                    System.out.println("1 Locks acquired");
                }
            }
        });
        Thread t2 = new Thread(() -> {
            synchronized (lock2) {
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (lock1) {
                    System.out.println("2 Locks acquired");
                }
            }
        });
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println("Main Ending");
    }
}
