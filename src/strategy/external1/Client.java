package strategy.external1;

public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int a = 3;
		int b = 4;
		
		int result = Calculator.SUB.exec(a, b);
		
		System.out.println(result);
	}

}
