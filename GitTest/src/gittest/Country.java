package gittest;

public class Country {

	private String name;
	private City capital;
	private Continent continent;
	
	public Country(String name, City capital, Continent continent) {
		if (name == null || name.isEmpty()) { 
		    throw new IllegalArgumentException("Country name must not be null or empty"); 
		}
		if (capital == null) { 
			throw new IllegalArgumentException("Capital must not be null"); 
		}
		this.name = name;
		this.capital = capital;
		this.continent = continent;
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
