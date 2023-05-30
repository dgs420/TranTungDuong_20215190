package hust.soict.dsai.aims.store;

import hust.soict.dsai.aims.disc.DigitalVideoDisc;

public class Store {
    private DigitalVideoDisc[] itemsInStore;
    private int num;

    public Store(int capacity) {
        itemsInStore = new DigitalVideoDisc[capacity];
        num = 0;
    }

    public void addDVD(DigitalVideoDisc disc) {
    	if (num < itemsInStore.length) {
			itemsInStore[num] = disc;
			num ++;
			System.out.println("Disc added to store");
		}
		else {
			System.out.println("Your store is full!");
		}
    }

    public void removeDVD(DigitalVideoDisc disc) {
    	if (num==0) {
			System.out.println("Your store is empty!");
			return;
		}
		else {
			for (int i=0; i<num; i++) {      
				if (itemsInStore[i] == disc) {       
					for (int j=i; j<num-1; j++) {
						itemsInStore[j] = itemsInStore[j+1];
					}
					itemsInStore[num-1] = null;
					num--;
					System.out.println("Disc removed from store");
					return;
				}
			}
			System.out.println("Disc not found");
		}
    }
    
  
}
