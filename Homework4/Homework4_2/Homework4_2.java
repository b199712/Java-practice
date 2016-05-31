
public class Homework4_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number1, number2, number3, result=0;
		
		Dice dice1=new Dice(6);
		Dice dice2=new Dice(6);
		Dice dice3=new Dice(6);
		
		while(true){
			number1=dice1.roll();
			number2=dice2.roll();
			number3=dice3.roll();
			
			result=check(number1, number2, number3);
			
			if(result>0){
				System.out.println(result);
				break;
			}
		
		}
	}
	
	public static int check(int number1, int number2, int number3){
		
		if(number1==number2){
			return number3;
		}else if(number1==number3){
			return number2;
		}else if(number2==number3){
			return number1;
		}
		
		return 0;
	}

}
