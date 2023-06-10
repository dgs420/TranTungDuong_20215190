package hust.soict.dsai.aims.store;

import hust.soict.dsai.aims.media.*;
import java.util.ArrayList;

public class Store {
	private ArrayList<Media> itemsInStore = new ArrayList<Media>();
    private int capacity;

//    public Store(int capacity) {
//        itemsInStore = new DigitalVideoDisc[capacity];
//        num = 0;
//    }
//    
//    public void addMedia(Media media) {
//    	 itemsInStore.add(media);
//    }
//    
//    public void removeMedia(Media media) {
//   	 itemsInStore.remove(media);
   public Store(int capacity) {
       this.capacity = capacity;
   }
   
   public void print() {
		System.out.println("\n***********************STORE***********************");
		System.out.println("Items available in store:");
		for (int i=1; i<=itemsInStore.size(); i++) {
			System.out.println(i + ". " + itemsInStore.get(i-1).toString());
		}
		System.out.println("***************************************************");
	}
   
   public void addMedia(Media media) {
		if (itemsInStore.size() < capacity) {
			itemsInStore.add(media);
			System.out.println("Item added");
		}
		else {
			System.out.println("Your store is full!");
		}
	}
	
	public void removeMedia(Media media) {
		if (itemsInStore.isEmpty()) {
			System.out.println("Your store is empty!");
		}
		else if (!itemsInStore.contains(media)) {
			System.out.println("Media is not found in your store");
		}
		else {
			itemsInStore.remove(media);
			System.out.println("Item removed");
		}
	}
	
	public Media searchByTitle(String title) {
		for (Media media : itemsInStore) {
			if (media.getTitle().equals(title))
				return media;
		}
		return null;
	}

//    public void addDVD(DigitalVideoDisc disc) {
//    	if (num < itemsInStore.length) {
//			itemsInStore[num] = disc;
//			num ++;
//			System.out.println("Disc added to store");
//		}
//		else {
//			System.out.println("Your store is full!");
//		}
//    }
//
//    public void removeDVD(DigitalVideoDisc disc) {
//    	if (num==0) {
//			System.out.println("Your store is empty!");
//			return;
//		}
//		else {
//			for (int i=0; i<num; i++) {      
//				if (itemsInStore[i] == disc) {       
//					for (int j=i; j<num-1; j++) {
//						itemsInStore[j] = itemsInStore[j+1];
//					}
//					itemsInStore[num-1] = null;
//					num--;
//					System.out.println("Disc removed from store");
//					return;
//				}
//			}
//			System.out.println("Disc not found");
//		}
//    }
    
  
}
