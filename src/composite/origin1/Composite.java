package composite.origin1;

import java.util.ArrayList;
import java.util.List;

public class Composite extends Component {
	
	private List<Component> list = new ArrayList<Component>();
	
	public void addComponent(Component component){
		list.add(component);
	}
	
	public void removeComponent(Component component){
		list.remove(component);
	}
	
	public List<Component> getChildren(){
		return this.list;
	}
	
}
