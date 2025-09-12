package designpattern.behavior.state.state;

import designpattern.behavior.state.context.Player;

public class StoppedState implements State {

	@Override
	public void play(Player player) {
		System.out.println("Iniciando a música...");
		player.setState(new PlayingState());
	}

	@Override
	public void pause(Player player) {
		System.out.println("Não é possivel pausar, está parado.");
	}

	@Override
	public void stop(Player player) {
		System.out.println("Já está parado!");
	}
	
}
