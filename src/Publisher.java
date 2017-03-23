
public class Publisher {
	String name;
	String address;
	
	public Publisher (String name, String address) {
		this.name = name;
		this.address = address;
	}

	public String toString() {
		return name + " at " + address;
	}
}
