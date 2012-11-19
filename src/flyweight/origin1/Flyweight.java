package flyweight.origin1;

public abstract class Flyweight {
	private String intrinsic;
	protected final String extrinsic;

	public abstract void operate();
	
	protected Flyweight(String extrinsic) {
		this.extrinsic = extrinsic;
	}

	public String getIntrinsic() {
		return intrinsic;
	}

	public void setIntrinsic(String intrinsic) {
		this.intrinsic = intrinsic;
	}
}
