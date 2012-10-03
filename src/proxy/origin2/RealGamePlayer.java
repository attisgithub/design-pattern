package proxy.origin2;

public class RealGamePlayer implements IGamePlayer {

	private IGamePlayer proxy;

	@Override
	public void login() {
		if (this.isProxy()) {
			System.out.println("login");
		} else {
			System.out.println("please specify delegate server");
		}
	}

	@Override
	public void killBoss() {
		if (this.isProxy()) {
			System.out.println("kill boss");
		} else {
			System.out.println("please specify delegate server");
		}
	}

	@Override
	public void upgrade() {
		if (this.isProxy()) {
			System.out.println("upgrade");
		} else {
			System.out.println("please specify delegate server");
		}
	}

	@Override
	public IGamePlayer getProxy() {
		this.proxy = new ProxyGamePlayer(this);
		return this.proxy;
	}

	private boolean isProxy() {
		if (this.proxy == null) {
			return false;
		} else {
			return true;
		}
	}

}
