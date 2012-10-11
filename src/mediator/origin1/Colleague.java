package mediator.origin1;

public abstract class Colleague
{
	protected Mediator mediator;
	
	public Colleague(Mediator mediator){
		this.mediator = mediator;
	}
}
