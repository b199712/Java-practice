package generic.test1;

import java.util.*;
import java.util.List;

public class GenericTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		GenericAll<String, String> GS=new GenericAll<>();
		GenericAll<String, Integer> GI=new GenericAll<>();
		GS.setKey("one");
		GS.setValue("one");
		System.out.println("Key: "+GS.getKey()+", Value: "+GS.getValue());
		
		GI.setKey("one");
		GI.setValue(1);
		System.out.println("Key: "+GI.getKey()+", Value: "+GI.getValue());
		
		GenericGenerate GG=new GenericGenerate();
		GG.setValue("123456");
		System.out.println(GG.getValue());
		
		out("Sting");
		out(1);
		out(1.23456789);
		
		MOut("String", 1, 1.23456789);
		MOut("String", 1);
		MOut("String");
		MOut();
		
		ArrayList<String> arrLt=GenericTest.asList("a","b","c","d");
		

		GenericAll a=new GenericAll();
		
		a.setKey("first");
		a.setValue(1);
		System.out.println("KEY: "+a.getKey()+", VALUE: "+a.getValue());
		
		Generic<?> f=new Generic<LinkedList>();
		
	}
	
	public static <T> void out(T t){
		System.out.println(t);
	}
	
	public static <T> void MOut(T... t){
		System.out.print("Length: "+t.length+", Content: ");
		for(T tmp : t){
			System.out.print(tmp+" ");
		}
		System.out.println();
	}
	
	public static <T> ArrayList<T> asList(T... a){
		ArrayList<T> arrLt=new ArrayList<>();
		for(T t : a){
			arrLt.add(t);
		}
		return arrLt;
	}
}