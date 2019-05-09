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
	
	public ArrayList<MarketProduct> getBasketArray() {
		return productArray;
	}
	
	public void add(MarketProduct item) {
		productArray.add(item);
	}
	
	public boolean remove(MarketProduct item) {
		int i = 0;
		for (MarketProduct product : productArray) {
			if (item.equals(product)) {
				productArray.remove(i);
				return true;
			}
			i++;
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
	
	public String toString() {
		String overallString = "";
		
		for (MarketProduct product : productArray) {
			String temp = (product.getName() + "    " + toDollars(product.getCost()) + "\n");
			overallString += temp;
		}
		
		overallString += ("\nSubtotal:  " + toDollars(getSubTotal()) + "\nTax: " + toDollars(getTotalTax()) + "\n\nTotal: " + toDollars(getTotalCost()));
		return overallString;
	}
	
	public double toDollars(int cents) {
		return ((double) cents) / 100;
	}
	
}
