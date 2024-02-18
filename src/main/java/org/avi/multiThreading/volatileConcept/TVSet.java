package org.avi.multiThreading.volatileConcept;

public class TVSet {
    private static volatile TVSet tvSet = null; // volatile - value is read/write directly in main memory not cache

    public TVSet() {
        System.out.println("TV Set Initialized");
    }

    public static TVSet getInstance() {
        if(tvSet == null) {
            synchronized (TVSet.class) {
                if(tvSet == null) {
                    tvSet = new TVSet();
                }
            }
        }
        return tvSet;
    }
}
