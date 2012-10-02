package abstractfactory.origin1;

public class Client {

	public static void main(String[] args) {
		
		HumanFactory maleHumanFactory = new MaleHumanFactory();
		Human blackHuman = maleHumanFactory.createBlackHuman();
		blackHuman.getColor();
		blackHuman.getSex();
		blackHuman.talk();

	}

}
