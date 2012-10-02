package factorymethod.origin1;

import factorymethod.external1.Human;

public class HumanFactory extends AbstractFactory {

	@SuppressWarnings("unchecked")
	@Override
	protected <T extends Human> T getHuman(Class<T> clazz) {
		Human human = null;
		try {
			human = (Human) Class.forName(clazz.getName()).newInstance();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return (T) human;
	}

}
