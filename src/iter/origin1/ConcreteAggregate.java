package iter.origin1;

import java.util.Vector;

public class ConcreteAggregate implements Aggregate {

	private Vector vector = new Vector();
	
	@Override
	public void add(Object obj) {
		this.vector.add(obj);
	}

	@Override
	public void remove(Object obj) {
		this.vector.remove(obj);
	}

	@Override
	public Iterator iterator() {
		return new ConcreteIterator(this.vector);
	}

}
