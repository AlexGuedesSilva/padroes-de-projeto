package designpattern.behavior.state.state;

import designpattern.behavior.state.context.Player;

public interface State {
	void play(Player player);
	void pause(Player player);
	void stop(Player player);
	
}
