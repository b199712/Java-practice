package homework5;

public class Car extends Transportation {

	Car(){
		kind="car";
	}

	@Override
	public void select() {
		// TODO Auto-generated method stub
		System.out.println("You pay "+price+" dollars, your transportation is "+kind);
		count++;
	}
}
