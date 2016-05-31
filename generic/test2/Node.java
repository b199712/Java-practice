package generic.test2;

import java.util.LinkedList;
import java.util.List;

public class Node<T> {
	public T value;
	public Node<T> next;
	
	public Node(T value, Node<T> next){
		this.value=value;
		this.next=next;
	}
	
	public static void main(String[] args) {
		List<Fruit> fruitSeasonList=new LinkedList<>();
		fruitSeasonList.add(new Apple());
	}
	
}

class Fruit{
	int price;
	int weight;
	Fruit(){}
	Fruit(int price, int weight){
		this.price=price;
		this.weight=weight;
	}
}

class Apple extends Fruit{
	Apple(){}
	Apple(int price, int weight){
		super(price, weight);
	}	
	
	public String toString(){
		return "Apple";
	}
}

class Banana extends Fruit{
	Banana(){}
	Banana(int price, int weight){
		super(price, weight);
	}
	
	public String toString(){
		return "Banana";
	}
}
