package chainofre.origin1;

public class ConcreteHandler2 extends Handler {

	@Override
	protected Level getHandleLevel() {
		return new Level(2);
	}

	@Override
	protected Response echo(Request request) {
		System.out.println("handler2");
		return null;
	}

}
