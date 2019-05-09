
public class Fruit extends MarketProduct {

	private double weight;			//Weight in kilograms
	private int pricePerKilogram;	//Price in cents
	
	public Fruit(String name, double weight, int pricePerKilogram) {
		super(name);
		this.weight = weight;
		this.pricePerKilogram = pricePerKilogram;
	}
	
	public int getCost() {
		return (int) (weight * pricePerKilogram);
	}
	
	public boolean equals(Object object) {
		if (!(object instanceof Fruit)) {
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
