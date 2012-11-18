package state.origin1;

public class LiquidState extends State {

	@Override
	public void toGas() {
		super.getContext().setState(Context.gasState);
		super.getContext().getState().toGas();
	}

	@Override
	public void toLiquid() {
		System.out.println("to liquid");

	}

	@Override
	public void toSolid() {
		super.getContext().setState(Context.solidState);
		super.getContext().getState().toSolid();
	}

}
