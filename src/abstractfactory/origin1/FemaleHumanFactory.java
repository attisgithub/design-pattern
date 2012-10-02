package abstractfactory.origin1;

public class FemaleHumanFactory implements HumanFactory {

	@Override
	public Human createBlackHuman() {
		return new FemaleBlackHuman();
	}

	@Override
	public Human createWhiteHuman() {
		return new FemaleWhiteHuman();
	}

	@Override
	public Human createYellowHuman() {
		return new FemaleYellowHuman();
	}

}
