package org.example.observerPattern.oberservable;

import org.example.observerPattern.observer.Observer;

import java.util.ArrayList;
import java.util.List;

public class IphoneObservable implements StockObservable {

    private final List<Observer> observers = new ArrayList<>();
    private int stock;

    @Override
    public void add(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void remove(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for(Observer observer : this.observers) {
            observer.update();
        }
    }

    @Override
    public void setStock(int stockCount) {
        if(this.stock == 0) {
            this.stock = stockCount;
            notifyObservers();
        } else {
            this.stock = stockCount;
        }
    }

    @Override
    public int getStock() {
        return this.stock;
    }
}
