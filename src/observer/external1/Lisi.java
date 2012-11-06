package observer.external1;

import java.util.Observable;
import java.util.Observer;

public class Lisi implements Observer {

	@Override
	public void update(Observable observable, Object obj) {
		System.out.println("discover something changed");
	}

}
