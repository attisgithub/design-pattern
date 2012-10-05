package proto.origin1;

import java.util.List;

public class MyObject implements Cloneable{

	private int intValue;
	
	private String strValue;
	
	private List<String> listValue;
	
	public int getIntValue() {
		return intValue;
	}

	public void setIntValue(int intValue) {
		this.intValue = intValue;
	}

	public String getStrValue() {
		return strValue;
	}

	public void setStrValue(String strValue) {
		this.strValue = strValue;
	}

	public List<String> getListValue() {
		return listValue;
	}

	public void setListValue(List<String> listValue) {
		this.listValue = listValue;
	}

	@Override
	protected Object clone() {
		MyObject obj = null;
		try {
			obj = (MyObject) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return obj;
	}

	
	
}
