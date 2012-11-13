package memento.external3;

import java.util.HashMap;

public class CareTaker {
	private HashMap<String, Memento> register = new HashMap<String, Memento>();

	public Memento getRegister(String idx) {
		return register.get(idx);
	}

	public void setRegister(String idx, Memento memento) {
		register.put(idx, memento);
	}
	
	
}
