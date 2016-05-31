import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Homework3_1 {
	public static void main(String[] args){
		int randomTemp=0;
		int number=0;
		int[][] randomNum=new int[1][500];
		Random ran = new Random();
		Scanner scanner=new Scanner(System.in);
		try{
			number=scanner.nextInt();
		}catch(InputMismatchException e){
			System.out.println("Must input an integer.");
		}
		scanner.close();
		
		if(number>0){
			for(int i=0;i<number;i++){
				randomTemp=ran.nextInt(number)+1;
				if(randomNum[0][randomTemp-1]==0){
					//randomNum[1][randomTemp-1]=randomTemp;
					System.out.println(randomTemp+" ");
					randomNum[0][randomTemp-1]=1;
				}else{
					i--;
				}
				randomTemp=0;
			}
		}
	}
}
