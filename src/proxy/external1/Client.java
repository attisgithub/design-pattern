package proxy.external1;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class Client {

	public static void main(String[] args) {
		IGamePlayer gamePlayer = new GamePlayer();
		InvocationHandler gamePlayerIH = new GamePlayerIH(gamePlayer);
		
		IGamePlayer proxy = (IGamePlayer) Proxy.newProxyInstance(gamePlayer.getClass().getClassLoader(), new Class[]{IGamePlayer.class}, gamePlayerIH);

		proxy.login();
		
	}

}
