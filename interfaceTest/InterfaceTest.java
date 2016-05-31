package interfaceTest;

public class InterfaceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		doSwim(new Human());
		doSwim(new Shark("a"));
	}
	
    static void doSwim(Swimmer swimmer) {
        swimmer.swim();
    }

}
