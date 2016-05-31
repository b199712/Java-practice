import java.util.Random;

public class Dice {
	
	private int side;
	
	Dice(int side){
		this.side=side;
	}
	
	public int roll(){
		
		Random ran = new Random();
		
		return (ran.nextInt(side)+1);
	}
}
