package gittest;

public class Country {

	private String name;
	private City capital;
	
	public Country(String name, City capital) {
		if (name == null || name.isEmpty()) { 
		    throw new IllegalArgumentException("Country name must not be null or empty"); 
		}
		this.name = name;
		this.capital = capital;
	}
	
	public String name() {
		return name;
	}
	
	public City capital() {
		return capital;
	}
	
	public String toString() {
		return name + ", capital is " + capital.name();
	}
}
