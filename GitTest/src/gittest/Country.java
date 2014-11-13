package gittest;

public class Country {

	private String name;
	private City capital;
	private Continent continent;
<<<<<<< HEAD
	private int population;
=======
	private int pop;
>>>>>>> branch 'master' of https://github.com/friday11/Playground.git
	
<<<<<<< HEAD
	public Country(String name, City capital, Continent continent, int population) {
=======
	public Country(String name, City capital, Continent continent, int pop) {
>>>>>>> branch 'master' of https://github.com/friday11/Playground.git
		if (name == null || name.isEmpty()) { 
		    throw new IllegalArgumentException("Country name must not be null or empty"); 
		}
		if (capital == null) { 
			throw new IllegalArgumentException("Capital must not be null"); 
		}
		this.name = name;
		this.capital = capital;
		this.continent = continent;
<<<<<<< HEAD
		this.population = population;
=======
		this.pop = pop;
>>>>>>> branch 'master' of https://github.com/friday11/Playground.git
	}
	
	public String name() {
		return name;
	}
	
	public City capital() {
		return capital;
	}
	
	public Continent continent() {
		return continent;
	}
	
	public String toString() {
		return name + "(" + continent + "), capital is " + capital.name();
	}
}
