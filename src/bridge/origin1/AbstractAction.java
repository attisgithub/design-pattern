package bridge.origin1;

public abstract class AbstractAction {

	private Implementor implementor;

	protected AbstractAction(Implementor implementor) {
		this.implementor = implementor;
	}
	
	public void request(){
		System.out.println("self work");
	}

	public void requestImpl(){
		this.implementor.doSomething();
		this.implementor.doAnything();
	}
	
}
