package factorymethod.external3;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.Map;

public class SingletonFactory {

	private static final Map<String, Object> registerMap = new HashMap<String, Object>();

	@SuppressWarnings("unchecked")
	public synchronized static <T> T getSingleton(Class<T> originalclazz, Object[] initargs,
			Class<?>... constructorparams) {

		String classname = originalclazz.getName();

		Object instance = registerMap.get(classname);

		if (instance == null) {

			try {

				Constructor<T> constructor = originalclazz.getDeclaredConstructor(constructorparams);
				if (!Modifier.isPrivate(constructor.getModifiers())) {
					throw new Exception("not a singleton featured class");
				}

				constructor.setAccessible(true);
				instance = constructor.newInstance(initargs);

			} catch (Exception e) {
				e.printStackTrace();
			}
			
			registerMap.put(classname, instance);

		}

		return (T) instance;

	}

	public static <T> T getSingleton(Class<T> originalclazz) {
		return getSingleton(originalclazz, null);
	}

}
