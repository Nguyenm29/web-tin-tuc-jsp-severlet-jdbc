package com.laptrinhjavaweb.ultils;
import java.lang.reflect.InvocationTargetException;
import javax.servlet.http.HttpServletRequest;
import org.apache.commons.beanutils.BeanUtils;
public class FormUlti {
	@SuppressWarnings("deprecation")
	public static <T> T toModel(Class<T> clazz, HttpServletRequest request) {
		T object = null;
		try {
			object = clazz.newInstance();
			BeanUtils.populate(object, request.getParameterMap());
			} catch (InvocationTargetException | InstantiationException | IllegalAccessException e) {
				System.out.println(e.getMessage());
			}
		return object;
	}
}
