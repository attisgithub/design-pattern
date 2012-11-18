package state.origin1;

public class SolidState extends State {

	@Override
	public void toGas() {
		System.out.println("can not trans from solid to gas");
	}

	@Override
	public void toLiquid() {
		super.getContext().setState(Context.liquidState);
		super.getContext().getState().toLiquid();

	}

	@Override
	public void toSolid() {	
		System.out.println("to Solid");
	}

}
