package gittest;

public class Country {

	private String name;
	private City capital;
	
	public Country(String name, City capital) {
		this.name = name;
		this.capital = capital;
	}
	
	public String name() {
		return name;
	}
	
	public String toString() {
		return name + ", capital is " + capital.name();
	}
}
