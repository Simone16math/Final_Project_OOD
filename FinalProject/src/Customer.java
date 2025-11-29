import java.util.ArrayList;
import java.util.List;

public class Customer implements Subject {
    //List to register customer
    public ArrayList<Observer> observers = new ArrayList<Observer>();

    public Customer() {
        //constructor
        observers = new ArrayList<>();
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
   /* public String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void update() {
        notification();
    }
    public void notification(){
        System.out.println("You ordered: " );
    }*/
}
