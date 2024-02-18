package org.avi.multiThreading.intro;

import org.avi.multiThreading.intro.Thread1;
import org.avi.multiThreading.intro.Thread2;

public class ThreadTester {
    public static void main(String[] args) {

        System.out.println("starting main ...");
        Thread t1 = new Thread1("Thread 1");
        Thread t2 = new Thread(new Thread2(), "Thread 2");   // Best Practice
        Thread t3 = new Thread(() -> {
            for(int i = 0; i < 5; i ++) {
                System.out.println("Inside " + Thread.currentThread().getName() +  " - " + i);
            }
        }, "Thread 3");

        //t1.setDaemon(true); // Daemon Thread - Low Priority Thread eg. for Garbage Collection

        t1.start();
        t2.start();
        t3.start();

        System.out.println("exiting main ...");
    }
}
