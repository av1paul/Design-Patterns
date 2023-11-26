package org.avi.observerPattern.observer;

import org.avi.observerPattern.oberservable.StockObservable;

public class SmsObserver implements Observer {

    private final StockObservable observable;
    private final String mobile;

    public SmsObserver(StockObservable observable, String mobile) {
        this.observable = observable;
        this.mobile = mobile;
    }

    @Override
    public void update() {
        System.out.println("Hurry up back in stock");
        System.out.println("Sending SMS to " + this.mobile);
    }
}
