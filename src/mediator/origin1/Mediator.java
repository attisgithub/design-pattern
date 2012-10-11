package mediator.origin1;

public abstract class Mediator
{
	private ConcreteColleagueA cA;
	private ConcreteColleagueB cB;
	
	public ConcreteColleagueA getcA()
	{
		return cA;
	}
	public void setcA(ConcreteColleagueA cA)
	{
		this.cA = cA;
	}
	public ConcreteColleagueB getcB()
	{
		return cB;
	}
	public void setcB(ConcreteColleagueB cB)
	{
		this.cB = cB;
	}
	
	public abstract void doSomethingA();
	
	public abstract void doSomethingB();

}
