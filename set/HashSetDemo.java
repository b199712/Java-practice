package set;

import java.util.*;

public class HashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> set=new HashSet<String>();
		Scanner scanner=new Scanner(System.in);
		System.out.println("Input name(input 'quit' to quit): ");
		while(true){
			System.out.print("# ");
			String input=scanner.next();
			if(input.equals("quit")){
				break;
			}
			set.add(input);
		}
		scanner.close();
		
		Iterator iterator=set.iterator();
		
		while(iterator.hasNext()){
			System.out.print(iterator.next()+" ");
		}
		System.out.println();
	}

}
