package designpattern.behavior.state.context;

import designpattern.behavior.state.state.State;
import designpattern.behavior.state.state.StoppedState;

public class Player {
	private State state;
	
	public Player() {
		this.state = new StoppedState(); // Estado inicial
	}
	
	public void setState(State state) {
		this.state = state;
	}
	
	public void play() {
		state.play(this);
	}
	
	public void pause() {
		state.pause(this);
	}
	
	public void stop() {
		state.stop(this);
	}
}
