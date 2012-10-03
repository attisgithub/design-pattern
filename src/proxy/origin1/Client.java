package proxy.origin1;

public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		IGamePlayer gamePlayer = new RealGamePlayer();
		IGamePlayer proxy = new ProxyGamePlayer(gamePlayer);
		proxy.login();
		proxy.killBoss();
		proxy.upgrade();
	}

}
