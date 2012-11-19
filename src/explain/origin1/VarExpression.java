package explain.origin1;

import java.util.HashMap;

public class VarExpression extends Expression {

	private String key;
	
	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public VarExpression(String key) {
		this.key = key;
	}

	@Override
	public int interpret(HashMap<String, Integer> hashMap) {
		return hashMap.get(this.key);
	}

}
