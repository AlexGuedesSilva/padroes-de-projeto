package designpattern.structure.bridge.app;

import designpattern.structure.bridge.abstraction.AdvancedRemoteControl;
import designpattern.structure.bridge.abstraction.RemoteControl;
import designpattern.structure.bridge.implementation.Radio;
import designpattern.structure.bridge.implementation.Tv;

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
