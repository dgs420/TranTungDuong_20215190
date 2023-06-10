package hust.soict.dsai.aims.cart;
import java.util.Collections;
import hust.soict.dsai.aims.media.*;
import java.util.ArrayList;

public class Cart {
	
	public static final int MAX_NUMBER_ORDERED = 20;
	private ArrayList<Media> itemsOrdered = new ArrayList<Media>();


	public void print() {
		System.out.println("***********************CART***********************");
		System.out.println("Ordered Items:");
		
		for (int i = 1; i<=itemsOrdered.size(); i++) {
			System.out.println(i+". - "+itemsOrdered.get(i-1).toString());
			}
		
		System.out.println("Total cost: "+this.totalCost());
	}
	
	public void addMedia(Media media) {
		if (itemsOrdered.size() < MAX_NUMBER_ORDERED) {
			itemsOrdered.add(media);
			System.out.println("Item added");
		}
		else
			System.out.println("Your art is full");
		
    }

    // Add the removeMedia() method
	public void removeMedia(Media media) {
		if (itemsOrdered.isEmpty()) {
			System.out.println("Your cart is empty!");
		}
		else if (!itemsOrdered.contains(media)) {
			System.out.println("This item is not in your cart");
		}
		else {
			itemsOrdered.remove(media);
			System.out.println("Item removed");
		}
	}
	
	public float totalCost() {
        float total = 0.0f;
        for (Media media : itemsOrdered) {
            total += media.getCost();
        }
        return total;
    }
	
	
	public void sortByTitle() {
        Collections.sort(itemsOrdered, Media.COMPARE_BY_TITLE_COST);
    }

    public void sortByCost() {
        Collections.sort(itemsOrdered, Media.COMPARE_BY_COST_TITLE);
    }

	public void searchById(int id) {
		boolean found=false;
 
        	for (int i = 1; i<=itemsOrdered.size(); i++) {
        		if (itemsOrdered.get(i-1).getId()==id) {
        			System.out.println("Media with matching ID: " + itemsOrdered.get(i-1).toString());
        			found=true;
            	}
        }
        	if(!found)
        		System.out.println("No Item with matching ID found");
		}

        
 	 
	 public void searchByTitle(String title) {
	        boolean found=false;
	        System.out.println("Matching DVDs for the title: ");
	        for (int i = 1; i<=itemsOrdered.size(); i++) {
	            if (itemsOrdered.get(i-1).getTitle().equals(title)) {
	            	System.out.println("Item with matching title: " + itemsOrdered.get(i-1).toString());
	            	found=true;
	            	}
	            }
	        if(!found)
        		System.out.println("No item with matching title found");
	        }
	 
	 public void makeEmpty() {
	    	itemsOrdered.clear();
	    }
	 
	 public Media findByTitle(String title) {
	    	for (Media media : itemsOrdered) {
				if (media.getTitle().equals(title))
					return media;
			}
			return null;
	    }
	 
	 }	 

