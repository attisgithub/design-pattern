package factorymethod.origin1;

import factorymethod.external1.Human;

public abstract class AbstractFactory {

	protected abstract <T extends Human> T getHuman(Class<T> clazz);

}
