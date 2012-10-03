package proxy.origin1;

public class RealGamePlayer implements IGamePlayer {

	@Override
	public void login() {
		System.out.println("player login");
	}

	@Override
	public void killBoss() {
		System.out.println("player kill boss");
	}

	@Override
	public void upgrade() {
		System.out.println("player upgrade");
	}

}
