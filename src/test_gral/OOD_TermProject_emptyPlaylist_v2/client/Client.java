package test_gral.OOD_TermProject_emptyPlaylist_v2.client;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

import test_gral.OOD_TermProject_emptyPlaylist_v2.radioTraversal.RadioStationCollection;
import test_gral.OOD_TermProject_emptyPlaylist_v2.radioTraversal.RadioStationCollectionInterface;
import test_gral.OOD_TermProject_emptyPlaylist_v2.radioTraversal.RadioStationIteratorInterface;
import test_gral.OOD_TermProject_emptyPlaylist_v2.radioTraversal.RadioStationSong;
import test_gral.OOD_TermProject_emptyPlaylist_v2.radioTraversal.RadioStationTypeEnum;
import test_gral.OOD_TermProject_emptyPlaylist_v2.structuralPattern.AudioPlayer;

/**
 *
 * @author German
 * 
 */

public class Client {
	
	private static boolean radioStationCurrentlyPlaying = false;
	private static RadioStationTypeEnum currentStation = null;
	private static RadioStationIteratorInterface iterator;
	private static RadioStationCollectionInterface radioStatns;
	private static BuildGUI gui;
	private static AudioPlayer audioPlayer;
	private static RadioStationSong currentSong;
	public static int fileDirecType;
	
