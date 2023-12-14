package org.avi.hashMap;

public class Main {
    public static void main(String[] args) {
        MyHashMap<String, Integer> map = new MyHashMap<>(9);
        map.put("Avi", 6);
        System.out.println(map.get("Avi"));
    }
}
