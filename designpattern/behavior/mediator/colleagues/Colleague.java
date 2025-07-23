package designpattern.behavior.mediator.colleagues;

import designpattern.behavior.mediator.mediator.Mediator;

public abstract class Colleague {
	protected Mediator mediator;

	public Colleague(Mediator med) {
		this.mediator = med;
		this.mediator.register(this);
	}

	public abstract void receive(String message);

	public void send(String message) {
		mediator.relay(message, this);
	}
}
