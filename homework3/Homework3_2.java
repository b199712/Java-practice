
public class Homework3_2 {
	public static void main(String[] args){
		System.out.println(CheckValue(1111,1398));
	}
	
	public static int CheckValue(int num1, int num2){
		int count=0;
		int[][] num=new int[2][4];
		int[][] check=new int[2][10];
		
		num[0]=Separate(num1);
		num[1]=Separate(num2);
		check[0]=NumCount(num[0]);
		check[1]=NumCount(num[1]);
		
		for(int i=0;i<10;i++){

			if(i<4){
				if(check[0][num[0][i]]<2 && check[1][num[1][i]]<2){
					check[0][num[0][i]]+=1;
					check[1][num[1][i]]+=1;
				}else{
					return 0;
				}
				if(num[0][i]==num[1][i]){
					count-=1;
				}
			}
			if(check[0][i]>0 && check[1][i]>0){
				count+=1;
			}
		}
		
		return count;
	}
	
	public static int[] Separate(int num){
		int[] number=new int[4];
		
		number[0]=(num/1000)%10;
		number[1]=(num/100)%10;
		number[2]=(num/10)%10;
		number[3]=(num/1)%10;

		return number;
	}
	
	public static int[] NumCount(int num[]){
		int[] number=new int[10];
		
		for(int i=0;i<4;i++){
			number[num[i]]=1;
		}
		
		return number;
	}
}
