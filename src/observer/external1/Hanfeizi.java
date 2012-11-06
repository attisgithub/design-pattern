package observer.external1;

import java.util.Observable;

public class Hanfeizi extends Observable implements IHanfeizi {

	@Override
	public void haveBreakfast() {
		System.out.println("Hanfeizi is having breakfast");
		super.setChanged();
		super.notifyObservers();
	}

	@Override
	public void haveFun() {
		System.out.println("Hanfeizi is having fun");
		super.setChanged();
		super.notifyObservers();
	}

}
