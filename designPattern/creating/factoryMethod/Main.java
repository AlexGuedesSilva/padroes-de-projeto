package designPattern.creating.factoryMethod;

import designPattern.creating.factoryMethod.factory.BikeFactory;
import designPattern.creating.factoryMethod.factory.CarFactory;
import designPattern.creating.factoryMethod.factory.TransportFactory;

public class Main {
    public static void main(String[] args) {
        TransportFactory carFactory = new CarFactory();
        carFactory.planDelivery(); // Saída: Entrega feita por carro.

        TransportFactory bikeFactory = new BikeFactory();
        bikeFactory.planDelivery(); // Saída: Entrega feita por bicicleta.
    }
}
