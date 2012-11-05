package composite.external1;

import java.util.ArrayList;
import java.util.List;

public abstract class Component {
	public abstract void addComponent(Component comp);

	public abstract void removeComponent(Component comp);

	public abstract List<Component> getChildren();

	public void doSomething(){
		System.out.println("do something interesting");
	}
}
