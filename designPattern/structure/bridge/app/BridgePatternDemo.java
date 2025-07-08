package designPattern.structure.bridge.app;

import designPattern.structure.bridge.abstraction.AdvancedRemoteControl;
import designPattern.structure.bridge.abstraction.RemoteControl;
import designPattern.structure.bridge.implementation.Radio;
import designPattern.structure.bridge.implementation.Tv;

public class BridgePatternDemo {
    public static void main(String[] args) {
       
    		System.out.println("--- TV Remote ---");
        RemoteControl tvRemote = new RemoteControl(new Tv());
        
        tvRemote.togglePower();
        tvRemote.volumeUp();
        tvRemote.volumeDown();

        System.out.println("\n--- Radio Advanced Remote ---");
        AdvancedRemoteControl radioRemote = new AdvancedRemoteControl(new Radio());
        
        radioRemote.togglePower();
        radioRemote.volumeUp();
        radioRemote.mute();
    }
}
