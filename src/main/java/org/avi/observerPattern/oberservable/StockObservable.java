package org.avi.observerPattern.oberservable;

import org.avi.observerPattern.observer.Observer;

public interface StockObservable {
    void add(Observer observer);
    void remove(Observer observer);
    void notifyObservers();
    void setStock(int stockCount);
    int getStock();
}
