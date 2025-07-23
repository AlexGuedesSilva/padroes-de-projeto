package designpattern.structure.adapter.players;

import designpattern.structure.adapter.interfaces.AdvancedMediaPlayer;

public class VlcPlayer implements AdvancedMediaPlayer {
	
    public void playVlc(String fileName) {
        System.out.println("Playing vlc file. Name: " + fileName);
    }

    public void playMp4(String fileName) {
        // Do nothing
    }
}