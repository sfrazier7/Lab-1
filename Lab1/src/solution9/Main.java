package solution9;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) throws IOException {
		
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
		
		FileOutputStream fos = new FileOutputStream(
				new File("C:\\Users\\ShafirFrazier\\OneDrive - Xpanxion\\Documents\\playlist.txt"));
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(playlist1);
		

	}

}
