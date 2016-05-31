package enumtest;

import static java.lang.System.out;

public class Game {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		play(Action.RIGHT);
//		play(Action.UP);
		
//		out.println(CountryCode.Taiwan.getCode());
//		out.println(Action.DOWN.ordinal());
		

	}
	
	public static void play(Action action){
		switch(action){
			case STOP:
				out.println("Play stop animation");
				break;
			case RIGHT:
				out.println("Play right animation");
				break;
			case LEFT:
				out.println("Play left animation");
				break;
			case UP:
				out.println("Play up animation");
				break;
			case DOWN:
				out.println("Play down animation");
				break;
		}
	}

}
