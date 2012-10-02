package abstractfactory.origin1;

public abstract class AbstractWhiteHuman implements Human {

	@Override
	public void getColor() {
		System.out.println("white");
	}

	@Override
	public void talk() {
		System.out.println("white human talk");

	}

	@Override
	public abstract void getSex();

}
