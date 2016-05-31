package generic.test2;

public class CovarianceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node<Apple> apple1=new Node<>(new Apple(), null);
		Node<Apple> apple2=new Node<>(new Apple(), apple1);
		Node<Apple> apple3=new Node<>(new Apple(), apple2);
		
		Node<Banana> banana1=new Node<>(new Banana(), null);
		Node<Banana> banana2=new Node<>(new Banana(), banana1);
		
		printlnForEach(apple3);
		printlnForEach(banana2);
		
		Node<Fruit> fruit=new Node<>(new Fruit(), null);
		Node<? super Apple> node=fruit;
		printlnForEach(fruit);
	}
	
	static void printlnForEach(Node<? extends Fruit> n){ //<?>equals<? extends Object>
		Node<? extends Fruit> node=n;
		do{
			System.out.println(node.value);
			node=node.next;
		}while(node!=null);
	}

}
