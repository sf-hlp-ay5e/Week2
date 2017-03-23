
public class Author {
	String firstName;
	String lastName;
	String city;
	
	public Author (String firstName, String lastName, String city) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.city = city;
	}

	public String toString() {
		return firstName + " " + lastName;
	}
}
