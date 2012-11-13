package visitor.origin1;

public class Visitor implements IVisitor{

	@Override
	public void visit(ConcreteElement1 ele1) {
		System.out.println(ele1.getState());
	}

	@Override
	public void visit(ConcreteElement2 ele2) {
		System.out.println(ele2.getFlag());
	}

}
