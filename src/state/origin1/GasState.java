package state.origin1;

public class GasState extends State {

	@Override
	public void toGas() {
		System.out.println("To gas!");
	}

	@Override
	public void toLiquid() {
		super.getContext().setState(Context.liquidState);
		super.getContext().getState().toLiquid();
	}

	@Override
	public void toSolid() {
		System.out.println("can not trans from gas to solid");
	}

}
