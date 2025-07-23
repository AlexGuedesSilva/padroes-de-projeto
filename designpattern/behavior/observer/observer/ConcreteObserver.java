package designpattern.behavior.observer.observer;

public class ConcreteObserver implements Observer {
    private String name;

    public ConcreteObserver(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println("[" + name + "] recebeu atualização: " + message);
    }
}
