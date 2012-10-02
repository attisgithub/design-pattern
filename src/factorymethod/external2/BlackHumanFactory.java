package factorymethod.external2;

public class BlackHumanFactory extends AbstractFactory {

	@Override
	public Human createHuman() {
		return new BlackHuman();
	}

}
