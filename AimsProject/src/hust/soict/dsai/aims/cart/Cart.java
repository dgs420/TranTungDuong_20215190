package hust.soict.dsai.aims.cart;

import hust.soict.dsai.aims.disc.DigitalVideoDisc;

public class Cart {
	
	public static final int MAX_NUMBER_ORDERED = 20;
	private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBER_ORDERED];
	private int qtyOrdered=0;

	public void addDigitalVideoDisc(DigitalVideoDisc dvd) {
		if(qtyOrdered<MAX_NUMBER_ORDERED) {
			itemsOrdered[qtyOrdered] = dvd;
			qtyOrdered ++;
			if(qtyOrdered<MAX_NUMBER_ORDERED) 
				System.out.println("The disc has been added");				
			else
				System.out.println("The cart is almost full");

		}
		else {
			System.out.println("Cart is full!");
			return;
		}
	
	}
	
	public void printDigitalVideoDisc() {
		System.out.println("***********************CART***********************");
		System.out.println("Ordered Items:");
		for (int i = 0; i<qtyOrdered; i++) {
			System.out.println(i+". - "+itemsOrdered[i].getTitle()+" - "+itemsOrdered[i].getDirector()+" - "+itemsOrdered[i].getLength()+": "+itemsOrdered[i].getCost());
		}
		System.out.println("Total cost: "+this.totalCost());
	}
	public void addDigitalVideoDisc(DigitalVideoDisc [] dvdList) {
		if(qtyOrdered + dvdList.length <= MAX_NUMBER_ORDERED) {
			for (int i = 0; i<dvdList.length; i++) {
				itemsOrdered[qtyOrdered] = dvdList[i];
				qtyOrdered++;
			}
			System.out.println("Discs added");
		}
		else {
			System.out.println("Cart is full!");
		}
	}
	
	public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
		if(qtyOrdered==0) {
			System.out.println("No disc to remove");
			return;
			}
		else 
			for(int i = 0; i < qtyOrdered; i++)
				if(itemsOrdered[i]==disc) {
				
					for ( int j=i;j<qtyOrdered-1;j++) {
						itemsOrdered[j]=itemsOrdered[j+1];
					}
					itemsOrdered[qtyOrdered-1]=null;
					qtyOrdered--;
					System.out.println("Disc removed");
					return;
				}
		        System.out.println("Disc not found!");

	}
	
	public float totalCost() {
		float cost = 0;
		for(int i = 0; i < qtyOrdered; i++) {
			cost += itemsOrdered[i].getCost();
		}
		return cost;
		
	}

	public void searchById(int id) {
		boolean found=false;
 
        	for (int i = 0; i < qtyOrdered; i++) {
        		if (itemsOrdered[i].getId()==id) {
        			System.out.println("DVD with matching ID: " + itemsOrdered[i].getId()+"."+itemsOrdered[i].getTitle());
        			found=true;
            	}
        }
        	if(!found)
        		System.out.println("No DVD with matching ID found");
		}

        
 	 
	 public void searchByTitle(String title) {
	        boolean found=false;
	        System.out.println("Matching DVDs for the title: ");
	        for (int i = 0; i < qtyOrdered; i++) {
	            if (itemsOrdered[i].isMatch(title)) {
	            	System.out.println(itemsOrdered[i].getId()+"."+itemsOrdered[i].getTitle());
	            	found=true;
	            	}
	            }
	        if(!found)
        		System.out.println("No DVD with matching title found");
	        }
	 
	 
	 }	 

