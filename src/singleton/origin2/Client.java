package singleton.origin2;

public class Client {

	public static void main(String[] args) {

		Singleton instance1 = Singleton.getInstance();
		Singleton instance2 = Singleton.getInstance();
		
		assert instance1 == instance2;
	}

}
