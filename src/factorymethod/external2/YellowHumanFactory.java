package factorymethod.external2;

public class YellowHumanFactory extends AbstractFactory {

	@Override
	protected Human createHuman() {
		return new YellowHuman();
	}

}
