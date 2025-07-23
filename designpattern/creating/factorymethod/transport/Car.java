package designpattern.creating.factorymethod.transport;

public class Car implements Transport{

	@Override
	public void deliver() {
		System.out.println("Entrega feita por carro.");
	}

}
