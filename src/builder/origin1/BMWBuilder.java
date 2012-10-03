package builder.origin1;

import java.util.List;

public class BMWBuilder extends CarBuilder {

	private BMWModel bmwModel = new BMWModel();
	
	@Override
	public void setSequence(List<String> sequence) {
		this.bmwModel.setSequence(sequence);
	}

	@Override
	public CarModel getCarModel() {
		return this.bmwModel;
	}

}
