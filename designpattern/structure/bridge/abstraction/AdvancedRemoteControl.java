package designpattern.structure.bridge.abstraction;

import designpattern.structure.bridge.implementation.Device;

public class AdvancedRemoteControl extends RemoteControl {

    public AdvancedRemoteControl(Device device) {
        super(device);
    }

    public void mute() {
        device.setVolume(0);
        System.out.println("Muted the device.");
    }
}
