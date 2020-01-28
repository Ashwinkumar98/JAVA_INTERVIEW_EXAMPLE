package lambdaFunction;

public class Book {
	private long ISBN;
	private String name;
	private String author;
	private double rating;
	private String source;
	
	
	@Override
	public String toString() {
		return "Book [ISBN=" + ISBN + ", name=" + name + ", author=" + author + ", rating=" + rating + ", source="
				+ source + "]";
	}


	public Book(long iSBN, String name, String author, double rating, String source) {
		super();
		ISBN = iSBN;
		this.name = name;
		this.author = author;
		this.rating = rating;
		this.source = source;
	}
	
	
	public long getISBN() {
		return ISBN;
	}
	public void setISBN(long iSBN) {
		ISBN = iSBN;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public double getRating() {
		return rating;
	}
	public void setRating(double rating) {
		this.rating = rating;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	
}
