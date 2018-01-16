
public class Ship {
	String name;
	int fuelCap;
	int fuelCur;
	int fuelTot;
	
	public Ship(String inName, int inFuelCap){
		name = inName;
		fuelCap = inFuelCap;
		fuelCur = inFuelCap;
	}
	
	public String getName(){
		return name;
	}
	
	public int getTot(){
		return fuelTot;
	}
	
	public void halfFuel(){
		fuelCur = fuelCur / 2;
		fuelTot += fuelCur;
	}
	
	public void refill(){
		fuelCur = fuelCap;
	}
}
