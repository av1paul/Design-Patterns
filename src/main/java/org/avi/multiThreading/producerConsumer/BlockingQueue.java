package org.avi.multiThreading.producerConsumer;

import java.util.LinkedList;
import java.util.Queue;

public class BlockingQueue {
    private final Queue<String> queue;
    private final int capacity;

    public BlockingQueue(int capacity) {
        this.queue = new LinkedList<>();
        this.capacity = capacity;
    }

    public boolean isEmpty() {
        return queue.size() == 0;
    }

    public boolean isFull() {
        return queue.size() == capacity;
    }

    public boolean offer(String str) {
        synchronized (queue) {
            while (isFull()) {
                try {
                    queue.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            queue.offer(str);
            queue.notifyAll();
            return true;
        }
    }

    public String poll() {
        synchronized (queue) {
            while (isEmpty()) {
                try {
                    queue.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            String str = queue.poll();
            queue.notifyAll();
            return str;
        }
    }


}
