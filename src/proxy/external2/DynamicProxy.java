package proxy.external2;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class DynamicProxy {
	
	public static <T> T newProxyInstance(ClassLoader cl, Class<?>[] interfaces, InvocationHandler handler){
		if(true){
			new BeforeAdvice().execute();
		}
		return (T) Proxy.newProxyInstance(cl, interfaces, handler);
	}
	
}
