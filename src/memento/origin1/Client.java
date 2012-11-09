package memento.origin1;

public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Boy boy = new Boy();
		CareTaker careTaker = new CareTaker();
		boy.setState("happy");
		
		System.out.println("At first the boy is " + boy.getState());
		
		careTaker.setMemento(boy.createMemento());
		
		boy.changeState();
		
		System.out.println("Then the boy is " + boy.getState());
		boy.restore(careTaker.getMemento());
		
		System.out.println("At last the boy is " + boy.getState());
		
	}

}
