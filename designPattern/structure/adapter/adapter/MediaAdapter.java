package designPattern.structure.adapter.adapter;

import designPattern.structure.adapter.interfaces.AdvancedMediaPlayer;
import designPattern.structure.adapter.interfaces.MediaPlayer;
import designPattern.structure.adapter.players.Mp4Player;
import designPattern.structure.adapter.players.VlcPlayer;

public class MediaAdapter implements MediaPlayer {
	
    private AdvancedMediaPlayer advancedMusicPlayer;

    public MediaAdapter(String audioType) {
        if(audioType.equalsIgnoreCase("vlc") ) {
            advancedMusicPlayer = new VlcPlayer();
        } else if (audioType.equalsIgnoreCase("mp4")) {
            advancedMusicPlayer = new Mp4Player();
        }
    }

    public void play(String audioType, String fileName) {
        if(audioType.equalsIgnoreCase("vlc")) {
            advancedMusicPlayer.playVlc(fileName);
        } else if(audioType.equalsIgnoreCase("mp4")) {
            advancedMusicPlayer.playMp4(fileName);
        }
    }
}