package designpattern.behavior.command;

import designpattern.behavior.command.classeinvoker.RemoteControl;
import designpattern.behavior.command.commandconcret.TurnOffLightCommand;
import designpattern.behavior.command.commandconcret.TurnOnLightCommand;
import designpattern.behavior.command.interfacecommand.Command;
import designpattern.behavior.command.receiver.Light;

public class Client {
    public static void main(String[] args) {
        Light light = new Light();
        
        Command turnOn = new TurnOnLightCommand(light);
        Command turnOff = new TurnOffLightCommand(light);

        RemoteControl remote = new RemoteControl();

        remote.setCommand(turnOn);
        remote.pressButton();  // Saída: A luz está acesa.

        remote.setCommand(turnOff);
        remote.pressButton();  // Saída: A luz está apagada.
    }
}

