package designPattern.structure.adapter.players;

import designPattern.structure.adapter.interfaces.AdvancedMediaPlayer;

public class Mp4Player implements AdvancedMediaPlayer {
	
    public void playVlc(String fileName) {
        // Do nothing
    }

    public void playMp4(String fileName) {
        System.out.println("Playing mp4 file. Name: " + fileName);
    }
}
