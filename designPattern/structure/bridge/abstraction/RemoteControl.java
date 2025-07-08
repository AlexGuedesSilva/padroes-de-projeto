package designPattern.structure.bridge.abstraction;

import designPattern.structure.bridge.implementation.Device;

public class RemoteControl {
    protected Device device;

    public RemoteControl(Device device) {
        this.device = device;
    }

    public void togglePower() {
        if (device.isOn()) {
            device.turnOff();
        } else {
            device.turnOn();
        }
    }

    public void volumeDown() {
        int volume = device.getVolume();
        device.setVolume(Math.max(0, volume - 10));
    }

    public void volumeUp() {
        int volume = device.getVolume();
        device.setVolume(Math.min(100, volume + 10));
    }
}
