package adapter.origin1;

public class Adapter extends Adaptee implements Target {

	@Override
	public void request() {
		super.doSomething();
	}

}
