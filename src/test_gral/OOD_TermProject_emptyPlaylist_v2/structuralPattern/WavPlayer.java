package test_gral.OOD_TermProject_emptyPlaylist_v2.structuralPattern;

import java.io.File;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

/**
 *
 * @author German
 * 
 */

public class WavPlayer implements AdvancedMediaPlayer {

	private Clip clip;
	
	public WavPlayer(){	
	}
	
	@Override
	public void playMedia(File fileName) {
		try{
			clip = AudioSystem.getClip();
			clip.open(AudioSystem.getAudioInputStream(fileName));
			clip.start(); 
			
//			Thread.sleep(clip.getMicrosecondLength()/1000);
			
		}catch(Exception e){
			
		}
	}

	@Override
	public void stopMedia(File fileName) {
		if(clip != null){
			clip.stop();
		}
		// clip = null;
	} 
}
