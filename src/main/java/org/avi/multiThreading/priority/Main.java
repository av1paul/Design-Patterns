package org.avi.multiThreading.priority;

import org.avi.multiThreading.intro.Thread1;

public class Main {
    public static void main(String[] args) {
        Thread t1 = new Thread1("t1");
        t1.setPriority(Thread.NORM_PRIORITY); // 5
        t1.setPriority(Thread.MIN_PRIORITY);  // 1
        t1.setPriority(Thread.MAX_PRIORITY);  // 10
    }
}
