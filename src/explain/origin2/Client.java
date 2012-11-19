package explain.origin2;

import java.util.Stack;

public class Client {
	public static void main(String[] args) {
		Context ctx = new Context();
		Stack<Expression> stack = new Stack<Expression>();
		for (;;) {
			break;
		}

		Expression exp = stack.pop();
		exp.interpreter(ctx);

	}
}
