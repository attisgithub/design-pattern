package template.origin1;

public abstract class HummerModel {

	protected abstract void start();

	protected abstract void stop();

	protected abstract void alarm();

	protected abstract void engineBoom();

	protected void run() {
		this.start();
		this.engineBoom();
		this.alarm();
		this.stop();
	}

}
