package factorymethod.external1;

public class HumanFactory {

	@SuppressWarnings("unchecked")
	public static <T extends Human> T getHuman(Class<T> clazz) {
		Human human = null;
		try {

			human = (Human) Class.forName(clazz.getName()).newInstance();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return (T) human;

	}

}
