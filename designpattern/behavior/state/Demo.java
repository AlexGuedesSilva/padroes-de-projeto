package designpattern.behavior.state;

import designpattern.behavior.state.context.Player;

public class Demo {
	public static void main(String[] args) {
		Player player = new Player();
		
		player.play();  // Iniciando a música...
		player.pause(); // Pausando a música...
		player.play();  // Retomando a música...
		player.stop();  // Parando a música...
		player.stop();  // Já está parado! 
	}
}
