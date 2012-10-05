package proto.origin2;

import java.util.ArrayList;
import java.util.List;

public class MyObject implements Cloneable{

	private int intValue;
	
	private String strValue;
	
	private ArrayList<String> listValue = new ArrayList<String>();
	
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

	public ArrayList<String> getListValue() {
		return listValue;
	}

	public void setListValue(ArrayList<String> listValue) {
		this.listValue = listValue;
	}

	@SuppressWarnings("unchecked")
	@Override
	protected Object clone() {
		MyObject obj = null;
		try {
			obj = (MyObject) super.clone();
			obj.setListValue((ArrayList<String>) this.getListValue().clone());
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return obj;
	}

	
	
}
