package hust.soict.dsai.aims.media;

import java.util.ArrayList;
import java.util.List;

public class Book extends Media {
	private List<String> authors = new ArrayList<String>();

	
	public Book(int id,String title, String category, float cost) {
		super(id, title, category, cost);
	}

	public Book(int id,String title, String category, ArrayList<String> authors, float cost) {
		super(id, title, category, cost);
		this.authors = authors;
	}
	
	public List<String> getAuthors() {
		return authors;
	}
	public void setAuthors(List<String> authors) {
		this.authors = authors;
	}
	
	public void addAuthor(String authorName) {
		if (authors.contains(authorName)) {
            
            System.out.println(authorName + " is already author of the book.");
        } else {
        	authors.add(authorName);
            System.out.println(authorName + " added as author of the book.");
        }
	}
	
	public void removeAuthor(String authorName) {
		if (authors.contains(authorName)) {
			authors.remove(authorName);
            System.out.println(authorName + " is remove from author of the book.");
        } else {
        	authors.add(authorName);
            System.out.println(authorName + " is not an author of the book.");
        }
		
	}
	
	@Override
	 public String toString() {
			return "Book - Id: " + this.getId() + " - " + this.getTitle() + " - " + this.getCategory() +" : " + this.getCost() + " $";
		}
}
