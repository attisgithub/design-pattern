package factorymethod.external3;

public class Client {

	public static void main(String[] args) throws SecurityException,
			NoSuchMethodException {
		
		Singleton singleton = SingletonFactory.getSingleton(Singleton.class);
		singleton.doSomething();

		Singleton singleton2 = SingletonFactory.getSingleton(Singleton.class);
		assert singleton == singleton2;

		ParamSingleton paramSingleton = SingletonFactory.getSingleton(ParamSingleton.class, new Object[] { "3" }, String.class);
		paramSingleton.doSomething();

		ParamSingleton paramSingleton2 = SingletonFactory.getSingleton(ParamSingleton.class, new Object[] { "3" }, String.class);
		assert paramSingleton == paramSingleton2;

	}

}
