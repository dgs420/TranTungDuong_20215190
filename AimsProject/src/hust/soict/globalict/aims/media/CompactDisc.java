package hust.soict.globalict.aims.media;
import java.util.ArrayList;



import hust.soict.globalict.aims.exception.PlayerException;

public class CompactDisc extends Disc  implements Playable{
	private String artist;
	private ArrayList<Track> tracks = new ArrayList<>();
	private static int nbCompactDiscs  = 0;



	public CompactDisc(String title, String category, float cost, String director, String artist, ArrayList<Track> tracks) {
		super(nbCompactDiscs++, title, category, cost, director);
		this.artist = artist;
		this.tracks = tracks;
	}
	
	public CompactDisc(String title, String category, float cost, String director, String artist) {
		super(nbCompactDiscs++, title, category, cost, director);
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
	public void play() throws PlayerException {
		if(this.getLength()>0) {
			java.util.Iterator<Track> iter=tracks.iterator();
			Track nextTrack;
			while(iter.hasNext()) {
				nextTrack=(Track) iter.next();
				try {
					nextTrack.play();
					
				}catch (PlayerException e) {
					throw e;
				}
			}
			
		}
		else {
			throw new PlayerException("ERROR: Track length is non-positive!");
		}
	}
 
	
}
