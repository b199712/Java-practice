package list;

import java.util.*;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner=new Scanner(System.in);
		ArrayList<String> list=new ArrayList<String>();
		System.out.println("Input name(input 'quit' to quit): ");
		while(true){
			System.out.print("# ");
			String input=scanner.next();
			if(input.equals("quit")){
				break;
			}
			list.add(input);
		}
		scanner.close();
		
		System.out.println("Show input: ");
		
		for(int i=0; i<list.size(); i++){
			System.out.print(list.get(i)+" ");
		}
		System.out.println();
		
		for(String s : list){
			System.out.print(s+" ");
		}
		System.out.println();
		
		Iterator<String> iterator=list.iterator();
		while(iterator.hasNext()){
			System.out.print(iterator.next()+" ");
		}
		System.out.println();
	}

}
