package designpattern.behavior.mediator.mediator;

import designpattern.behavior.mediator.colleagues.Colleague;

public interface Mediator {
    void register(Colleague colleague);
    void relay(String msg, Colleague originator);
}
