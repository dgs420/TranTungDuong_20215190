package hust.soict.globalict.aims.media;

import hust.soict.globalict.aims.exception.PlayerException;

public class Track implements Playable{
	private String title;
	private int length;
	
	public Track(String title, int length) {
        this.title = title;
        this.length = length;
    }
	
	public Track(String title) {
        this.title = title;
        
    }

	public String getTitle() {
		return title;
	}

	public int getLength() {
		return length;
	}
	
	public void play() throws PlayerException { 
		if(this.getLength()>0) {
			System.out.println("Playing Track: " + this.getTitle()); 
			System.out.println("Track length: " + this.getLength()); 
		}
		else {
			throw new PlayerException("ERROR: Track length is non-positive!");
		}
	}


}
