package factorymethod.external1;

public class Client {

	public static void main(String[] args) {
		Human whiteHuman = HumanFactory.getHuman(WhiteHuman.class);
		whiteHuman.getColor();
		whiteHuman.talk();
	}

}
