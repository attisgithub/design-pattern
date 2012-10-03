package builder.origin1;

import java.util.ArrayList;
import java.util.List;

public abstract class CarModel {

	private List<String> sequence = new ArrayList<String>();

	public void setSequence(List<String> sequence) {
		this.sequence = sequence;
	}

	protected abstract void start();

	protected abstract void stop();

	protected abstract void alarm();

	protected abstract void engineBoom();

	protected final void run() {
		
		for (int i = 0; i < this.sequence.size(); i++) {
			String actionName = this.sequence.get(i);
			if ("start".equals(actionName)) {
				this.start();
			} else if ("stop".equals(actionName)) {
				this.stop();
			} else if ("alarm".equals(actionName)) {
				this.alarm();
			} else if ("engine boom".equals(actionName)) {
				this.engineBoom();
			}

		}
	}

}
