
public class TesterClass {

	public static void main(String[] args) {
		
		Egg WholeBrownDozen = new Egg("12 Whole Brown Eggs", 12, 400);
		Egg WholeWhiteDozen = new Egg("12 Whole White Eggs", 12, 350);
		Egg LuxuryEggs = new Egg("Trump Eggs", 5, 1000);
		
		Customer C1 = new Customer("Ben", 10000);
		C1.addToBasket(WholeBrownDozen);
		C1.addToBasket(WholeBrownDozen);
		C1.addToBasket(LuxuryEggs);
		C1.addToBasket(WholeWhiteDozen);
		C1.removeFromBasket(WholeBrownDozen);
		
		System.out.println(C1.checkOut());
		
		System.out.println("\n\nThe customer " + C1.getName());
		System.out.println("has " + C1.getBalance() + " cents left.");
		
		
	}
}
