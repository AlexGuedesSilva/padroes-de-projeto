package designpattern.behavior.command.commandconcret;

import designpattern.behavior.command.interfacecommand.Command;
import designpattern.behavior.command.receiver.Light;

public class TurnOnLightCommand implements Command{
	private Light light;
	
	public TurnOnLightCommand(Light light) {
		this.light = light;
	}
	
	@Override
	public void execute() {
		light.turnOn();
	}
}
