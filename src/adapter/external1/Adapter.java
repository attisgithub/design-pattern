package adapter.external1;

public class Adapter implements Target {

	private Adaptee1 adaptee1;
	
	private Adaptee2 adaptee2;
	
	public Adaptee1 getAdaptee1() {
		return adaptee1;
	}

	public void setAdaptee1(Adaptee1 adaptee1) {
		this.adaptee1 = adaptee1;
	}

	public Adaptee2 getAdaptee2() {
		return adaptee2;
	}

	public void setAdaptee2(Adaptee2 adaptee2) {
		this.adaptee2 = adaptee2;
	}

	@Override
	public void doFirstThing() {
		this.adaptee1.doFirstThing();
	}

	@Override
	public void doSecondThing() {
		this.adaptee2.doSecondThing();
	}

}
