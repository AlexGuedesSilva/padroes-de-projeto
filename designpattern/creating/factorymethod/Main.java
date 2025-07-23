package designpattern.creating.factorymethod;

import designpattern.creating.factorymethod.factory.BikeFactory;
import designpattern.creating.factorymethod.factory.CarFactory;
import designpattern.creating.factorymethod.factory.TransportFactory;

public class Main {
    public static void main(String[] args) {
        TransportFactory carFactory = new CarFactory();
        carFactory.planDelivery(); // Saída: Entrega feita por carro.

        TransportFactory bikeFactory = new BikeFactory();
        bikeFactory.planDelivery(); // Saída: Entrega feita por bicicleta.
    }
}
