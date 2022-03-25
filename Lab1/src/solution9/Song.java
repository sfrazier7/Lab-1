package solution9;

public class Song {
	
	//Attributes
	private String title;
	private int duration;
	
	//Constructor
	Song(String title, int duration){
		this.title = title;
		this.duration = duration;
	}

	//Getters-Setters
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	@Override
	public String toString() {
		return "Song [title=" + title + ", duration=" + duration + "]";
	}
	
	
	

}
