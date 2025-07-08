package designPattern.structure.bridge.implementation;

public class Tv implements Device {
    private boolean on = false;
    private int volume = 30;

    @Override
    public void turnOn() {
        on = true;
        System.out.println("TV is ON");
    }

    @Override
    public void turnOff() {
        on = false;
        System.out.println("TV is OFF");
    }

    @Override
    public boolean isOn() {
        return on;
    }

    @Override
    public void setVolume(int percent) {
        volume = percent;
        System.out.println("TV volume set to " + volume + "%");
    }

    @Override
    public int getVolume() {
        return volume;
    }
}
