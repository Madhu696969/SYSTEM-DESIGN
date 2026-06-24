package DAY_2;

import java.util.*;

public class Stock {

    private List<Observer> observers;

    private int currentPrice;

    public Stock() {
        observers = new ArrayList<>();
    }
    public void addObserver(
            Observer observer) {

        observers.add(observer);
    }
    public void removeObserver(
            Observer observer) {

        observers.remove(observer);
    }

    public void notifyObservers() {

        for(Observer observer
                : observers) {

            observer.setPrice(
                    currentPrice
            );
        }
    }
    public void setPrice(
            int price) {
        this.currentPrice = price;
        System.out.println(
                "\nStock Price Updated : "
                + price
        );
        notifyObservers();
    }
}