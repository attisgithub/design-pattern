package mediator.origin1;

public class ConcreteMediator extends Mediator
{

	@Override
	public void doSomethingA()
	{
		this.getcA().selfMethod();
	}

	@Override
	public void doSomethingB()
	{
		this.getcB().selfMethod();
	}

}
