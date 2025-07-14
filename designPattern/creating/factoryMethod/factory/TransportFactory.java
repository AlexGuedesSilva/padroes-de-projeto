package designpattern.creating.factorymethod.factory;

import designpattern.creating.factorymethod.transport.Transport;

public abstract class TransportFactory {
	
	public abstract Transport createTransport();
	
	public void planDelivery() {
		Transport transport = createTransport();
		transport.deliver();
	}
}
