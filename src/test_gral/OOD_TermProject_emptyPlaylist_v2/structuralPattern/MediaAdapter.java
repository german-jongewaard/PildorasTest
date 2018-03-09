package test_gral.OOD_TermProject_emptyPlaylist_v2.structuralPattern;

import java.io.File;

/**
 *
 * @author German
 * 
 */

public class MediaAdapter implements MediaPlayer {

	private String type;
	private AdvancedMediaPlayer advancedSongPlayer;
	
	public MediaAdapter(File fileName){
		if((fileName.getName().endsWith(".mp3")) || (fileName.getName().endsWith(".MP3"))){
			advancedSongPlayer = new Mp3Player();
    		type = "mp3";
    	}else if(fileName.getName().endsWith(".wav") || fileName.getName().endsWith(".WAV")){
    		type = "wav";
    		advancedSongPlayer = new WavPlayer();
    	}
	}
	
	@Override
	public void play(File fileName) {
		if(type.equals("mp3") || type.equals("wav")){
			advancedSongPlayer.playMedia(fileName);
		}
	}

	@Override
	public void stop(File fileName) {
		advancedSongPlayer.stopMedia(fileName);
	}
}
