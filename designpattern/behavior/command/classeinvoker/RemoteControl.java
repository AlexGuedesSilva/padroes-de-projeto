package designpattern.behavior.command.classeinvoker;

import designpattern.behavior.command.interfacecommand.Command;

public class RemoteControl {
	private Command command;
	
	public void setCommand(Command command) {
		this.command = command;
	}
	
	public void pressButton() {
		command.execute();
	}
}
