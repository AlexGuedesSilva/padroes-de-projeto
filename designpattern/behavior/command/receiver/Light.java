package designpattern.behavior.command.receiver;

public class Light {
	public void turnOn() {
		System.out.println("A luz está acesa.");
	}
	
	public void turnOff() {
		System.out.println("A luz está apagada.");
	}
}
