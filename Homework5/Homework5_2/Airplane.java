package homework5;

public class Airplane extends Transportation {

	Airplane(){
		kind="airplane";
	}

	@Override
	public void select() {
		// TODO Auto-generated method stub
		System.out.println("You pay "+price+" dollars, your transportation is "+kind);
		count++;
	}
}
