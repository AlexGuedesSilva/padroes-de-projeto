package designpattern.structure.facade.subsystem;

public class Amplifier {
	public void on() {
		System.out.println("Amplifier ligado.");
	}

	public void off() {
		System.out.println("Amplifier desligado.");
	}

	public void setInput(String src) {
		System.out.println("Entrada ajustada para " + src);
	}

	public void setVolume(int level) {
		System.out.println("Volume setado para " + level);
	}
}