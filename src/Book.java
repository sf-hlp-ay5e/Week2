
public class Book {
	String title;
	Author author;

	public Book (String title, Author author) {
		this.title = title;
		this.author = author;
	}
	
	public int calculatePrice () {
		return author.firstName.length() + author.lastName.length();
	}

	public String toString() {
		return title + " written by " + author;
	}
}
