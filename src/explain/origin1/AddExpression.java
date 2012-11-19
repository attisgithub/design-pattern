package explain.origin1;

import java.util.HashMap;

public class AddExpression extends SymbolExpression {

	protected AddExpression(Expression left, Expression right) {
		super(left, right);
	}

	@Override
	public int interpret(HashMap<String, Integer> hashMap) {
		return this.left.interpret(hashMap) + this.right.interpret(hashMap);
	}

}
