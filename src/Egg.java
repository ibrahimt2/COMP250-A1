public class Egg extends MarketProduct {

	private int numberOfEggs;
	private int pricePerDozen;
	
	public Egg (String name, int numberOfEggs, int pricePerDozen) {
		super(name);
		this.numberOfEggs = numberOfEggs;
		this.pricePerDozen = pricePerDozen;
	}
	
	public int getCost() {
		return numberOfEggs * (pricePerDozen / 12);
	}
	
	public boolean equals(Object object) {
		if (!(object instanceof Egg)) {
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
