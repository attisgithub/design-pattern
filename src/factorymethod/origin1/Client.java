package factorymethod.origin1;

import factorymethod.external1.Human;
import factorymethod.external1.WhiteHuman;

public class Client {

	public static void main(String[] args) {
		AbstractFactory factory = new HumanFactory();
		Human whiteHuman = factory.getHuman(WhiteHuman.class);
		whiteHuman.getColor();
		whiteHuman.talk();
	}

}
