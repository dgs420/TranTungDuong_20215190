package hust.soict.dsai.aims.media;

import java.util.Comparator;

public class MediaComparatorByTitleCost implements Comparator<Media> {

	public int  compare(Media media1, Media media2) {
		// TODO Auto-generated constructor stub
        // Compare by title first
        int titleComparison = media1.getTitle().compareTo(media2.getTitle());
        // If the tile is the same, compare by cost
        if (titleComparison == 0) {
            return  Float.compare(media2.getCost(), media1.getCost());
        }

        return titleComparison;

	}

}
