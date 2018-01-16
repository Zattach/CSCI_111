
public class Book {
	String name;
	double val;
	int num;
	double tot;
	
	public Book(String nameIn, double valIn, int numIn){
		name = nameIn;
		val = valIn;
		num = numIn;
	}
	
	public String getName(){
		return name;
	}
	
	public double getVal(){
		return val;
	}
	
	public int getNum(){
		return num;
	}
	
	public double getTot(){
		tot = val * num;
		return tot;
	}
}
