
public class Magazine extends Book {
	Publisher publisher;

	public Magazine (String title, Author author, Publisher publisher) {
		super(title, author);
		this.publisher = publisher;
	}
	
	public int calculatePrice () {
		return super.calculatePrice() * 12;
	}

	public String toString() {
		return super.toString() + " published by " + publisher;
	}
}
