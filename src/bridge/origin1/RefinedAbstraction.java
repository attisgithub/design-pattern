package bridge.origin1;

public class RefinedAbstraction extends AbstractAction {

	protected RefinedAbstraction(Implementor implementor) {
		super(implementor);
	}
	
	public void makevisit(){
		super.request();
		super.requestImpl();
	}

}
