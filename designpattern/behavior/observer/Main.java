package designpattern.behavior.observer;

import designpattern.behavior.observer.observer.ConcreteObserver;
import designpattern.behavior.observer.subject.ConcreteSubject;

public class Main {
    public static void main(String[] args) {
        ConcreteSubject subject = new ConcreteSubject();

        ConcreteObserver obs1 = new ConcreteObserver("Observer 1");
        ConcreteObserver obs2 = new ConcreteObserver("Observer 2");

        subject.attach(obs1);
        subject.attach(obs2);

        subject.changeState("Novo Estado 1");

        subject.detach(obs1);

        subject.changeState("Novo Estado 2");
    }
}
