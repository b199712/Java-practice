package homework5;

public class Bicycle extends Transportation {
	
	Bicycle(){
		kind="bicycle";
	}

	@Override
	public void select() {
		// TODO Auto-generated method stub
		System.out.println("You pay "+price+" dollars, your transportation is "+kind);
		count++;
	}

}
