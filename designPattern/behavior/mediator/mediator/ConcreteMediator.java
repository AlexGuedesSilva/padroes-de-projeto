package designpattern.behavior.mediator.mediator;

import java.util.ArrayList;
import java.util.List;

import designpattern.behavior.mediator.colleagues.Colleague;

public class ConcreteMediator implements Mediator {
    private List<Colleague> colleagues = new ArrayList<>();

    @Override
    public void register(Colleague c) {
        colleagues.add(c);
    }

    @Override
    public void relay(String msg, Colleague originator) {
        for (Colleague c : colleagues) {
            if (c != originator) {
                c.receive(msg);
            }
        }
    }
}

