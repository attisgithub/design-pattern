package proxy.external2;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MyIH implements InvocationHandler {

	private Object target;
	
	public MyIH(Object target) {
		this.target = target;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		return method.invoke(this.target, args);
	}

}
