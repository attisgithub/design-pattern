package proxy.external1;

public class GamePlayer implements IGamePlayer {

	@Override
	public void login() {
		System.out.println("login");
	}

	@Override
	public void killBoss() {
		System.out.println("kill boss");
	}

	@Override
	public void upgrade() {
		System.out.println("upgrade");
	}

}
