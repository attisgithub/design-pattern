package bridge.origin1;

public class Client {

	public static void main(String[] args) {
		Implementor impl = new ConcreteImplementor1();
		RefinedAbstraction action = new RefinedAbstraction(impl);
		action.makevisit();
	}

}
