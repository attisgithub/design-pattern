package proxy.external2;

public class BeforeAdvice implements IAdvice {

	@Override
	public void execute() {
		System.out.println("before Advice");
	}

}
