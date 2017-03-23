import java.util.ArrayList;
import java.util.Date;


public class Shop {

	public static void main(String[] args) {
		ArrayList<Author> authors = new ArrayList<Author>(3);

		authors.add(new Author("Dave", "Poindexter", "Bloomington, IL"));
		authors.add(new Author("Max", "Frazier", "Richardson, TX"));
		authors.add(new Author("Srikanth", "Chalasani", "Bloomington, IL"));

		ArrayList<Publisher> publishers = new ArrayList<Publisher>(3);
		
		publishers.add(new Publisher("O'Reilly Media, Inc.", "1005 Gravenstein Hwy North, Sebastopol, CA"));
		publishers.add(new Publisher("Sun Microsystems, Inc.", "4150 Network Circle, Santa Clara, CA"));
		publishers.add(new Publisher("Family Health Publications", "1001 W 17th St., Suite M, Costa Mesa, CA"));
		
		ArrayList<Book> books = new ArrayList<Book>(6);
		
		books.add(0, new Magazine("Programmer's Quarterly", authors.get(1), publishers.get(1)));
		books.add(1, new Magazine("Nutrition Digest", authors.get(2), publishers.get(2)));
		books.add(2, new Book("Perl Programming", authors.get(0)));
		books.add(3, new Book("Java Programming", authors.get(1)));
		books.add(4, new ElectronicBook("Java Reference Manual", authors.get(1), new Date(1490277600000L)));
		Date birthday = new Date();
		books.add(5, new ElectronicBook("Perl Reference Manual", authors.get(0), new Date(358434000000L)));
		
		int total = 0;
		int price;
		
		for (Book book : books) {
			price = book.calculatePrice();
			System.out.println ("$" + price + ": " + book);
			total += price;
		}
		System.out.println ();
		System.out.println ("$" + total + ": Total for all books");
	}

}
