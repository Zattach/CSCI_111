
public class Cart {
	String name;
	GroceryItem item1;
	int num1;
	double price1;
	GroceryItem item2;
	int num2;
	double price2;
	double sub;
	double tax;
	double tot;
	
	public Cart(String nameIn){
		name = nameIn;
	}
	
	public void addItem1(GroceryItem itemN, int num){
		item1 = itemN;
		num1 = num;
		itemN.changeStock(num);
		price1 = item1.getCost() * num1;
	}
	
	public void addItem2(GroceryItem itemN, int num){
		item2 = itemN;
		num2 = num;
		itemN.changeStock(num);
		price2 = item2.getCost() * num2;
	}
	
	public void printReceipt(){
		sub = price1 + price2;
		tax = sub * .07;
		tot = tax + sub;
		System.out.println("Shopper name: "+name+"\n----------------------\n"+item1.getName()+": "+num1+" units at $"+item1.getCost()+" per unit = $"+price1);
		System.out.println(item2.getName()+": "+num2+" units at $"+item2.getCost()+" per unit = $"+price2);
		System.out.println("    ----> Subtotal = $"+sub+"\n    ----> 7% tax = $"+tax+"\n    ----> Total = $"+tot);
		System.out.println("\n");
	}
}
