package designpattern.behavior.state.state;

import designpattern.behavior.state.context.Player;

public class PausedState implements State {

	@Override
	public void play(Player player) {
		System.out.println("Retomando a música...");
	}

	@Override
	public void pause(Player player) {
		System.out.println("Já está pausada!");
	}

	@Override
	public void stop(Player player) {
		System.out.println("Parando a música a partir do pause...");
		player.setState(new StoppedState());
	}
	
}
