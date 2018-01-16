
public class Team {
	String name;
	Player p1;
	Player p2;
	Player p3;
	Player p4;
	
	public Team(String inName, Player inP1, Player inP2, Player inP3, Player inP4){
		name = inName;
		p1 = inP1;
		p2 = inP2;
		p3 = inP3;
		p4 = inP4;
	}
	
	public void printStats(){
		int roundsTot = p1.getRounds()+p2.getRounds()+p3.getRounds()+p4.getRounds();
		int scoreTot = p1.getScore()+p2.getScore()+p3.getScore()+p4.getScore();
		double avgTot = (p1.getAvg()+p2.getAvg()+p3.getAvg()+p4.getAvg()) / 4;
		System.out.println(name+":\n  Number of Rounds: "+roundsTot+"\n  Total Score: "+scoreTot+"\n  Round Average: "+avgTot+"\n  Players:");
		p1.print(); p2.print(); p3.print(); p4.print();
	}
}
