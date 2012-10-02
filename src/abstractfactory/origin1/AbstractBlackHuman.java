package abstractfactory.origin1;

public abstract class AbstractBlackHuman implements Human {

	@Override
	public void getColor() {
		System.out.println("black");
	}

	@Override
	public void talk() {
		System.out.println("black human talk");
	}

	@Override
	public abstract void getSex();
}
