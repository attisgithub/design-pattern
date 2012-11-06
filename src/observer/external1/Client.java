package observer.external1;

import java.util.Observer;

public class Client {

	public static void main(String[] args) {
		Hanfeizi hanfeizi = new Hanfeizi();
		Observer lisi = new Lisi();
		hanfeizi.addObserver(lisi);
		
		hanfeizi.haveBreakfast();
	}

}
