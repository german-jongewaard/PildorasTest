package test_gral.OOD_TermProject_emptyPlaylist_v2.radioTraversal;

public interface RadioStationCollectionInterface {
	
	public void addRadioStation(RadioStationSong rs);
	
	public void removeRadioStation(RadioStationSong rs);
	
	public RadioStationIteratorInterface iterator(RadioStationTypeEnum type);
}



