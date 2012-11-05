package composite.external1;

import java.util.ArrayList;
import java.util.List;

public class Composite extends Component {

	private List<Component> list = new ArrayList<Component>();
	
	@Override
	public void addComponent(Component comp) {
		list.add(comp);
	}

	@Override
	public void removeComponent(Component comp) {
		list.remove(comp);

	}

	@Override
	public List<Component> getChildren() {
		return this.list;
	}

}
