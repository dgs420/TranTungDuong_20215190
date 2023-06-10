package hust.soict.dsai.aims.media;

public class Disc extends Media{
	private String director;
	private int length;

	public Disc() {
		// TODO Auto-generated constructor stub
	}
	public Disc(int id,String title) {
		super(id, title);
	}
	
	public Disc(int id, String title, String category, float cost) {
		super(id, title, category, cost);
	}
	
	public Disc(int id,String title, String category, float cost, String director) {
		super(id,title,category,cost);
		this.director = director;

	}
	
	public Disc(int id,String title, String category, float cost,int length) {
		super(id,title,category,cost);
		this.length = length;
	}
	
	public Disc(int id,String title, String category, float cost,String director,int length) {
		super(id,title,category,cost);
		this.director = director;
		this.length = length;
	}
	
	public String getDirector() {
		return director;
	}
	public int getLength() {
		return length;
	}
}
