package singleton.origin1;

/**
 * 
 * thread safe
 * 
 * @author Attis
 *
 */
public class Singleton {

	private static final Singleton instance = new Singleton();

	private Singleton() {

	}

	public static Singleton getInstance() {
		return instance;
	}

}
