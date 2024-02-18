package org.avi.multiThreading.synchronization;

public class Stack {
    private int[] arr;
    private int top;
    private final Object lock;

    public Stack(int cap) {
        this.arr = new int[cap];
        this.top = -1;
        this.lock = new Object();
    }

    public boolean isEmpty() {
        return top < 0;
    }

    public boolean isFull() {
        return top == arr.length - 1;
    }

    public boolean push(int num) {
        synchronized (lock) {
            if(isFull()) {
                return false;
            }
            top ++;
            try {
                Thread.sleep(1000);
            } catch (Exception ignored) {
            }
            arr[top] = num;
            return true;
        }
    }

    // OR use public synchronised boolean push(int num) -> this object is used as lock
    // For static methods use MyClass.class as lock

    public int pop() {
        synchronized (lock) {
            if(isEmpty()) {
                return Integer.MIN_VALUE;
            }
            int num = arr[top];
            top --;
            try {
                Thread.sleep(1000);
            } catch (Exception ignored) {
            }
            return num;
        }
    }

}
