package memento.external4;

public class Originator {
	private String state;

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
	
	public Memento createMemento(){
		return new Memento(getState());
	}
	
	public void restoreMemento(IMemento memento){
		setState(((Memento)memento).getState());
	}
	
	private class Memento implements IMemento{
		private String state;

		private Memento(String state) {
			this.state = state;
		}

		public String getState() {
			return state;
		}

		public void setState(String state) {
			this.state = state;
		}
		
		
	}
}
