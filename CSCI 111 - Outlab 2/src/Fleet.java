
public class Fleet {
	Ship ship1;
	Ship ship2;
	Ship ship3;
	Ship ship4;
	
	public Fleet(Ship inShip1, Ship inShip2, Ship inShip3, Ship inShip4){
		ship1 = inShip1;
		ship2 = inShip2;
		ship3 = inShip3;
		ship4 = inShip4;
	}
	
	public void deploy(){
		ship1.halfFuel();
		ship2.halfFuel();
		ship3.halfFuel();
		ship4.halfFuel();
	}
	
	public void reFuel(){
		ship1.refill();
		ship2.refill();
		ship3.refill();
		ship4.refill();
	}
	
	public void printSummary(){
		System.out.println("Ship1 name: "+ship1.getName()+"\nShip1 total fuel consumption: "+ship1.getTot()+" units");
		System.out.println("Ship2 name: "+ship2.getName()+"\nShip2 total fuel consumption: "+ship2.getTot()+" units");
		System.out.println("Ship3 name: "+ship3.getName()+"\nShip3 total fuel consumption: "+ship3.getTot()+" units");
		System.out.println("Ship4 name: "+ship4.getName()+"\nShip4 total fuel consumption: "+ship4.getTot()+" units");
	}
}
