package template.origin1;

public class HummerH2Model extends HummerModel {

	@Override
	protected void start() {
		System.out.println("H2 start");
	}

	@Override
	protected void stop() {
		System.out.println("H2 stop");
	}

	@Override
	protected void alarm() {
		System.out.println("H2 alarm");
	}

	@Override
	protected void engineBoom() {
		System.out.println("H2 engine boom");
	}

}
