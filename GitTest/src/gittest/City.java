package gittest;

public class City {

	private String name;
	private Country country;
	
	public City(String name, Country country) {
		if (name == null || name.isEmpty()) { 
		    throw new IllegalArgumentException("City name must not be null or empty"); 
		}
		if (country == null) {
			throw new IllegalArgumentException("Country must not be null");
		}
		this.name = name;
		this.country = country;
	}
	
	public String name() {
		return name;
	}
	
	public Country country() {
		return country;
	}
	
	public  boolean isCapital() {
		return country.capital().name().equals(name);
	}
	
	public String toString() {
		if (isCapital()) {
			return name + ", capital of " + country().name();
		} else {
			return name + ", " + country().name();
		}
	}
}
