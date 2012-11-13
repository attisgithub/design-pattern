package memento.external3;

public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		CareTaker careTaker = new CareTaker();

		Originator originator = new Originator();
		originator.setState("1");
		print(originator);

		careTaker.setRegister("1", originator.createMemento());
		
		originator.setState("2");
		print(originator);
		
		careTaker.setRegister("2", originator.createMemento());
		
		
		originator.setState("3");
		print(originator);
		
		originator.restoreMemento(careTaker.getRegister("1"));
		print(originator);
		
		originator.restoreMemento(careTaker.getRegister("2"));
		print(originator);
		
		
		
	}
	
	public static void print(Originator o){
		System.out.println(o.getState());
	}

}
