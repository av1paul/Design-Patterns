package org.avi.multiThreading.synchronization;

import org.avi.multiThreading.intro.Thread1;

public class Main {
    public static void main(String[] args) {
        Stack stack = new Stack(5);
        Thread t1 = new Thread(() -> {
            for(int i = 0; i < 5; i ++) {
                System.out.println(stack.push(i));
            }
        }, "t1");
        Thread t2 = new Thread(() -> {
            for(int i = 0; i < 5; i ++) {
                System.out.println(stack.pop());
            }
        }, "t2");
        t1.start();
        t2.start();
    }
}
