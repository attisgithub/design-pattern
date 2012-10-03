package proxy.origin2;

public class Client {

	public static void main(String[] args) {
		IGamePlayer gamePlayer = new RealGamePlayer();
		IGamePlayer proxy = gamePlayer.getProxy();
		proxy.login();
	}

}
