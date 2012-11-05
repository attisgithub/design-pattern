package composite.external1;

import java.util.ArrayList;

public class Leaf extends Component {

	@Override
	public void addComponent(Component comp) {
		throw new UnsupportedOperationException();
	}

	@Override
	public void removeComponent(Component comp) {
		throw new UnsupportedOperationException();

	}

	@Override
	public ArrayList<Component> getChildren() {
		throw new UnsupportedOperationException();
	}

}
