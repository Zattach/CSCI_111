/**
 * GroceryItem Inlab.
 */
public class GroceryItem
{
    private String name;        //item name
    private double cost;        //cost of 1 unit of item
    private int stock;
    
    // constructor for GroceryItems
    public GroceryItem(String inName, double inCost, int inStock)
    {
        name = inName;
        cost = inCost;
        stock = inStock;
    }
    
    // returns the item's name
    public String getName()
    {
        return name;
    }
    
    // returns the cost of 1 item
    public double getCost()
    {
        return cost;
    }
    
    public int getStock(){
    	return stock;
    }
    
    public void changeStock(int var){
    	stock = stock - var;
    }
}