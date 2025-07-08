package designPattern.creating.factoryMethod.transport;

public class Bike implements Transport{

	@Override
	public void deliver() {
		System.out.println("Entrega feita por bicicleta.");
	}

}
