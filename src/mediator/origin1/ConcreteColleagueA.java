package mediator.origin1;

public class ConcreteColleagueA extends Colleague
{

	public ConcreteColleagueA(Mediator mediator)
	{
		super(mediator);
	}
	
	public void selfMethod(){
		System.out.println("selfMethod in "+ this.getClass().getName());
	}
	
	public void dependMethod(){
		System.out.println("dependMethod in "+ this.getClass().getName());
		mediator.doSomethingB();
	}


}
