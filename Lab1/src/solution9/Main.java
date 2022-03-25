package solution9;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		PlayList playlist1 = new PlayList();
		ArrayList<Song> songs = new ArrayList<Song>();
		playlist1.playList = songs;
		Song song1 = new Song("Daylight", 216);
		Song song2 = new Song("Rising", 306);
		Song song3 = new Song("SawElephant:uN9", 256);
		
		songs.add(song3);
		songs.add(song2);
		songs.add(song1);
		
		playlist1.showPlaylist();
		System.out.println(playlist1.findSong("Rising"));

	}

}
