package solution9;

import java.util.ArrayList;

public class PlayList {
	
	//Attributes
	String name;
	ArrayList<Song> playList;
	
	//Constructor
	/*PlayList(String name, ArrayList<Song> playList) {
		this.name = name;
		this.playList = playList;
	}*/
	
	//Methods
	void showPlaylist() {
		System.out.println(playList);
	}
	
	boolean findSong(String song) {
		for(int i = 0; i < playList.size(); i++) {
			if(playList.get(i).getTitle().equals(song)) {
				return true;
			}
		}
		return false;
	}
}
