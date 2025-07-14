package designpattern.creating.factorymethod.factory;

import designpattern.creating.factorymethod.transport.Car;
import designpattern.creating.factorymethod.transport.Transport;

public class CarFactory extends TransportFactory{
	@Override
	public Transport createTransport() {
		return new Car();
	}
}
