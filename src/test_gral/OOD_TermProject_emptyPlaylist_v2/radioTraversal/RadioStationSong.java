package test_gral.OOD_TermProject_emptyPlaylist_v2.radioTraversal;

import java.io.File;

/***
 * RadioStation is a class for creating RadioStation objects.
 * RadioStation objects have two member fields:
 * 		(1): a RadioStationTypeEnum variable "type"
 * 		(2): an int variable "trackNumber" which is a numerical value representing a
 * 			 specific song within a (theoretical) playlist consisting of all the songs
 * 			 of "type" field's RadioStationTypeEnum type
 * */


public class RadioStationSong {
	
	private RadioStationTypeEnum TYPE;
	private File song;
//	private int trackNumber;
	
	public RadioStationSong(RadioStationTypeEnum type, /*int trckNum*/ File audioFile){
//		this.trackNumber = trckNum;
		this.TYPE = type;
		this.song = audioFile;
	}
	
	public RadioStationTypeEnum getTYPE(){
		return TYPE;
	}
	
//	public int getTrackNumber(){
//		return trackNumber;
//	}
	
	public File getSongFile(){
		return this.song;
	}
	
	
	@Override
	public String toString(){
		return this.TYPE+ ": " + this.song.getName();
	}
}
