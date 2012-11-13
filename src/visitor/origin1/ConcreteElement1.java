package visitor.origin1;

public class ConcreteElement1 extends Element{

	private String state;
	
	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	@Override
	public void accept(IVisitor visitor) {
		visitor.visit(this);
		
	}



}
