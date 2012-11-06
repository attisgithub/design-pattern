package observer.origin1;

import java.util.ArrayList;
import java.util.List;

public class Hanfeizi implements IHanfeizi, Observable {

	List<Observer> observers = new ArrayList<Observer>();
	
	@Override
	public void addObserver(Observer observer) {
		this.observers.add(observer);
	}

	@Override
	public void removeObserver(Observer observer) {
		this.observers.remove(observer);
	}

	@Override
	public void notifyObservers(Object context) {
		for(Observer observer : observers){
			observer.update(context);
		}
	}

	@Override
	public void haveBreakfast() {
		System.out.println("Hanfeizi is having breakfast");
		this.notifyObservers(new Object());
	}

	@Override
	public void haveFun() {
		System.out.println("Hanfeizi is having fun");
		this.notifyObservers(new Object());
	}

}
