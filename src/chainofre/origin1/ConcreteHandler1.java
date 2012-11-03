package chainofre.origin1;


public class ConcreteHandler1 extends Handler {

	@Override
	protected Level getHandleLevel() {
		return new Level(1);
	}

	@Override
	protected Response echo(Request request) {
		System.out.println("handler1");
		return null;
	}

}
