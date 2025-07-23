package designpattern.behavior.observer.subject;

import java.util.ArrayList;
import java.util.List;

import designpattern.behavior.observer.observer.Observer;

public class ConcreteSubject implements Subject {
    private List<Observer> observers = new ArrayList<>();

    @Override
    public void attach(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(String message) {
        for (Observer obs : observers) {
            obs.update(message);
        }
    }

    // Método de simulação de mudança de estado
    public void changeState(String state) {
        System.out.println("Estado alterado para: " + state);
        notifyObservers(state);
    }
}
