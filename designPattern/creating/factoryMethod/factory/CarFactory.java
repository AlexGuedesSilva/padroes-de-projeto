package designPattern.creating.factoryMethod.factory;

import designPattern.creating.factoryMethod.transport.Car;
import designPattern.creating.factoryMethod.transport.Transport;

public class CarFactory extends TransportFactory{
	@Override
	public Transport createTransport() {
		return new Car();
	}
}
