package proxy.external2;


public class Client {

	public static void main(String[] args) {
		Subject subject = new RealSubject();
		Subject proxy = SubjectDynamicProxy.newProxyInstance(subject);
		proxy.doSomething();
	}

}
