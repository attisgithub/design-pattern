package adapter.external1;

public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Adaptee1 adaptee1 = new Adaptee1();
		Adaptee2 adaptee2 = new Adaptee2();
		Adapter adapter = new Adapter();
		adapter.setAdaptee1(adaptee1);
		adapter.setAdaptee2(adaptee2);
		
		adapter.doFirstThing();
		adapter.doSecondThing();

	}

}
