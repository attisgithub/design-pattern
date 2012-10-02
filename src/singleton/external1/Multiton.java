package singleton.external1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Multiton {

	private static final int sizeOfIntance = 2;

	private static final List<Multiton> list = new ArrayList<Multiton>();

	static {
		for (int i = 0; i < sizeOfIntance; i++) {
			list.add(new Multiton());
			list.add(new Multiton());
		}

	}

	private Multiton() {

	}

	public static Multiton getInstance() {
		Random r = new Random();
		int index = r.nextInt(sizeOfIntance);
		return list.get(index);
	}

}
