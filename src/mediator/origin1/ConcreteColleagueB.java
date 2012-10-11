package mediator.origin1;

public class ConcreteColleagueB extends Colleague
{

	public ConcreteColleagueB(Mediator mediator)
	{
		super(mediator);
	}
	
	public void selfMethod(){
		System.out.println("selfMethod in "+ this.getClass().getName());
	}
	
	public void dependMethod(){
		System.out.println("dependMethod in "+ this.getClass().getName());
	}

}
