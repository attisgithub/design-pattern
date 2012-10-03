package proxy.external2;

import java.lang.reflect.InvocationHandler;

public class SubjectDynamicProxy extends DynamicProxy {

	public static <T> T newProxyInstance(Subject subject){
		ClassLoader cl = subject.getClass().getClassLoader();
		Class<?>[] interfaces = subject.getClass().getInterfaces();
		InvocationHandler handler = new MyIH(subject);
		return newProxyInstance(cl, interfaces, handler);
	}
	
}
