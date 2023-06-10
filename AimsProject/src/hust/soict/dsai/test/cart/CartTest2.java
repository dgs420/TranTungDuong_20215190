package hust.soict.dsai.test.cart;
import hust.soict.dsai.aims.media.*;
import java.util.*;

public class CartTest2 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Media> mediae  = new ArrayList<Media>();
		
//		.
		
		DigitalVideoDisc dvd =new DigitalVideoDisc("The Lion King","Animation","Roger Allers",87,19.95f) ;
	
		Book book = new Book(1, "Harry Potter", "Science Fiction", 9.9f);
        CompactDisc cd = new CompactDisc(1, "Nice", "Music", 11f, "What", "Nickelson");
//      cd.addTrack(new Track("abc", 20));
//		cd.addTrack(new Track("abc", 50));
        mediae.add(cd);
        mediae.add(dvd);
        mediae.add(book);
		
		for(Media m: mediae) {
			System.out.println(m.toString());
		}
	}

}
