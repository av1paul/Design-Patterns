package org.avi.hashMap;

public class MyHashMap <K, V> {

    private static final int INITIAL_SIZE = 1 << 4;
    private static final int MAX_CAPACITY = 1 << 30; // int size -2^31 to 2^31 - 1
    private Entry[] entries;

    public MyHashMap() {
        entries = new Entry[INITIAL_SIZE];
    }

    public MyHashMap(int capacity) {
        int tableSize = getTableSize(capacity);
        entries = new Entry[tableSize];
    }

    private int getTableSize(int capacity) {
        int n = capacity - 1;
        n |= n >>> 1;
        n |= n >>> 2;
        n |= n >>> 4;
        n |= n >>> 8;
        n |= n >>> 16;
        return (n < 1) ? 1 : (n >= MAX_CAPACITY) ? MAX_CAPACITY : n + 1;
    }

    public void put(K key, V val) {
        int hashcode = key.hashCode() % entries.length;
        Entry node = entries[hashcode];
        if(node == null) {
            Entry newNode = new Entry(key, val);
            entries[hashcode] = newNode;
        } else {
            Entry prevNode = node;
            while(node != null) {
                if(node.key == key) {
                    node.val = val;
                    return;
                }
                prevNode = node;
                node = node.next;
            }
            prevNode.next = new Entry(key, val);
        }
    }

    public V get(K key) {
        int hashcode = key.hashCode() % entries.length;
        Entry node = entries[hashcode];
        while(node != null) {
            if(node.key == key) {
                return (V) node.val;
            }
            node = node.next;
        }
        return null;
    }

    class Entry <K, V> {
        K key;
        V val;
        Entry next;
        public Entry(K key, V val) {
            this.key = key;
            this.val = val;
        }
    }


}
