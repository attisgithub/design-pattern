package memento.origin1;

public class Boy {

	private String state;

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Memento createMemento() {
		return new Memento(this.state);
	}

	public void changeState() {
		this.state = "sad";
	}

	public void restore(Memento memento) {
		this.setState(memento.getState());
	}
	

	
}
