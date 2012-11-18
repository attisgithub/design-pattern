package state.origin1;

public class Context {

	public final static GasState gasState = new GasState();
	public final static LiquidState liquidState = new LiquidState();
	public final static SolidState solidState = new SolidState();

	private State state;

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
		this.state.setContext(this);
	}

	public void toGas() {
		this.state.toGas();
	}

	public void toLiquid() {
		this.state.toLiquid();
	}

	public void toSolid() {
		this.state.toSolid();
	}

}
