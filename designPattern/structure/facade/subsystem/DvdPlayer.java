package designpattern.structure.facade.subsystem;

public class DvdPlayer {
	public void on() {
		System.out.println("DVD ligado.");
	}

	public void play(String movie) {
		System.out.println("Reproduzindo \"" + movie + "\"");
	}

	public void stop() {
		System.out.println("DVD parado.");
	}

	public void off() {
		System.out.println("DVD desligado.");
	}
}