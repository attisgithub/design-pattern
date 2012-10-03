package template.external1;

public abstract class HummerModel {

	protected abstract void start();

	protected abstract void stop();

	protected abstract void alarm();

	protected abstract void engineBoom();

	protected void run() {
		this.start();
		this.engineBoom();
		if (this.isAlarm()) {
			this.alarm();
		}
		this.stop();
	}

	protected boolean isAlarm() {
		return true;
	}

}
