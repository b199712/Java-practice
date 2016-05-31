
public class Dog extends Animal{

	private String name;
	private String breed;
	
	Dog(String birthday, String name, String breed){
		super(birthday);
		this.name=name;
		this.breed=breed;
	}

	public void Speak(){
		System.out.println("I'm "+this.name);
		System.out.println("My breed is "+this.breed);
	}
}
