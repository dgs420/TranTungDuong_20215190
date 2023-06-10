package hust.soict.dsai.aims.media;
import java.util.ArrayList;

public class CompactDisc extends Disc  implements Playable{
	private String artist;
	private ArrayList<Track> tracks = new ArrayList<>();

	public CompactDisc() {
		// TODO Auto-generated constructor stub
	}
	public CompactDisc(int id, String title, String category, float cost, String director, String artist, ArrayList<Track> tracks) {
		super(id, title, category, cost, director);
		this.artist = artist;
		this.tracks = tracks;
	}
	
	public CompactDisc(int id, String title, String category, float cost, String director, String artist) {
		super(id, title, category, cost, director);
		this.artist = artist;
	}
	
	public String getArtist() {
        return artist;
    }
	
	public void addTrack(Track track) {
        if (tracks.contains(track)) {
            System.out.println("The track is already added.");
        } else {
            tracks.add(track);
            System.out.println("Track added");
        }
    }
	
	 public void removeTrack(Track track) {
	        if (tracks.contains(track)) {
	            tracks.remove(track);
	        } else {
	            System.out.println("The track does not exist in the list of tracks.");
	        }
	    }
	 
	 
	 public String toString() {
			return "CD - Id: " + this.getId() + " - " + this.getTitle() + " - " + this.getCategory() + " - " + this.getDirector() + " - " + this.getLength() + " : " + this.getCost() + " $";
		}
	 
	@Override
	public int getLength() {
		int length = 0;
        for (Track track : tracks) {
            length += track.getLength();
        }
        return length;
    }
	
	
	
	@Override
	public void play() {
        System.out.println("Playing CD: " + this.getTitle());
        System.out.println("By artist: " + this.getArtist());
        System.out.println("Length: " + this.getLength());

        System.out.println("Tracks:");
        for (Track track : tracks) {
            track.play();
        }
    }
	
}
