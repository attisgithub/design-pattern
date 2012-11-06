package observer.origin1;

public class Lisi implements Observer{

	@Override
	public void update(Object context) {
		System.out.println("Lisi is dicovering something");
	}

}
