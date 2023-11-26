package org.avi.observerPattern.observer;

import org.avi.observerPattern.oberservable.StockObservable;

public class EmailObserver implements Observer {
    private final StockObservable observable;
    private final String email;

    public EmailObserver(StockObservable observable, String email) {
        this.observable = observable;
        this.email = email;
    }

    @Override
    public void update() {
        System.out.println("Hurry up back in stock");
        System.out.println("Sending SMS to " + this.email);
    }
}
