import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class Subject {
    private List<Observer> observers = new ArrayList<Observer>();
  
    public void addObserver(Observer observer) {
        observers.add(observer);
    }
    
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }
    
    public void notifyObserversLux() {
        Iterator<Observer> it = observers.iterator();
        while (it.hasNext()) {
        Observer obs= it.next();
        obs.updateLux(this); 
        }
    }

    public void notifyObserversEco() {
        Iterator<Observer> it = observers.iterator();
        while (it.hasNext()) {
        Observer obs= it.next();
        obs.updateEco(this); 
        }
    }
}
