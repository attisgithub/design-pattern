package iter.origin1;

public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Aggregate aggregate = new ConcreteAggregate();
		aggregate.add("333");
		aggregate.add("444");
		
		Iterator iter = aggregate.iterator();
		while(iter.hasNext()){
			System.out.println(iter.next());
		}

	}

}
