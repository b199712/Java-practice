package homework5;

public class Homework5_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal[] all={new Dog(), new Human(), new Bird()};
		for(int i=0;i<all.length;i++){
			all[i].move();
		}
	}

}
