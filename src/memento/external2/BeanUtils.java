package memento.external2;

import java.beans.BeanInfo;
import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class BeanUtils {

	public static HashMap<String, Object> backupProps(Object bean) {

		HashMap<String, Object> result = new HashMap<String, Object>();

		try {
			BeanInfo beanInfo = Introspector.getBeanInfo(bean.getClass());

			PropertyDescriptor[] descriptors = beanInfo
					.getPropertyDescriptors();
			for (PropertyDescriptor descriptor : descriptors) {
				String fieldName = descriptor.getName();
				if("class".equals(fieldName)){
					continue;
				}
				Method getterMethod = descriptor.getReadMethod();
				Object fieldValue = getterMethod.invoke(bean);
				result.put(fieldName, fieldValue);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

	public static void restoreProps(Object bean, HashMap<String, Object> hashMap) {
		try {

			BeanInfo beanInfo = Introspector.getBeanInfo(bean.getClass());
			PropertyDescriptor[] descriptors = beanInfo
					.getPropertyDescriptors();
			for (PropertyDescriptor descriptor : descriptors) {
				String fieldName = descriptor.getName();
				if (hashMap.containsKey(fieldName)) {
					Method setterMethod = descriptor.getWriteMethod();
					setterMethod.invoke(bean, new Object[] { hashMap.get(fieldName) });
				}

			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
