package mediator.origin1;

public class Client
{

	public static void main(String[] args)
	{
		Mediator mediator = new ConcreteMediator();
		ConcreteColleagueA cA = new ConcreteColleagueA(mediator);
		ConcreteColleagueB cB = new ConcreteColleagueB(mediator);
		
		mediator.setcA(cA);
		mediator.setcB(cB);
		
		cA.selfMethod();
		cB.selfMethod();
		
		cA.dependMethod();
		
		
	}

}
