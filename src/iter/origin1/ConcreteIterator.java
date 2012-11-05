package iter.origin1;

import java.util.Vector;

public class ConcreteIterator implements Iterator {

	private int cursor = 0;
	
	private Vector vec = new Vector();	
	
	public ConcreteIterator(Vector vec) {
		this.vec = vec;
	}

	@Override
	public Object next() {
		Object next = null;
		if(this.hasNext()){
			next = this.vec.get(cursor++);
		}else{
			return null;
		}
		
		return next;
	}

	@Override
	public boolean hasNext() {
		if(this.vec.size() == cursor){
			return false;
		}
		return true;
	}

	@Override
	public boolean remove() {
		this.vec.remove(cursor);
		return true;
	}

}
