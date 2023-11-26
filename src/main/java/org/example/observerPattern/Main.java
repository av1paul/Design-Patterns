package org.example.observerPattern;

import org.example.observerPattern.oberservable.IphoneObservable;
import org.example.observerPattern.oberservable.StockObservable;
import org.example.observerPattern.observer.EmailObserver;
import org.example.observerPattern.observer.Observer;
import org.example.observerPattern.observer.SmsObserver;

public class Main {

    public static void main(String[] args) {
        StockObservable iphoneStockObserver = new IphoneObservable();

        Observer emailObserver = new EmailObserver(iphoneStockObserver, "123@email");
        Observer smsObserver = new SmsObserver(iphoneStockObserver, "1234567890");

        iphoneStockObserver.add(emailObserver);
        iphoneStockObserver.add(smsObserver);

        iphoneStockObserver.setStock(5);
        iphoneStockObserver.setStock(5);
        iphoneStockObserver.setStock(7);
    }
}
