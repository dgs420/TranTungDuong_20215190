package hust.soict.globalict.aims.media;

import hust.soict.globalict.aims.exception.PlayerException;

public class DigitalVideoDisc extends Disc  implements Playable{
	

	private static int nbDigitalVideoDiscs = 0;
	
	public DigitalVideoDisc(String title) {
		super(nbDigitalVideoDiscs++,title);
	}
	
	public DigitalVideoDisc(String title, String category, float cost) {
		super(nbDigitalVideoDiscs++,title,category,cost);
	}
	
	public DigitalVideoDisc(String title, String category, String director, float cost) {
		super(nbDigitalVideoDiscs++,title,category,cost,director);
		
	}
	
	public DigitalVideoDisc(String title, String category, String director,int length, float cost) {
		super(nbDigitalVideoDiscs++,title,category,cost,director,length);
		
	}
	
	@Override
	public String toString() {
		return "DVD - Id: " + this.getId() + " - " + this.getTitle() + " - " + this.getCategory() + " - " + this.getDirector() + " - " + this.getLength() + " : " + this.getCost() + " $";
	}
	
	@Override
	public void play() throws PlayerException { 
		if(this.getLength()>0) {

			System.out.println("Playing DVD: " + this.getTitle()); 

			System.out.println("DVD length: " + this.getLength()); 
		}
		else 
			throw new PlayerException("ERROR: Track length is non-positive!");
	}
	
	


}