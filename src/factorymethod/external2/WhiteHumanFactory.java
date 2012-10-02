package factorymethod.external2;

public class WhiteHumanFactory extends AbstractFactory {

	@Override
	protected Human createHuman() {
		return new WhiteHuman();
	}

}
