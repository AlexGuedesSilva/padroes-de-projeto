package designpattern.behavior.state.state;

import designpattern.behavior.state.context.Player;

public class PlayingState implements State {

	@Override
	public void play(Player player) {
		System.out.println("Já está tocando!");
	}

	@Override
	public void pause(Player player) {
		System.out.println("Pausando a música...");
		player.setState(new PausedState());
	}

	@Override
	public void stop(Player player) {
		System.out.println("Parando a música...");
		player.setState(new StoppedState());
	}

}
