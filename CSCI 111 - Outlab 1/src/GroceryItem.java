
public class GroceryItem {
	public String name;
	public double cost;
	public int aisleNum;
	
	public GroceryItem(String nameIn, double costIn, int aisleNumIn){
		name = nameIn;
		cost = costIn;
		aisleNum = aisleNumIn;
	}
	
	public String getName(){
		return name;
	}
	
	public double getCost(){
		return cost;
	}
	
	public int getAisle(){
		return aisleNum;
	}
	
	public void changeCost(double newCost){
		cost = newCost;
	}
}
