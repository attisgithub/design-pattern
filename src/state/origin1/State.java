package state.origin1;

public abstract class State {

	private Context context;

	public Context getContext() {
		return context;
	}

	public void setContext(Context context) {
		this.context = context;
	}

	public abstract void toGas();

	public abstract void toLiquid();

	public abstract void toSolid();

}
