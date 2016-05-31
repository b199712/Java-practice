import java.util.Scanner;

public class homework2_2{
	public static void main(String[] args){
		int[][] numeric=new int[2][500];
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Please input a number:");
		int number=scanner.nextInt();
		scanner.close();
		
		if(number>0){
			for(int line=1;line<=number;line++){
				if(line>2){
					numeric[1][0]=1;
					numeric[1][line-1]=1;
				}

				for(int space=line;space<number;space++){
					System.out.print(" ");
				}
				
				for(int count=0;count<line;count++){
					if(line<3){
						System.out.print("1 ");
						numeric[0][count]=1;
					}else{
						if(count>0 && count<line-1){
							numeric[1][count]=numeric[0][count-1]+numeric[0][count];
						}
						System.out.print(numeric[1][count]+" ");
					}
					
				}			
				if(line>2){
					System.arraycopy(numeric[1],0,numeric[0],0,line);
				}
				System.out.println("");
			}
		}else{
			System.out.println("Input a wrong number.");
		}
	}
}