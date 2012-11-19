package explain.origin1;

import java.util.HashMap;

public class SubExpression extends SymbolExpression {

	protected SubExpression(Expression left, Expression right) {
		super(left, right);
	}

	@Override
	public int interpret(HashMap<String, Integer> hashMap) {
		return this.left.interpret(hashMap) - this.right.interpret(hashMap);
	}

}
