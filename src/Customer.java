
public class Customer {

	private String name;
	private int balance;	//In cents
	private Basket Basket;
	
	public Customer(String name, int balance) {
		this.name = name;
		this.balance = balance;
		this.Basket = new Basket();
	}

	public String getName() {
		return name;
	}
	
	public int getBalance() {
		return balance;
	}
	
	public Basket getBasket() {
		return Basket;
	}
	
	public int addFunds(int credit) {
		
		if (credit < 0) {
			throw new IllegalArgumentException("You cannot add negative funds");
		}
		
		balance += credit;
		return balance;
	}
	
	public void addToBasket(MarketProduct item) {
		Basket.add(item);
	}
	
	public boolean removeFromBasket(MarketProduct item) {
		return Basket.remove(item);
	}
	
	public String checkOut() {
		if (balance < Basket.getTotalCost()) {
			throw new IllegalStateException("The balance is less than the total cost of purchase");
		}
		
		else {
			balance -= Basket.getTotalCost();
			String reciept = Basket.toString();
			Basket.clear();
			return reciept;
		}
	}
	
	
}