package abstractfactory.origin1;

public abstract class AbstractYellowHuman implements Human {

	@Override
	public void getColor() {
		System.out.println("yellow");
	}

	@Override
	public void talk() {
		System.out.println("yellow human talk");
	}

	@Override
	public abstract void getSex();

}
