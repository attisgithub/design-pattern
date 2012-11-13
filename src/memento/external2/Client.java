package memento.external2;

import java.util.Date;

public class Client {

	public static void main(String[] args) throws InterruptedException {

		Originator originator = new Originator();
		CareTaker careTaker = new CareTaker();

		originator.setState1("china");
		originator.setState2(3);
		originator.setState3(new Date());

		System.out.println(originator);

		Thread.sleep(3000);

		careTaker.setMemento(originator.createMemento());

		originator.setState1("program");
		originator.setState2(1);
		originator.setState3(new Date());

		System.out.println(originator);

		originator.restoreMemento(careTaker.getMemento());

		System.out.println(originator);

	}

}
