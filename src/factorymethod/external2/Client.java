package factorymethod.external2;

public class Client {

	public static void main(String[] args) {
		Human whiteHuman = new WhiteHumanFactory().createHuman();
		whiteHuman.getColor();
		whiteHuman.talk();
	}

}
