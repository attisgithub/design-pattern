package singleton.external1;

import java.util.HashSet;
import java.util.Set;

public class Client {

	public static void main(String[] args) {

		Set<Multiton> multitons = new HashSet<Multiton>();
		for (int i = 0; i < 100; i++) {
			multitons.add(Multiton.getInstance());
		}

		System.out.println(multitons.size());
	}

}
