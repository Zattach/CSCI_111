
public class Player {
	String name;
	int rounds;
	int score;
	double avg;
	
	public Player(String inName){
		name = inName;
	}
	
	public void setRounds(int inRounds){
		rounds = inRounds;
	}
	
	public void setScore(int inScore){
		score = inScore;
	}
	
	public int getRounds(){
		return rounds;
	}
	
	public int getScore(){
		return score;
	}
	
	public double getAvg(){
		avg = ((double) score) / rounds;
		return avg;
	}
	
	public void print(){
		getAvg();
		System.out.println("    "+name+" ---> # Rounds: "+rounds+", Score: "+score+", Round Average: "+avg);
	}
}