	public static void main(String[] args){		
		
		// I added this code in so that the program can determine which kind of system you
		// are running the program on, and to make sure to provide the correct file paths
		// This program is designed for Mac or PC, so if you have a different system, please let me know.
		fileDirecType = isSystemMacOrPC();
		
		// initialize (or retrieve) single instance of GUI
		gui = BuildGUI.getSingleGUI();
		
		// initialize audioPlayer
		audioPlayer = new AudioPlayer();
	
		// initialize collection and iterator:
		radioStatns = getRadioStations();
		iterator = radioStatns.iterator(RadioStationTypeEnum.ALL);

		currentSong = null;		
		
		gui.chillBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				stationButtonClicked(RadioStationTypeEnum.CHILL);
			}
		});
        
		gui.popBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				stationButtonClicked(RadioStationTypeEnum.POP);
			}
		});
		
		gui.edmBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				stationButtonClicked(RadioStationTypeEnum.EDM);
			}
		});
		
		gui.britneyBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				stationButtonClicked(RadioStationTypeEnum.BRITNEY);
			}
		});
		
		gui.rhcpBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				stationButtonClicked(RadioStationTypeEnum.RHCP);
			}
		});
		
		gui.allBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				stationButtonClicked(RadioStationTypeEnum.ALL);
			}
		});		
		
		//ITERATOR action listener (next song button)
		gui.nextBtn.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
			
				if(radioStationCurrentlyPlaying){
					audioPlayer.stop(currentSong.getSongFile());
					currentSong = null;
					radioStationCurrentlyPlaying = false;
				}
				
				if(iterator.hasNext()){
					currentSong = iterator.next();
					audioPlayer.play(currentSong.getSongFile());
					radioStationCurrentlyPlaying = true;
					if(gui.output.getText().isEmpty()){
						gui.output.setText(currentSong.toString());
					}
					else{
						gui.output.setText(gui.output.getText() + "\r\n" + currentSong.toString());
					}
				}else{
					gui.output.setText(gui.output.getText() + "\r\n" + "End of " +currentStation.toString()+ " playlist." + " Please select a station.");
					radioStationCurrentlyPlaying = false;
					currentStation = null;
					gui.panel4.setVisible(false);
				}
				
			}
		});
		
		gui.stopBtn.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				if(radioStationCurrentlyPlaying){
					audioPlayer.stop(currentSong.getSongFile());
					radioStationCurrentlyPlaying = false;
					currentSong = null;
				}
			}
		});
		

	}
	
	private static RadioStationCollectionInterface getRadioStations(){
		RadioStationCollectionInterface stations = new RadioStationCollection();
		
		char c = 92; // backslash character ascii code = 92
		
		File chillfolder = new File("ChillPlaylist/");
		if(fileDirecType == 1){ // if statements here (and below) ensure accuracy of file paths for Mac or PC
			String s = "ChillPlaylist" + c;
			chillfolder = new File(s);
		}
		File[] chillChannelFiles = chillfolder.listFiles();
		shuffleSongs(chillChannelFiles);
		
		File britneyFolder = new File("BritneyPlaylist/");
		if(fileDirecType == 1){
			String s = "BritneyPlaylist" + c;
			britneyFolder = new File(s);
		}
		File[] britneyFiles = britneyFolder.listFiles();
		shuffleSongs(britneyFiles);
		
		File edmFolder = new File("EDMPlaylist/");
		if(fileDirecType == 1){
			String s = "EDMPlaylist" + c;
			edmFolder = new File(s);
		}
		File[] edmFiles = edmFolder.listFiles();
		shuffleSongs(edmFiles);
		
		File popFolder = new File("PopPlaylist/");
		if(fileDirecType == 1){
			String s = "PopPlaylist" + c;
			popFolder = new File(s);
		}
		File[] popFiles = popFolder.listFiles();
		shuffleSongs(popFiles);
		
		File rhcpFolder = new File("RHCPPlaylist/");
		if(fileDirecType == 1){
			String s = "RHCPPlaylist" + c;
			rhcpFolder = new File(s);
		}
		File[] rhcpFiles = rhcpFolder.listFiles();
		shuffleSongs(rhcpFiles);	
		
		for(int i=0; i<chillChannelFiles.length; i++){
			stations.addRadioStation(new RadioStationSong(RadioStationTypeEnum.CHILL, chillChannelFiles[i]));
		}
		for(int i=0; i<britneyFiles.length; i++){
			stations.addRadioStation(new RadioStationSong(RadioStationTypeEnum.BRITNEY, britneyFiles[i]));
		}
		for(int i=0; i<edmFiles.length; i++){
			stations.addRadioStation(new RadioStationSong(RadioStationTypeEnum.EDM, edmFiles[i]));
		}
		for(int i=0; i<popFiles.length; i++){
			stations.addRadioStation(new RadioStationSong(RadioStationTypeEnum.POP, popFiles[i]));
		}
		for(int i=0; i<rhcpFiles.length; i++){
			stations.addRadioStation(new RadioStationSong(RadioStationTypeEnum.RHCP, rhcpFiles[i]));
		}
		
		return stations;
	}
	
	
	private static void stationButtonClicked(RadioStationTypeEnum type){
		if(!radioStationCurrentlyPlaying){
			gui.panel4.setVisible(true);
		}else{
			audioPlayer.stop(currentSong.getSongFile());
			radioStationCurrentlyPlaying = false;
		}
		currentStation = type;
		
		iterator = radioStatns.iterator(currentStation);
		if(iterator.hasNext()){
			currentSong = iterator.next();
			radioStationCurrentlyPlaying = true;
			if(gui.output.getText().isEmpty()){
				gui.output.setText(currentSong.toString());
			}
			else{
				gui.output.setText(gui.output.getText() + "\r\n" + currentSong.toString());
			}
		}else{
			System.out.println("Playlist is empty");
			return;
		}
		
		startTheSong();	
	}
	
	
	private static void startTheSong(){
		
		audioPlayer.play(currentSong.getSongFile());
	}
	
	public static void shuffleSongs(File[] a){
		Random rand = ThreadLocalRandom.current();
		for(int i=a.length-1; i>0; i--){
			int j = rand.nextInt(i+1);
			File temp = a[j];
			a[j] = a[i];
			a[i] = temp;
		}
	}
	
	public static int isSystemMacOrPC(){ //returns 0 for mac, 1 for PC
		String sysProp = System.getProperty("os.name");
		if(sysProp.contains("Mac")){
			return 0;
		}else return 1;
	}
	
	
	
}
