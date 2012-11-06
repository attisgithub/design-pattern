package observer.origin1;

public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Hanfeizi hanfeizi = new Hanfeizi();
		hanfeizi.addObserver(new Lisi());
		
		hanfeizi.haveBreakfast();
		hanfeizi.haveFun();
	}

}
