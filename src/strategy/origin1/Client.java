package strategy.origin1;

public class Client {

	public static void main(String[] args) {
		IStrategy strategy = new ConcreteStrategy1();
		Context context = new Context(strategy);
		context.execute();
	}

}
