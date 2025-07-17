package designpattern.behavior.mediator.app;

import designpattern.behavior.mediator.colleagues.ConcreteColleague;
import designpattern.behavior.mediator.mediator.ConcreteMediator;
import designpattern.behavior.mediator.mediator.Mediator;

public class MainApp {
    public static void main(String[] args) {
        Mediator mediator = new ConcreteMediator();

        ConcreteColleague c1 = new ConcreteColleague(mediator, "Colleague A");
        ConcreteColleague c2 = new ConcreteColleague(mediator, "Colleague B");
        ConcreteColleague c3 = new ConcreteColleague(mediator, "Colleague C");
        
        c1.send("Oi, galera!");
        c2.send("Tudo bem?");
        c3.send("E aí?");
    }
}
