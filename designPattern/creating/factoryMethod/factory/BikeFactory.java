package designPattern.creating.factoryMethod.factory;

import designPattern.creating.factoryMethod.transport.Bike;
import designPattern.creating.factoryMethod.transport.Transport;

public class BikeFactory extends TransportFactory {

	@Override
	public Transport createTransport() {
		return new Bike();
	}

}
