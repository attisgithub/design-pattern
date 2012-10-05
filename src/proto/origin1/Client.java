package proto.origin1;

import java.util.ArrayList;
import java.util.List;

public class Client {

	public static void main(String[] args) {

		MyObject obj = new MyObject();
		obj.setIntValue(1);
		obj.setStrValue("str");
		List<String> list = new ArrayList<String>();
		list.add("7");
		obj.setIntValue(5);
		obj.setStrValue("6");
		obj.setListValue(list);

		MyObject objCopy = (MyObject) obj.clone();
		
		System.out.println(obj == objCopy);
		
		System.out.println(obj.getIntValue() == objCopy.getIntValue());
		System.out.println(obj.getStrValue() == objCopy.getStrValue());
		System.out.println(obj.getListValue() == objCopy.getListValue());

	}

}
