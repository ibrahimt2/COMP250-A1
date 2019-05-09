import java.lang.reflect.Array;
import java.util.ArrayList;

public class Basket {

	private ArrayList<MarketProduct> productArray;
	
	public Basket() {
		productArray = new ArrayList<MarketProduct>();
	}
	
	public ArrayList<MarketProduct> getProducts() {
		ArrayList<MarketProduct> placeHolderArray = new ArrayList<MarketProduct>(productArray);
		return placeHolderArray;
	}
	
	public void add(MarketProduct item) {
		productArray.add(item);
	}
	
	public boolean remove(MarketProduct item) {
		for (MarketProduct product : productArray) {
			if (item.equals(product)) {
				return true;
			}
		}
		
		return false;
	}
	
	public void clear() {
		productArray.clear();
	}
	
	public int getNumOfProducts() {
		return productArray.size();
	}
	
	public int getSubTotal() {
		int subTotal = 0;
		
		for (MarketProduct product : productArray) {
			subTotal += product.getCost();
		}
		
		return subTotal;
	}
	
	public int getTotalTax() {
		int taxableTotal = 0;
		for (MarketProduct product : productArray) {
			if (product instanceof Jam) {
				taxableTotal += product.getCost();
			}
		}
		
		return (int) (taxableTotal * 0.85);
	}
	
	public int getTotalCost() {
		return getSubTotal() + getTotalTax();
	}
	
	
	
	
	
	
	
}
