package designpattern.behavior.command.commandconcret;

import designpattern.behavior.command.interfacecommand.Command;
import designpattern.behavior.command.receiver.Light;

public class TurnOffLightCommand implements Command{
	private Light light;
	
	public TurnOffLightCommand(Light light) {
		this.light = light;
	}
	
	@Override
	public void execute() {
		light.turnOff();
	}

}
