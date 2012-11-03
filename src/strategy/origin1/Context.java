package strategy.origin1;

public class Context {

	private IStrategy strategy;

	public Context(IStrategy strategy) {
		this.strategy = strategy;
	}
	
	public void execute(){
		this.strategy.doSomething();
	}
	
}
