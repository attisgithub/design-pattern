package adapter.origin1;

public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Target target1 = new ConcreteTarget();
		target1.request();
		
		Target target2 = new Adapter();
		target2.request();
	}

}
