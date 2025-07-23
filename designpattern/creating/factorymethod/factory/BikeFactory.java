package designpattern.creating.factorymethod.factory;

import designpattern.creating.factorymethod.transport.Bike;
import designpattern.creating.factorymethod.transport.Transport;

public class BikeFactory extends TransportFactory {

	@Override
	public Transport createTransport() {
		return new Bike();
	}

}
