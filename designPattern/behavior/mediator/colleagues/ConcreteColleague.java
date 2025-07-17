package designpattern.behavior.mediator.colleagues;

import designpattern.behavior.mediator.mediator.Mediator;

public class ConcreteColleague extends Colleague {
	private String name;

	public ConcreteColleague(Mediator med, String name) {
		super(med);
		this.name = name;
	}

	@Override
	public void receive(String message) {
		System.out.println(name + " recebeu: " + message);
	}
}
