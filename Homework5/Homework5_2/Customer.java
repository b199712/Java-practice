package homework5;

import java.util.Random;

public class Customer {
	
	public int price(){
		Random ran = new Random();
		return ran.nextInt(199900)+100;
	}
}
