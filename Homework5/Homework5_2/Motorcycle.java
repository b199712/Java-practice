package homework5;

public class Motorcycle extends Transportation {

	Motorcycle(){
		kind="motorcycle";
	}

	@Override
	public void select() {
		// TODO Auto-generated method stub
		System.out.println("You pay "+price+" dollars, your transportation is "+kind);
		count++;
	}
}
