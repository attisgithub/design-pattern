package composite.origin1;

public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Composite root = new Composite();
		
		Composite branch = new Composite();
		
		Leaf leaf =  new Leaf();
		
		root.addComponent(branch);
		branch.addComponent(leaf);
		
		display(root);
	}
	
	public static void display(Composite composite){
		for(Component comp: composite.getChildren()){
			if(comp instanceof Leaf){
				comp.doSomething();
			}else{
				display((Composite)comp);
			}
		}
	}

}
