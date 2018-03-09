package test_gral.OOD_TermProject_emptyPlaylist_v2.structuralPattern;

import java.io.File;

/**
 *
 * @author German
 * 
 */

public class AudioPlayer implements MediaPlayer {

	MediaAdapter mediaAdapter;
	
	@Override
	public void play(File fileName) {
		if((fileName.getName().endsWith(".mp3")) || (fileName.getName().endsWith(".MP3")) || (fileName.getName().endsWith(".wav")) || (fileName.getName().endsWith(".WAV"))){
//			System.out.println("Playing: "+fileName);
			mediaAdapter = new MediaAdapter(fileName);
			mediaAdapter.play(fileName);
		}else{
			System.out.println("Invalid media type");
		}
	}

	@Override
	public void stop(File fileName) {
		mediaAdapter.stop(fileName);
	}
}
