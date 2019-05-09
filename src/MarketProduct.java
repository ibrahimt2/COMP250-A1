
public abstract class MarketProduct {

	private String name;

	public MarketProduct(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}
	
	public abstract int getCost();
	
	public abstract boolean equals(Object object);
	
}
