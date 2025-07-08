package designPattern.structure.bridge.abstraction;

import designPattern.structure.bridge.implementation.Device;

public class AdvancedRemoteControl extends RemoteControl {

    public AdvancedRemoteControl(Device device) {
        super(device);
    }

    public void mute() {
        device.setVolume(0);
        System.out.println("Muted the device.");
    }
}
