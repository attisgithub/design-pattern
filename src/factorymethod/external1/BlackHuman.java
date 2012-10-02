package factorymethod.external1;

import factorymethod.external1.Human;

public class BlackHuman implements Human {

	@Override
	public void getColor() {
		System.out.println("black");
	}

	@Override
	public void talk() {
		System.out.println("black people say");
	}

}
