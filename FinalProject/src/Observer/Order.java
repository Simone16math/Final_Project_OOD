package Observer;

import AbstractFactory.*;
import Command.*;
import Decorator.*;
import Observer.*;

import java.util.ArrayList;

public class Order implements Subject {
    //List to register customer
    public ArrayList<Observer> observers = new ArrayList<Observer>();

    // Name
    public String name;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public Order() {
        //constructor
    }
    // Method to add an observer
    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }
    // Method to remove an observer
    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);

    }
    // Method to notify an observer
    @Override
    public void notifyObservers(String Order) {
        for (Observer o : observers) {
            o.update(Order);
        }

    }
    public void orderStatus(String Order) {
        notifyObservers(Order);

    }

}
