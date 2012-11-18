package state.origin1;

public class Client {

	public static void main(String[] args) {
		Context context = new Context();
		context.setState(Context.solidState);
		context.toSolid();
		context.toGas();
	}

}
