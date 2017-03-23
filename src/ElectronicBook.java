import java.util.Date;

public class ElectronicBook extends Book {
	public Date dateSent;

	public ElectronicBook (String title, Author author, Date dateSent) {
		super(title, author);
		this.dateSent = dateSent;
	}
	
	public int calculatePrice () {
		return 1;
	}
	
	public void transmit() {
		System.out.println(this.toString() + " was transmitted");
	}

	public String toString() {
		return super.toString() + " sent on " + dateSent;
	}
}
