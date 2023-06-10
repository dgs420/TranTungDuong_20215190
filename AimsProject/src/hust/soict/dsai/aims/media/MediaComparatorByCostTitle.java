package hust.soict.dsai.aims.media;

import java.util.Comparator;

public class MediaComparatorByCostTitle implements Comparator<Media>{

	public int  compare(Media media1, Media media2) {
		// TODO Auto-generated constructor stub
        // Compare by cost first
        int costComparison = Float.compare(media2.getCost(), media1.getCost());

        // If the cost is the same, compare by title
        if (costComparison == 0) {
            return media1.getTitle().compareTo(media2.getTitle());
        }

        return costComparison;

	}

}
