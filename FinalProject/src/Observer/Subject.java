package Observer;

import AbstractFactory.*;
import Command.*;
import Decorator.*;
import Observer.*;

public interface Subject {
    void registerObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObservers(String Order);
}
