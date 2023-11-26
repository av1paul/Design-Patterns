package org.example.observerPattern.oberservable;

import org.example.observerPattern.observer.Observer;

public interface StockObservable {
    void add(Observer observer);
    void remove(Observer observer);
    void notifyObservers();
    void setStock(int stockCount);
    int getStock();
}
