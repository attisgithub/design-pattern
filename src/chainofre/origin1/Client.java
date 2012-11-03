package chainofre.origin1;

public class Client {

	public static void main(String[] args) {
		Handler handler1 = new ConcreteHandler1();
		Handler handler2 = new ConcreteHandler2();		
		handler1.setNext(handler2);
		
		Request request = new Request();
		request.setLevel(new Level(2));
		Response response = handler1.handleMessage(request);	
		
	}

}
