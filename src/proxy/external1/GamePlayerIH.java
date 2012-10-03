package proxy.external1;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class GamePlayerIH implements InvocationHandler {

	private IGamePlayer gamePlayer;
	
	public GamePlayerIH(IGamePlayer gamePlayer){
		this.gamePlayer = gamePlayer;
	}
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		System.out.println("before");
		Object result = method.invoke(this.gamePlayer, args);
		System.out.println("after");
		return result;
	}

}
