package explain.origin1;


public abstract class SymbolExpression extends Expression {

	protected Expression left;
	protected Expression right;

	public Expression getLeft() {
		return left;
	}

	public void setLeft(Expression left) {
		this.left = left;
	}

	public Expression getRight() {
		return right;
	}

	public void setRight(Expression right) {
		this.right = right;
	}

	protected SymbolExpression(Expression left, Expression right) {
		this.left = left;
		this.right = right;
	}
}
