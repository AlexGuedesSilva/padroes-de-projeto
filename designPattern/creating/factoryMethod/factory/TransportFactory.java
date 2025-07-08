package designPattern.creating.factoryMethod.factory;

import designPattern.creating.factoryMethod.transport.Transport;

public abstract class TransportFactory {
	public abstract Transport createTransport();
	
	public void planDelivery() {
		Transport transport = createTransport();
		transport.deliver();
	}
}
