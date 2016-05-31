package homework5;

public class Rocket extends Transportation {

	Rocket(){
		kind="rocket";
	}

	@Override
	public void select() {
		// TODO Auto-generated method stub
		System.out.println("You pay "+price+" dollars, your transportation is "+kind);
		count++;
	}
}
