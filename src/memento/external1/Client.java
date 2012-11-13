package memento.external1;

public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Originator originator = new Originator();
		originator.setState("happy");
		System.out.println("The boy is "+ originator.getState() + " now");
		originator.createMemento();
		originator.setState("sad");
		System.out.println("The boy is "+ originator.getState() + " now");
		originator.restoreMemento();
		System.out.println("The boy is "+ originator.getState() + " now");
	}

}
