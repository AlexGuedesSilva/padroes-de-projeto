package designpattern.behavior.observer.subject;

import designpattern.behavior.observer.observer.Observer;

public interface Subject {
    void attach(Observer observer);
    void detach(Observer observer);
    void notifyObservers(String message);
}
