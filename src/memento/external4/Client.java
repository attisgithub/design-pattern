package memento.external4;

import memento.external4.Originator;

public class Client {

	public static void main(String[] args) {
		
		CareTaker careTaker = new CareTaker();
		Originator originator = new Originator();
		originator.setState("original");
		print(originator);
		
		
		careTaker.setMemento(originator.createMemento());
		
		originator.setState("changed");
		print(originator);
		
		originator.restoreMemento(careTaker.getMemento());
		
		print(originator);

	}
	
	public static void print(Originator o){
		System.out.println(o.getState());
	}

}
