package aimsp;

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
}
