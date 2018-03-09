package test_gral.OOD_TermProject_emptyPlaylist_v2.radioTraversal;

import java.util.ArrayList;
import java.util.List;

public class RadioStationCollection implements RadioStationCollectionInterface {

	private List<RadioStationSong> radioStationsList;
	
	public RadioStationCollection(){
		setRadioStationsList(new ArrayList<>());
	}
	

	@Override
	public void addRadioStation(RadioStationSong rs) {
		this.radioStationsList.add(rs);
	}

	@Override
	public void removeRadioStation(RadioStationSong rs) {
		this.radioStationsList.remove(rs);
	}

	@Override
	public RadioStationIterator iterator(RadioStationTypeEnum type) {
		return new RadioStationIterator(type, this.radioStationsList);
	}
			
	public List<RadioStationSong> getRadioStationsList() {
		return radioStationsList;
	}

	public void setRadioStationsList(List<RadioStationSong> radioStationsList) {
		this.radioStationsList = radioStationsList;
	}

	private class RadioStationIterator implements RadioStationIteratorInterface{
		
		private RadioStationTypeEnum type;
		private List<RadioStationSong> radioStations;
		private int position;
		
		public RadioStationIterator(RadioStationTypeEnum typ, List<RadioStationSong> radioStationsList){
			this.type = typ;
			this.radioStations = radioStationsList;
		}
		
		@Override
		public boolean hasNext(){
			while(position < radioStations.size()){
				RadioStationSong station = radioStations.get(position);
				if(station.getTYPE().equals(type) || type.equals(RadioStationTypeEnum.ALL)){
					return true;
				}else position++;
			}
			return false;
		}
		
		@Override
		public RadioStationSong next(){
			RadioStationSong station = radioStations.get(position);
			position++;
			return station;
		}		
	}
}


