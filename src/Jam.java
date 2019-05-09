public class Jam extends MarketProduct {

	private int numberOfJars;
	private int pricePerJar;	//In cents
	
	public Jam(String name, int numberOfJars, int pricePerJar) {
		super(name);
		this.numberOfJars = numberOfJars;
		this.pricePerJar = pricePerJar;
	}
	
	public int getCost() {
		return numberOfJars * pricePerJar;
	}
	
	public boolean equals(Object object) {
		if (!(object instanceof Jam)) {
			return false;
		}
		
		if (this.getName() != ((MarketProduct) object).getName()) {
			return false;
		}
		
		if (this.getCost() != ((MarketProduct) object).getCost()) {
			return false;
		}
		
		return true;
	}
}

