package visitor.origin1;

public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		IVisitor visitor = new Visitor();
		
		ConcreteElement1 element1 = new ConcreteElement1();
		element1.setState("full state");
		ConcreteElement2 element2 = new ConcreteElement2();
		element2.setFlag("true flag");
		
		element1.accept(visitor);
		element2.accept(visitor);
		
		
	}

}
