package Observer;

public interface Subject {
    // methods to add, remove and notify Observer
    void registerObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObservers(String Order);
}
