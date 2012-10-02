package abstractfactory.origin1;

public class MaleHumanFactory implements HumanFactory {

	@Override
	public Human createBlackHuman() {
		return new MaleBlackHuman();
	}

	@Override
	public Human createWhiteHuman() {
		return new MaleWhiteHuman();
	}

	@Override
	public Human createYellowHuman() {
		return new MaleYellowHuman();
	}

}
