package visitor.origin1;

public class ConcreteElement2 extends Element {

	private String flag;
	
	public String getFlag() {
		return flag;
	}

	public void setFlag(String flag) {
		this.flag = flag;
	}

	@Override
	public void accept(IVisitor visitor) {
		visitor.visit(this);
	}

}
