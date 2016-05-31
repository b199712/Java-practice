package list;

import java.util.*;

public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		LinkedList<String> list=new LinkedList<String>();
		System.out.println("Input name(input 'quit' to quit): ");
		while(true){
			System.out.print("# ");
			String input=scanner.next();
			if(input.equals("quit")){
				break;
			}
			list.addFirst(input);
		}
		scanner.close();
		
		System.out.println("Show input: ");

		while(!list.isEmpty()){
			//System.out.print(list.getFirst()+" ");
			System.out.print(list.removeFirst()+" ");
		}
		System.out.println();
	}

}
